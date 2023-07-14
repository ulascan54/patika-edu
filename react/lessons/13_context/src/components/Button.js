import { useTheme } from "../context/ThemeContext"

function Button() {
  const { theme, setTheme } = useTheme()

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
