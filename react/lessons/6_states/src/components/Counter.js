import React from "react"
import { useState } from "react"

function Counter() {
  const [count, setCounter] = useState(0)
  const increase = () => {
    setCounter(count + 1)
  }
  return (
    <div>
      <h1>{count}</h1>
      <button onClick={increase}>+</button>
      <button onClick={() => setCounter(count - 1)}>-</button>
    </div>
  )
}

export default Counter
