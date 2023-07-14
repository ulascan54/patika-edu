import { useState } from "react"
import { useUser } from "../context/UserContext"

function Profile() {
  const { user, setUser } = useUser()
  const [loading, setLoading] = useState(false)
  const handleLogin = () => {
    setLoading(true)
    setTimeout(() => {
      setLoading(false)
      setUser({ id: 1, username: "ulascan", bio: "lorem ipsum" })
    }, 1500)
  }
  return (
    <div>
      {!user && (
        <button onClick={handleLogin}>
          {loading ? "loading..." : "Login"}
        </button>
      )}
      {user && (
        <div>
          <h1>Hello {user.username}</h1>
          <p>{user.bio}</p>
          {JSON.stringify(user)}
          <button
            onClick={() => {
              setUser(null)
            }}
          >
            Logout
          </button>
        </div>
      )}
    </div>
  )
}

export default Profile
