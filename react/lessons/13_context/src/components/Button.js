import { useContext } from "react"

import ThemeContext from "../context/ThemeContext"

function Button() {
  const { theme, setTheme } = useContext(ThemeContext)

  return (
    <div>
      <p>Active Theme: {theme}</p>
      <button onClick={() => setTheme(theme === "light" ? "dark" : "light")}>
        Click
      </button>
    </div>
  )
}

export default Button
