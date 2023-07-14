import { createContext, useState, useEffect, useContext } from "react"
import axios from "axios"

const WeatherContext = createContext()

const WeatherProvider = ({ children }) => {
  const baseUrlGeo = process.env.REACT_APP_BASEURL_GEO
  const baseUrlWeather = process.env.REACT_APP_BASEURL_WEATHER
  const apiKey = process.env.REACT_APP_API_KEY
  const [citys, setCitys] = useState([])
  const [selectedCity, setSelectedCity] = useState("istanbul")
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
    axios(`${baseUrlGeo}/1.0/direct?q=${selectedCity}&limit=5&appid=${apiKey}`)
      .then((res) => {
        console.log(res.data)
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
  }, [selectedCity])

  useEffect(() => {
    axios(`${baseUrlWeather}?q=${cityDetails.name}&appid=${apiKey}&lang=TR`)
      .then((res) => {
        const newArray = res.data.list.splice(0, 7)
        setWeatherData(newArray)
      })
      .catch((err) => console.log(err))
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
