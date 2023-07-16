import { render, screen } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import "@testing-library/jest-dom"
import App from "./App"

test("emoji list should be rendered", () => {
  render(<App />)
  const items = screen.getAllByText(/click/i)
  expect(items.length).toEqual(20)
})
