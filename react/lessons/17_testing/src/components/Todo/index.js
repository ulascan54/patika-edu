import { useState } from "react"
const defaultTodos = [
  { name: "Item 1" },
  { name: "Item 2" },
  { name: "Item 3" },
]
function Todo() {
  const [text, setText] = useState("")
  const [todo, setTodo] = useState(defaultTodos)
  const addTodo = () => {
    setTodo((prevState) => [...prevState, { name: text }])
    setText("")
  }
  return (
    <div>
      <input
        value={text}
        onChange={(e) => setText(e.target.value)}
        type="textbox"
      />
      <button onClick={addTodo}>Add</button>

      {todo.map((item, index) => (
        <div key={index}>{item.name}</div>
      ))}
    </div>
  )
}

export default Todo
