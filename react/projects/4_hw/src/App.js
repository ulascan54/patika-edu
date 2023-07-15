import "./App.css"
import { WeatherProvider } from "./context/WeatherContext"
import Select from "./component/Select"
import Detail from "./component/Detail"
function App() {
  return (
    <WeatherProvider>
      <div className="App">
        <Select />
        <Detail />
      </div>
    </WeatherProvider>
  )
}

export default App
