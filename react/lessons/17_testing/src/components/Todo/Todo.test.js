import { render, screen } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import Todo from "."

describe("Todo testleri", () => {
  let btn, input
  beforeEach(() => {
    render(<Todo />)
    btn = screen.getByRole("button")
    input = screen.getByRole("textbox")
  })

  test("varsayılan verilen 3 text render olmalı", () => {
    const items = screen.getAllByText(/item/i)

    expect(items.length).toEqual(3)
  })

  test("Input ve button dökümanda olmalı", () => {
    expect(input).toBeInTheDocument()
    expect(btn).toBeInTheDocument()
  })
  test("inputa string girilip butona basılınca listeye eklenmeli", async () => {
    const name = "mehmet"
    userEvent.type(input, name)
    await userEvent.click(btn)

    expect(screen.getByText(name)).toBeInTheDocument()
  })
})
