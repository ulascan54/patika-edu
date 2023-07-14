import { useWeather } from "../context/WeatherContext"

function Select() {
  const { citys } = useWeather()

  return (
    <div>
      <label htmlFor="citys">Your City</label>

      <select name="citys" id="citys">
        <option value="volvo">Select</option>
        {citys.map((city) => (
          <option key={city.id} value={city.name}>
            {city.name}
          </option>
        ))}
      </select>
    </div>
  )
}

export default Select
