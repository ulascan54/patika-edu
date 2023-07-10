import React from "react"
import { useState } from "react"
function InputExample() {
  const [form, setForm] = useState({ name: "Ulas", surname: "Can" })

  const onChangeInput = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value })
  }

  return (
    <div>
      Please enter your name <br />
      <input name="name" value={form.name} onChange={onChangeInput} />
      <br />
      Please enter your surname <br />
      <input name="surname" value={form.surname} onChange={onChangeInput} />
      <br />
      {form.name} {form.surname}
    </div>
  )
}

export default InputExample
