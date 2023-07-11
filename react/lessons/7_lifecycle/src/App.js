import { useState, useEffect } from "react"
function App() {
  const [number, setNumber] = useState(0)
  const [name, setName] = useState("ulaş")

  useEffect(() => {
    console.log("number or name state updating")
  }, [number, name])

  useEffect(() => {
    console.log("name state updating")
  }, [name])

  useEffect(() => {
    console.log("component mount edildi")
  }, [])

  return (
    <div className="App">
      <h1>{number}</h1>
      <button onClick={() => setNumber(number + 1)}>Click</button>
      <hr />
      <h1>{name}</h1>
      <button onClick={() => setName("Can")}>Click</button>
    </div>
  )
}

export default App
