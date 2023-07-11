import { useState, useEffect } from "react"
import "./style.css"
function Content() {
  const [todos, setTodos] = useState([
    { name: "todo1", state: true },
    { name: "todo2", state: true },
    { name: "todo3", state: false },
    { name: "todo4", state: true },
  ])

  useEffect(() => {
    console.log(todos)
  })

  return (
    <div className="container">
      <form>
        <input
          className="toggle-new"
          type="checkbox"
          onClick={(e) => {
            console.log(e)
            const newTodos = [...todos]
            newTodos.forEach((element) => {
              if (!e.target.checked) element.state = true
              else element.state = false
            })
            setTodos([...newTodos])
          }}
        />
        <input
          className="new-todo"
          placeholder="What needs to be done?"
          autoFocus
        />
      </form>
      <ul>
        {todos.map((todo, idx) => {
          return (
            <li key={idx} className={`view ${todo.state ? "do" : "done"}`}>
              <input
                checked={!todo.state ? true : false}
                onChange={(e) => {
                  todos[idx] = {
                    name: todos[idx].name,
                    state: !todos[idx].state,
                  }
                  setTodos([...todos])
                }}
                className="toggle"
                type="checkbox"
              />
              <input
                className="toggle"
                type="text"
                value={todo.name}
                onChange={(e) => {
                  todos[idx] = { name: e.target.value, state: todos[idx].state }
                  setTodos([...todos])
                  console.log(idx)
                }}
              />
              <button
                className="delete"
                onClick={() => {
                  const newTodos = [...todos]
                  newTodos.splice(idx, 1)
                  setTodos(newTodos)
                }}
              >
                X
              </button>
            </li>
          )
        })}
      </ul>
    </div>
  )
}

export default Content
