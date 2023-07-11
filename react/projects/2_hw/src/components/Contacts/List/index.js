import { useState } from "react"

function List({ contacts }) {
  const [filterText, setFilterText] = useState("")

  const filtered = contacts.filter((item) => {
    return Object.keys(item).some((key) => {
      return item[key]
        .toString()
        .toLowerCase()
        .includes(filterText.toLocaleLowerCase())
    })
  })
  console.log(filtered)
  return (
    <div>
      <input
        type="text"
        placeholder="Filter Contacts"
        value={filterText}
        onChange={(e) => setFilterText(e.target.value)}
      />
      <ul>
        {filtered.map((contact, i) => (
          <li key={i}>
            {contact.fullname} | {contact.phone_number}
          </li>
        ))}
      </ul>
    </div>
  )
}

export default List
