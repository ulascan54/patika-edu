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
          {parseInt(id) > 1 && (
            <Link to={`/users/${parseInt(id) + -1}`}>Previus User</Link>
          )}
          {parseInt(id) < 10 && (
            <Link to={`/users/${parseInt(id) + 1}`}>Next User</Link>
          )}
        </div>
      )}
    </div>
  )
}

export default User
