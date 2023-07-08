import axios from 'axios'

// (async ()=>{
//     const {data:users} = await axios(
//         'https://jsonplaceholder.typicode.com/users'
//     )
//     const {data:post1} = await axios(
//         'https://jsonplaceholder.typicode.com/posts/1'
//     )
//     const {data:post2} = await axios(
//         'https://jsonplaceholder.typicode.com/posts/2'
//     )

//     console.log("users",users)
//     console.log("post1",post1)
//     console.log("post2",post2)
// })()


// const getComments = (n) => {
//     return new Promise((resolve,reject)=>{
//         if(n==1){
//             resolve("comment")
//         }
//             reject("bir porblem oluştu")
//     })
// }


// getComments(2).then((data)=> console.log(data,"bitti")).catch(e=>console.log(e))



const getUsers = (n) => {
    return new Promise(async (resolve,reject)=>{
        const {data} = await axios(
            'https://jsonplaceholder.typicode.com/users'
        )
        resolve(data)
    })
}

const getPost = (n) => {
    return new Promise(async (resolve,reject)=>{
        const {data} = await axios(
            'https://jsonplaceholder.typicode.com/posts/'+n
        )
        resolve(data)
    })
}

// (async()=>{
//     await getUsers(2)
//         .then((data)=> console.log(data,"bitti"))
//         .catch(e=>console.log(e))
//     await getPost(1)
//         .then((data)=> console.log(data,"bitti"))
//         .catch(e=>console.log(e))
// })()

// (async()=>{

//     try{
//         const users = await getUsers(2)
//         const post = await getPost(1)
    
//         console.log(users)
//         console.log(post)

//     }catch(e){
//         console.log(e)
//     }

// })()

Promise.all([getUsers(),getPost(1)]).then(console.log).catch(console.log)