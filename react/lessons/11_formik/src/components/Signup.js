import React from "react"
import { useFormik } from "formik"
import validations from "./validations"
function Signup() {
  const { handleSubmit, handleChange, values } = useFormik({
    initialValues: {
      email: "",
      password: "",
      passwordConfirm: "",
    },
    onSubmit: (values) => {
      console.log(values)
    },
    validationSchema: validations,
  })
  return (
    <div>
      <div>
        <h1>Sign Up</h1>
        <form onSubmit={handleSubmit}>
          {/* <div>
            <label htmlFor="firstName">First Name:</label>
            <input
              name="firstName"
              onChange={handleChange}
              value={values.firstName}
            />
          </div>
          <div>
            <label htmlFor="lastName">Last Name:</label>
            <input
              name="lastName"
              onChange={handleChange}
              value={values.lastName}
            />
          </div> */}
          <div>
            <label htmlFor="email">Email:</label>
            <input name="email" onChange={handleChange} value={values.email} />
          </div>
          <div>
            <label htmlFor="password">Password:</label>
            <input
              name="password"
              type="password"
              onChange={handleChange}
              value={values.password}
            />
          </div>
          <div>
            <label htmlFor="passwordConfirm">Password Confirm:</label>
            <input
              name="passwordConfirm"
              type="passwordConfirm"
              onChange={handleChange}
              value={values.passwordConfirm}
            />
          </div>
          {/* <div>
            <label htmlFor="gender">Gender:</label>
            <input
              name="gender"
              type="radio"
              value="male"
              checked={values.gender === "male"}
              onChange={handleChange}
            />
            Male
            <input
              name="gender"
              type="radio"
              value="female"
              checked={values.gender === "female"}
              onChange={handleChange}
            />
            Female
          </div>
          <div>
            <label htmlFor="hobies">Hobies:</label>
            <input
              name="hobies"
              type="checkbox"
              value="futbol"
              checked={values.hobies.includes("futbol")}
              onChange={handleChange}
            />
            Futbol
            <br />
            <input
              name="hobies"
              type="checkbox"
              value="foto"
              checked={values.hobies.includes("foto")}
              onChange={handleChange}
            />
            Fotoğrafçılık
            <br />
            <input
              name="hobies"
              type="checkbox"
              value="sinema"
              checked={values.hobies.includes("sinema")}
              onChange={handleChange}
            />
            Sinema
            <br />
          </div>
          <div>
            <label htmlFor="country">Country:</label>
            <select
              name="country"
              onChange={handleChange}
              value={values.country}
            >
              <option value="">Select</option>
              <option value="Turkey">Turkey</option>
              <option value="Germany">Germany</option>
              <option value="Russia">Russia</option>
              <option value="Ukraine">Ukraine</option>
              <option value="Canada">Canada</option>
            </select>
          </div> */}
          <div className="btn">
            <button type="submit">Submit</button>
          </div>
          <br />
          <p>{JSON.stringify(values)}</p>
        </form>
      </div>
    </div>
  )
}

export default Signup
