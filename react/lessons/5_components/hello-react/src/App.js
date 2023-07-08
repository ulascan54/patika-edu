import './App.css';
// import React from 'react';
import Header from './components/Header'
function App(){
  // return React.createElement('div',null,'hello')
  return(
    <>
      <h1 className='xyz'>Hello React</h1>
      <Header/>
      <label htmlFor='myinput'>
        name
        <input id='myinput' />
      </label>
    </>
  )
}

export default App;
