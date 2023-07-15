import styles from "./styles.module.css"
import ScrollableFeed from "react-scrollable-feed"

import { useChat } from "../context/ChatContext"
import ChatItem from "./ChatItem"
function ChatList() {
  const { messages } = useChat()
  return (
    <div className={styles.chatlist}>
      <ScrollableFeed forceScroll={true}>
        {messages.map((item, key) => (
          <ChatItem key={key} item={item} />
        ))}
      </ScrollableFeed>
    </div>
  )
}

export default ChatList
