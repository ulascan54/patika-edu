import './App.css';

import User from './components/User'
function App(){
  return(
    <>
    <User name="Ulas" surName="Can" isLoggedIn={true} age={29} />

    </>
  )
}

export default App;
