import "./App.css"
import User from "./components/User"

const friends = [
  { name: "ali", id: 1 },
  { name: "ahmet", id: 2 },
  { name: "ayşe", id: 3 },
  { name: "fatma", id: 4 },
]

function App() {
  return (
    <>
      <User
        name="Ulas"
        surName="Can"
        isLoggedIn={true}
        age={29}
        friends={friends}
      />
    </>
  )
}

export default App
