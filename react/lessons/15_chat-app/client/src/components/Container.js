import React from "react"
import ChatForm from "./ChatForm"
import ChatList from "./ChatList"
import { init } from "../socketApi"
import { useEffect } from "react"

function Container() {
  useEffect(() => {
    init()
  }, [])
  return (
    <div className="App">
      <ChatList />
      <ChatForm />
    </div>
  )
}

export default Container
