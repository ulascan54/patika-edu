import { memo } from "react"

function Header({ count, increment }) {
  console.log("Header re-rednered")
  return (
    <div>
      <p>Header - {count}</p>
      <button onClick={increment}>click</button>

      {/* <code>{JSON.stringify(data)}</code> */}
    </div>
  )
}

export default memo(Header)
