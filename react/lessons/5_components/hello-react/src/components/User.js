function User({name, surName , isLoggedIn, age}){
    return <h1>{isLoggedIn ? name +" "+ surName +" "+ age
                : "giriş yapmadınız"}</h1>
}

export default User