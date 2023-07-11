import { useState, useEffect } from "react"
import "./style.css"
import Footer from "../Footer"
function Content() {
  const [newTodo, setNewTodo] = useState({ name: "", state: "" })
  const [todos, setTodos] = useState([
    { name: "Taste JavaScript", state: false },
    { name: "Code furiously", state: false },
    { name: "Promote Mavo", state: true },
    { name: "Give talks", state: true },
    { name: "Write tutorials", state: true },
    { name: "Have a life!", state: false },
  ])

  return (
    <div className="container">
      <form
        onSubmit={(e) => {
          e.preventDefault()
          if (newTodo.name === "" || newTodo.state === "") return false
          setTodos([...todos, newTodo])
          setNewTodo({ name: "", state: "" })
        }}
      >
        <input
          className="toggle-new"
          type="checkbox"
          onClick={(e) => {
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
          value={newTodo.name}
          onChange={(e) => {
            setNewTodo({ name: e.target.value, state: true })
          }}
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
      <Footer todos={todos} setTodos={setTodos} />
    </div>
  )
}

export default Content
