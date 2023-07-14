import "./App.css"
import { WeatherProvider } from "./context/WeatherContext"
import Select from "./component/Select"
function App() {
  return (
    <WeatherProvider>
      <Select />
    </WeatherProvider>
  )
}

export default App
