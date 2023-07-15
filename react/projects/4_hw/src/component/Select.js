import { useWeather } from "../context/WeatherContext"

function Select() {
  const { citys, setSelectedCity } = useWeather()
  const handleChange = (e) => {
    setSelectedCity(e.target.value)
  }
  return (
    <div>
      <label htmlFor="citys">Select Your City : </label>

      <select name="citys" id="citys" onChange={handleChange}>
        <option value="null">Select</option>
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
