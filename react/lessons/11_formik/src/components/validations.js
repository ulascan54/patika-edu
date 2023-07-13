import * as yup from "yup"

const validations = yup.object({
  email: yup.string().email().required(),
  password: yup.string().required().min(5),
  passwordConfirm: yup
    .string()
    .oneOf([yup.ref("password")])
    .required(),
})

export default validations
