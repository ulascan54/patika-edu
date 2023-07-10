import PropTypes from "prop-types"

function User({ name, surName, isLoggedIn, age, friends }) {
  return (
    <>
      <h1>
        {isLoggedIn ? name + " " + surName + " " + age : "giriş yapmadınız"}
      </h1>
      {friends.map((item) => (
        <div key={item.id}>{item.name}</div>
      ))}
    </>
  )
}

User.propTypes = {
  name: PropTypes.string,
  surName: PropTypes.string,
  isLoggedIn: PropTypes.bool,
  age: PropTypes.number,
  friends: PropTypes.array,
}

export default User
