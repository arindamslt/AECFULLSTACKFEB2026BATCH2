import React from 'react'
import Register from './Register'
import Login from './Login'
import { useState } from 'react'
function Main() {
    let[state,setState]=useState(false);
  return (
    <div>
      <h2>MAIN COMPONENT</h2>
      { state ?  <Login/>: <Register setState={setState }/> }
     
     
    </div>
  )
}

export default Main
