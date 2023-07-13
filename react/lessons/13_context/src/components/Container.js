import React from "react"
import Header from "./Header"
import Button from "./Button"
import { useContext } from "react"
import ThemeContext from "../context/ThemeContext"
function Container() {
  const { theme } = useContext(ThemeContext)
  return (
    <div className={`App ${theme === "dark" ? theme : ""}`}>
      <Header />
      <Button />
    </div>
  )
}

export default Container
