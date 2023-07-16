import React from "react"
import ReactDOM from "react-dom"
import { render, screen, fireEvent } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import "@testing-library/jest-dom"
import App from "./App"

it("renders without crashing", () => {
  const div = document.createElement("div")
  ReactDOM.render(<App />, div)
})

test("texbox should be filtered to emoji list", async () => {
  render(<App />)
  const input = screen.getByRole("textbox")
  const emoji = "100"
  const item = screen.getByText("100")
  await userEvent.type(input, emoji)
  expect(item).toBeInTheDocument()
})

test("Emoji kopyalanabiliyor mu", () => {
  render(<App />)
  const emoji = screen.getByText("100")
  fireEvent.click(emoji)
  expect(emoji.parentElement.getAttribute("data-clipboard-text")).toMatch("💯")
})
