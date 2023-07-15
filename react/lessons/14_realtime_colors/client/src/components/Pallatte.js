import { useState } from "react"
import { send } from "../socketApi"
function Palatte() {
  const [color, setColor] = useState("#000000")
  const handleClick = (e) => {
    e.preventDefault()
    send(color)
    setColor("#000000")
  }
  return (
    <div className="palatte">
      <input
        type="color"
        value={color}
        onChange={(e) => setColor(e.target.value)}
      />
      <button onClick={handleClick}>Click</button>
      <p>{color}</p>
    </div>
  )
}

export default Palatte
