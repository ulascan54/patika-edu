import { useEffect } from "react"
import { useWeather } from "../context/WeatherContext"
function Detail() {
  const iconUrl = process.env.REACT_APP_API_WEATHER_ICON
  const days = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Saturday",
    "Sunday",
  ]
  const { weatherData } = useWeather()
  useEffect(() => {
    console.log("weatherData:", weatherData)
  }, [weatherData])
  return (
    <div>
      {weatherData && (
        <div>
          <h2>Weather Details</h2>
          <div className="weather-container">
            {days.map((day, i) => (
              <div key={i} className="weather-day">
                <h3>{day}</h3>
                <img
                  src={`${iconUrl}${weatherData[i].weather[0].icon}@2x.png`}
                  alt=""
                />
              </div>
            ))}
          </div>
        </div>
      )}
    </div>
  )
}

export default Detail
