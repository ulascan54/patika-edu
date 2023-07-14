import "./App.css"
import { WeatherProvider } from "./context/WeatherContext"
import Select from "./component/Select"
import Detail from "./component/Detail"
function App() {
  return (
    <WeatherProvider>
      <Select />
      <Detail />
    </WeatherProvider>
  )
}

export default App
