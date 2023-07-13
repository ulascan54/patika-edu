import "./App.css"
import { useState, useMemo, useCallback } from "react"
import Header from "./components/Header"

function App() {
  const [count, setCount] = useState(0)
  const [text, setText] = useState("")
  const increment = useCallback(() => {
    setCount((prevState) => prevState + 1)
  }, [])

  // const data = useMemo(() => {
  //   return [{ name: "ulas", count }]
  // }, [count])
  // const data =  calculateObject()
  // const data = useMemo(() => {
  //   calculateObject()
  // }, [])
  return (
    <div className="App">
      <Header count={count < 5 ? 0 : count} increment={increment} />
      <hr />
      <h2>{count}</h2>

      <input value={text} onChange={({ target }) => setText(target.value)} />
    </div>
  )
}

// function calculateObject() {
//   console.log("calculating...")
//   for (let i = 0; i < 10000000; i++) {}
//   console.log("calculating complate...")
//   return { name: "ulas" }
// }

export default App
