import "./App.css"
import { Formik } from "formik"

function App() {
  return (
    <div className="App">
      <h1>Sign Up</h1>
      <Formik
        initialValues={{
          firstName: "",
          lastName: "",
          email: "",
        }}
        onSubmit={(values) => {
          console.log(values)
        }}
      >
        {({ handleSubmit, handleChange }) => (
          <form onSubmit={handleSubmit}>
            <label htmlFor="firstName">First Name</label>
            <input name="firstName" onChange={handleChange} />

            <label htmlFor="lastName">Last Name</label>
            <input name="lastName" onChange={handleChange} />

            <label htmlFor="email">Email</label>
            <input name="email" type="email" onChange={handleChange} />

            <button type="submit">Submit</button>
          </form>
        )}
      </Formik>
    </div>
  )
}

export default App
