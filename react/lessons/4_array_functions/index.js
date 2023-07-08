const users = ["ulas","can","demirbag"]

/*
    push
    map
    find
    filter
    some
    every
    includes

*/


//push

users.push('selman')
users.push('ayşe')
console.log('users:', users)

// map

// for (let i = 0; i < users.length; i++) {
//     const element = users[i];
//     console.log('element:', element)
    
// }


users.map((item)=>console.log('item:', item))

const newArray = [
    {name:"ulas",
age:22},
    {name:"can",
age:18},
    {name:"demirbag",
    age:18}
]

newArray.map((item)=>{
    console.log('item: ', item.name)
})



//find 

const result = newArray.find((item)=> item.name =='ulas')
console.log('result:', result)


// filter

const filtered = newArray.filter((item)=>item.name=='ulas' && item.age >20)
console.log('fitlered:', filtered)


//some 

const some = newArray.some((item)=>item.age ===11)
console.log('some:', some)


//every
const every = newArray.every((item)=>item.age >11)
console.log('every:', every)

//include

const isInclude = newArray.includes('portala')
console.log('isInclude:', isInclude)