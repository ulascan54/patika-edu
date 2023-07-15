import { useState } from "react"
import styles from "./styles.module.css"

function ChatForm() {
  const [message, setMessage] = useState("")
  const handleSubmit = (e) => {
    e.preventDefault()
    console.log(message)

    setMessage("")
  }

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input
          value={message}
          onChange={(e) => setMessage(e.target.value)}
          className={styles.textInput}
        />
      </form>
    </div>
  )
}

export default ChatForm
