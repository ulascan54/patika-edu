import axios from 'axios'

const getUsersAndPost = async (id)=> {
    const  {data:user} = await axios('https://jsonplaceholder.typicode.com/users/'+id)
    const  {data:post} = await axios('https://jsonplaceholder.typicode.com/posts/'+id)
    return {
        user:user,
        post:post
    }
}



export {
    getUsersAndPost
}