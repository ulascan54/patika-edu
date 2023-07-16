import logo from "./logo.svg"
import "./App.css"
import { Button } from "6hw-buttons-ulas"
import "6hw-buttons-ulas/dist/index.css"
function App() {
  return (
    <div className="App">
      <Button text="click" type="primary" />
      <Button text="click" type="text" />
      <Button text="click" type="link" />
      <Button text="click" type="default" />
      <Button text="click" type="dashed" />
    </div>
  )
}

export default App
