import { useWeather } from "../context/WeatherContext"
function Detail() {
  const iconUrl = process.env.REACT_APP_API_WEATHER_ICON
  const days = [
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday",
  ]
  let currentDays = []
  const d = new Date(Date.now())
  const dayName = days[d.getDay() - 1]
  days.forEach((element, idx) => {
    if (element === dayName) {
      for (let i = idx; i < 7; i++) {
        currentDays.push(days[i])
      }
      for (let i = 0; i < idx; i++) {
        currentDays.push(days[i])
      }
    }
  })

  const { weatherData, selectedCity } = useWeather()

  return (
    <div>
      {weatherData && selectedCity !== "null" && (
        <div>
          <h2>
            {selectedCity.charAt(0).toUpperCase() + selectedCity.slice(1)}{" "}
            Weather Details
          </h2>
          <div className="weather-container">
            {currentDays.map((day, i) => {
              const wd = weatherData[i].weather[0]
              const deg = weatherData[i].wind
              return (
                <div
                  key={i}
                  className={`weather-day ${dayName === day ? "active" : ""}`}
                >
                  <h3>{day}</h3>
                  <img src={`${iconUrl}${wd.icon}@2x.png`} alt="" />
                  <p>Durum: {wd.description}</p>
                  <p>
                    Derece:{" "}
                    <strong>
                      {JSON.stringify(deg.deg)[0] + JSON.stringify(deg.deg)[1]}°
                    </strong>
                  </p>
                </div>
              )
            })}
          </div>
        </div>
      )}
    </div>
  )
}

export default Detail
