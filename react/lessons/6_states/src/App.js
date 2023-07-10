import { useState } from "react"

function App() {
  const [name, setName] = useState("Ulas")
  const [age, setAge] = useState(18)
  const [friends, setFriends] = useState(["ulas", "can"])
  const [address, setAddress] = useState({ title: "Ist", zip: 213123 })
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
      <hr />
      <br />
      <br />
      <h2>address</h2>
      <div>
        {address.title} {address.zip}
      </div>
      <button onClick={() => setAddress({ ...address, title: "miami" })}>
        set adress
      </button>
    </div>
  )
}

export default App
