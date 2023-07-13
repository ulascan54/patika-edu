import "./App.css"
import { useState } from "react"
import Header from "./components/Header"

function App() {
  const [count, setCount] = useState(0)
  return (
    <div className="App">
      <Header count={count < 5 ? 0 : count} />
      <hr />
      <h2>{count}</h2>
      <button onClick={() => setCount(count + 1)}>click</button>
    </div>
  )
}

export default App
