import './App.css';
// import React from 'react';
import Header from './components/Header'

const name ='Ulas'
const surName='can'
const isLoggedIn=true;
function App(){
  // return React.createElement('div',null,'hello')
  return(
    <>
      <h1 className='xyz'>Hello React</h1>
      <Header/>
      <label htmlFor='myinput'>
        {/* {name}{surName} */}
        {`my name is ${name} surname is ${surName}`}
        <input id='myinput' />
        <h1>{isLoggedIn && surName}</h1>
        <h1>{!isLoggedIn && name}</h1>

        <h1>{isLoggedIn ?  name : surName}</h1>
      </label>
    </>
  )
}

export default App;
