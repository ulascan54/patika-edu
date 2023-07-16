import React from 'react'

import { Button } from '6hw-buttons-ulas'
import '6hw-buttons-ulas/dist/index.css'

const App = () => {
  return (
    <>
      <Button text='primary button' type='primary' />
      <Button text='default button' type='default' />
      <Button text='dashed button' type='dashed' />
      <Button text='text button' type='text' />
      <Button text='link button' type='link' />
    </>
  )
}

export default App
