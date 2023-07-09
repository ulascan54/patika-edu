import './App.css';
// import React from 'react';
import Header from './components/Header'

const name ='Ulas'
const surName='can'
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
      </label>
    </>
  )
}

export default App;
