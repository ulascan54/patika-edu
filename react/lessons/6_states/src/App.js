import { useState } from "react"

function App() {
  const [name, setName] = useState("Ulas")
  const [age, setAge] = useState(18)
  const [friends, setFriends] = useState(["ulas", "can"])
  return (
    <div className="App">
      <h1>Merhaba {name}</h1>
      <h2>{age}</h2>
      <button onClick={() => setName("Can")}>Click</button>
      <button onClick={() => setAge(25)}>chenge age</button>
      <hr />
      <br />
      <br />
      <h2>Friends</h2>
      {friends.map((friend) => (
        <div>{friend}</div>
      ))}
      <button onClick={() => setFriends([...friends, "ayşe"])}>
        newfriend
      </button>
    </div>
  )
}

export default App
