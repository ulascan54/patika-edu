import slugify from "slugify"
import {hello,topla} from "./my-module.js"
const title="some string"
console.log(slugify(title,"*"))

console.log(topla(2,3))
hello("name")