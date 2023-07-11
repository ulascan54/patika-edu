import "./style.css"
import { useState, useEffect } from "react"
function Footer({ todos, setTodos }) {
  const [active, setActive] = useState("all")
  const [store, setStore] = useState(todos)
  const [isVisble, setIsVisble] = useState(true)
  useEffect(() => {
    if (todos.filter((e) => !e.state).length === 0) {
      setIsVisble(false)
    } else setIsVisble(true)
  }, [store, todos])
  return (
    <div className="container-footer">
      <p>{todos.filter((item) => item.state).length} items left</p>
      <div>
        <button
          className={`footer-p ${active === "all" ? "active" : ""}`}
          onClick={() => {
            setActive("all")
            setTodos(store)
          }}
        >
          All
        </button>
        <button
          className={`footer-p ${active === "ac" ? "active" : ""}`}
          onClick={() => {
            setActive("ac")
            const newArray = store.filter((e) => e.state)
            setTodos(newArray)
          }}
        >
          Active
        </button>
        <button
          className={`footer-p ${active === "com" ? "active" : ""}`}
          onClick={() => {
            setActive("com")
            const newArray = store.filter((e) => !e.state)
            setTodos(newArray)
          }}
        >
          Complated
        </button>
      </div>
      {isVisble ? (
        <p
          className="footer-right"
          onClick={() => {
            const newArray = store.filter((e) => e.state)
            setTodos(newArray)
            setStore(newArray)
          }}
        >
          Clear Complated
        </p>
      ) : (
        false
      )}
    </div>
  )
}

export default Footer
