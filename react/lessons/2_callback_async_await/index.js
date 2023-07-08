// setTimeout(() => {
//     console.log('merhaba')
// }, 5000);

// setInterval(() => {
//     console.log("heloooooo")
// }, 1000);

// const sayHi =  (cb) => {
//     console.log('merhaba')
//     cb()
// }

// sayHi(()=>{
//     console.log('hello')
// })
import fetch from 'node-fetch'
    
// fetch("https://jsonplaceholder.typicode.com/users/1")
// .then((data)=> data.json())
// .then((users)=>
//     {console.log(users,"users geldi")
//     fetch("https://jsonplaceholder.typicode.com/posts/1")
//     .then((data)=> data.json())
//     .then((posts) => {
//         console.log(posts,"post geldi")
//         fetch("https://jsonplaceholder.typicode.com/posts/2")
//         .then((data2)=> data2.json())
//         .then((posts2) => console.log(posts2,"post2 geldi")
// )})})


// async function getData(){
//     const users = await (await fetch('https://jsonplaceholder.typicode.com/users')
//     ).json()
//     console.log("users",users)

//     const post1 = await (await fetch('https://jsonplaceholder.typicode.com/posts/1')
//     ).json()
//     console.log("users",post1)

//     const post2 = await (await fetch('https://jsonplaceholder.typicode.com/posts/2')
//     ).json()
//     console.log("users",post2)
// }

// getData()

(async()=>{
    const users = await (await fetch('https://jsonplaceholder.typicode.com/users')
        ).json()
        console.log("users",users)
    
        const post1 = await (await fetch('https://jsonplaceholder.typicode.com/posts/1')
        ).json()
        console.log("users",post1)
    
        const post2 = await (await fetch('https://jsonplaceholder.typicode.com/posts/2')
        ).json()
        console.log("users",post2)
})()