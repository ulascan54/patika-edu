import Counter from "./components/Counter"
import { useState } from "react"

function App() {
  const [isVisible, setIsVisible] = useState(true)
  return (
    <div className="App">
      {isVisible && <Counter />}
      <button onClick={() => setIsVisible(!isVisible)}>Toggle</button>
    </div>
  )
}

export default App
