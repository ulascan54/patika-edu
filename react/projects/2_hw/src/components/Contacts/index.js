import { useState, useEffect } from "react"
import List from "./List"
import Form from "./Form"
import "./styles.css"
function Contacts() {
  const [contacts, setContacts] = useState([
    { fullname: "ulaş", phone_number: 22313213 },
    { fullname: "can", phone_number: 22313213 },
    { fullname: "demir", phone_number: 22313213 },
  ])
  useEffect(() => {
    console.log(contacts)
  }, [contacts])
  return (
    <div id="container">
      <h1> My Contacts</h1>
      <List contacts={contacts} />
      <Form addContact={setContacts} contacts={contacts} />
    </div>
  )
}

export default Contacts
