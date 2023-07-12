import React from "react"
import { useParams, Link } from "react-router-dom"
import { useState, useEffect } from "react"
import axios from "axios"

function User() {
  const [loading, setLoading] = useState(true)
  const [user, setUser] = useState({})
  const { id } = useParams()
  useEffect(() => {
    axios(`https://jsonplaceholder.typicode.com/users/${id}`)
      .then((res) => setUser(res.data))
      .finally(() => {
        setLoading(false)
      })
  }, [id])

  return (
    <div>
      <h2>User details</h2>
      {loading && <div>Loading ....</div>}
      {!loading && (
        <div>
          id: <strong>{id}</strong>
          <code>{JSON.stringify(user)}</code>
          <br />
          <Link to={`/user/${parseInt(id) + 1}`}>
            Next User (id:{parseInt(id) + 1})
          </Link>
        </div>
      )}
    </div>
  )
}

export default User
