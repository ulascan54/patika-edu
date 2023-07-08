import {getUsersAndPost} from './myfunctions.js'


const result = getUsersAndPost(1)
result.then((r)=>console.log('result:', r))