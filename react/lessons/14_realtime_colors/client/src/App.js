import "./App.css"
import { useEffect } from "react"
import { init } from "./socketApi.js"
import Palatte from "./components/Pallatte"

function App() {
  useEffect(() => {
    init()
  }, [])
  return (
    <div className="App">
      <Palatte />
    </div>
  )
}

export default App
