import { createContext, useState, useEffect, useContext } from "react"
import axios from "axios"

const WeatherContext = createContext()

const WeatherProvider = ({ children }) => {
  const [citys, setCitys] = useState([])
  useEffect(() => {
    axios("https://turkiyeapi.cyclic.app/api/v1/provinces/")
      .then((res) => {
        setCitys(res.data.data)
      })
      .catch((err) => {
        console.log(err)
      })
      .finally(() => {})
  }, [])

  const values = {
    citys,
  }
  return (
    <WeatherContext.Provider value={values}>{children}</WeatherContext.Provider>
  )
}

const useWeather = () => useContext(WeatherContext)

export { useWeather, WeatherProvider }
