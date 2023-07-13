import { memo } from "react"

function Header({ count }) {
  console.log("Header re-rednered")
  return <div>Header - {count}</div>
}

export default memo(Header)
