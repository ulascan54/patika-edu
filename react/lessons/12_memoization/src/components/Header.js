import { memo } from "react"

function Header({ count, data }) {
  console.log("Header re-rednered")
  return (
    <div>
      <p>Header - {count}</p>
      <code>{JSON.stringify(data)}</code>
    </div>
  )
}

export default memo(Header)
