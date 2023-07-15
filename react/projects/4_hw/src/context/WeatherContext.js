import { createContext, useState, useEffect, useContext } from "react"
import axios from "axios"

const WeatherContext = createContext()

const WeatherProvider = ({ children }) => {
  const [selectedCity, setSelectedCity] = useState(null)

  if (navigator.geolocation && selectedCity === null) {
    navigator.geolocation.getCurrentPosition(function (position) {
      const lat = position.coords.latitude
      const long = position.coords.longitude

      const url = "https://geocode.xyz/" + lat + "," + long + "?json=1"
      const xhr = new XMLHttpRequest()
      xhr.open("GET", url, true)
      xhr.onload = function () {
        if (xhr.status == 200) {
          const response = JSON.parse(xhr.responseText)
          const city = response.city
          if (city !== "Throttled! See geocode.xyz/pricing") {
            setSelectedCity(city)
          }
        }
      }
      xhr.send()
    })
  }

  const baseUrlGeo = process.env.REACT_APP_BASEURL_GEO
  const baseUrlWeather = process.env.REACT_APP_BASEURL_WEATHER
  const apiKey = process.env.REACT_APP_API_KEY
  const [citys, setCitys] = useState([])
  const [cityDetails, setCityDetails] = useState({
    lat: "",
    lon: "",
  })
  const [weatherData, setWeatherData] = useState()
  useEffect(() => {
    axios("https://turkiyeapi.cyclic.app/api/v1/provinces/")
      .then((res) => {
        setCitys(res.data.data)
      })
      .catch((err) => {
        console.log(err)
      })
  }, [])
  useEffect(() => {
    if (selectedCity !== null || selectedCity !== "null") {
      axios(
        `${baseUrlGeo}/1.0/direct?q=${selectedCity}&limit=5&appid=${apiKey}`
      )
        .then((res) => {
          res.data.forEach((element) => {
            if (element.country === "TR") {
              setCityDetails({
                name: selectedCity,
                lat: element.lat,
                lon: element.lon,
              })
            }
          })
        })
        .catch((err) => {
          console.log(err)
        })
    }
  }, [selectedCity])

  useEffect(() => {
    if (cityDetails.name !== undefined) {
      axios(`${baseUrlWeather}?q=${cityDetails.name}&appid=${apiKey}&lang=TR`)
        .then((res) => {
          const newArray = res.data.list.splice(0, 7)
          setWeatherData(newArray)
        })
        .catch((err) => console.log(err))
    }
  }, [cityDetails, selectedCity])

  const values = {
    citys,
    selectedCity,
    setSelectedCity,
    weatherData,
  }
  return (
    <WeatherContext.Provider value={values}>{children}</WeatherContext.Provider>
  )
}

const useWeather = () => useContext(WeatherContext)

export { useWeather, WeatherProvider }
