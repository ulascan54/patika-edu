import io from "socket.io-client"

let socket

export const init = () => {
  console.log("connecting....")
  socket = io("http://localhost:3000", {
    transports: ["websocket"],
  })
  socket.on("connect", () => console.log("connected!"))
}

export const sendMessage = (message) => {
  if (socket) socket.emit("new-message", message)
}

export const subscribeNewChat = (cb) => {
  if (!socket) return
  socket.on("receive-message", (message) => {
    console.log("new message:", message)
    cb(message)
  })
}

export const subscribeInitialMessages = (cb) => {
  if (!socket) return
  socket.on("message-list", (messages) => {
    console.log("Initial message:", messages)
    cb(messages)
  })
}
