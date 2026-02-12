import React from 'react'
import "./Nav.css"
function NavClient() {
  return (
    <div className='mConatiner'>
     
      <div className='lContainer'>
       <h2> FOOD APP CLIENT</h2>
      </div>
      <div className='rContainer'>
        <a href="/foodlistclient">FOODLIST</a>
        <a href="/sfoodclient">SEARCHFOOD</a>
       <a href="/addorder">ADD ORDER</a>
       <a href="/billing">BILLING</a>
        
               
          
      </div>
    </div>
  )
}

export default NavClient