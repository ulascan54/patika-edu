import React from "react"
import ReactDOM from "react-dom"
import { render, screen } from "@testing-library/react"
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
  const item = screen.getByText(/100/i)
  await userEvent.type(input, emoji)
  expect(item).toBeInTheDocument()
})
