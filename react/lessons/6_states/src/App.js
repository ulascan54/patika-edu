import { useState } from "react"

function App() {
  const [name, setName] = useState("Ulas")
  const [age, setAge] = useState(18)

  return (
    <div className="App">
      <h1>Merhaba {name}</h1>
      <h2>{age}</h2>
      <button onClick={() => setName("Can")}>Click</button>
      <button onClick={() => setAge(25)}>chenge age</button>
    </div>
  )
}

export default App
