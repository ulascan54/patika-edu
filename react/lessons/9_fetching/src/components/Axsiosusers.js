import { useEffect, useState } from "react"
import axios from "axios"
function Axiosusers() {
  const [users, setUsers] = useState([])
  const [isLoading, setIsLoading] = useState(true)
  useEffect(() => {
    axios("https://jsonplaceholder.typicode.com/users/")
      .then((res) => {
        setUsers(res.data)
      })
      .catch((err) => {
        console.log(err)
      })
      .finally(() => {
        setIsLoading(false)
      })
  }, [])
  return (
    <div>
      <h1>Users</h1>
      {isLoading && <div>Loading...</div>}

      {users.map((user) => (
        <div key={user.id}>{user.name}</div>
      ))}
    </div>
  )
}

export default Axiosusers
