import { useState, useEffect } from "react"
function Counter() {
  const [number, setNumber] = useState(0)
  const [name, setName] = useState("ulaş")

  useEffect(() => {
    console.log("number state updating")
  }, [number])

  useEffect(() => {
    console.log("name state updating")
  }, [name])

  useEffect(() => {
    console.log("component mount edildi")
    const interval = setInterval(() => {
      setNumber((n) => n + 1)
    }, 2000)

    return () => clearInterval(interval)
  }, [])

  return (
    <div className="Counter">
      <h1>{number}</h1>
      <button onClick={() => setNumber(number + 1)}>Click</button>
      <hr />
      <h1>{name}</h1>
      <button onClick={() => setName("Can")}>Click</button>
    </div>
  )
}

export default Counter
