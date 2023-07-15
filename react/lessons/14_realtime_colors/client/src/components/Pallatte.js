import { useState } from "react"
import { send } from "../socketApi"
function Palatte({ activeColor }) {
  const [color, setColor] = useState("#000000")
  const handleClick = (e) => {
    e.preventDefault()
    send(color)
    setColor(activeColor)
  }
  return (
    <div className="palatte">
      <input
        type="color"
        value={activeColor}
        onChange={(e) => setColor(e.target.value)}
      />
      <button onClick={handleClick}>Click</button>
    </div>
  )
}

export default Palatte
