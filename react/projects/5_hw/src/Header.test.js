import { render, screen } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import Header from "./Header"
import "@testing-library/jest-dom"

test("renders headers", () => {
  render(<Header />)
  const header = screen.getByText(/Emoji Search/i)
  expect(header).toBeInTheDocument()
})
