import PropTypes from "prop-types"

function User({ name, surName, isLoggedIn, age, friends, address }) {
  if (!isLoggedIn) {
    return <div>Giriş yapmadınız</div>
  }

  return (
    <>
      <h1>{name + " " + surName + " " + age}</h1>
      {address.title}
      <br />
      {address.zip}
      {friends && friends.map((item) => <div key={item.id}>{item.name}</div>)}
    </>
  )
}

User.propTypes = {
  name: PropTypes.string.isRequired,
  surName: PropTypes.string.isRequired,
  isLoggedIn: PropTypes.bool.isRequired,
  age: PropTypes.oneOfType([PropTypes.number, PropTypes.string]).isRequired,
  friends: PropTypes.array,
  address: PropTypes.shape({
    title: PropTypes.string,
    zip: PropTypes.number,
  }),
}

User.defaultProps = {
  isLoggedIn: false,
  name: "kullanıcı",
}

export default User
