import { render, screen } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import Counter from "."

describe("counter tests", () => {
  let count, increaseBtn, decreaseBtn
  beforeEach(() => {
    console.log("birkere çalışcak")

    render(<Counter />)
    count = screen.getByText("0")
    increaseBtn = screen.getByText("Increase")
    decreaseBtn = screen.getByText("Decrease")
  })

  beforeAll(() => {
    console.log("birkere çalışcak")
  })

  afterEach(() => {})
  afterAll(() => {})

  test("increase btn", async () => {
    await userEvent.click(increaseBtn)
    expect(count).toHaveTextContent("1")
  })

  test("decrease btn", async () => {
    await userEvent.click(decreaseBtn)
    expect(count).toHaveTextContent("-1")
  })
})
