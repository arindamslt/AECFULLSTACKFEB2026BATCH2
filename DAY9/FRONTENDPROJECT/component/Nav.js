import React from 'react'
import "./Nav.css"
function Nav() {
  return (
    <div className='mConatiner'>
     
      <div className='lContainer'>
       <h2> FOOD APP ADMIN</h2>
      </div>
      <div className='rContainer'>
       <a href="/addfood">ADDFOOD</a>
        <a href="/foodlist">FOODLIST</a>
       <a href="/delfood">DELETEFOOD</a>
       <a href="/updfood">UPDATEFOOD</a>
        <a href="/sfood">SEARCHFOOD</a>
         <a href="/contact">CONTACT US</a>
       
          
      </div>
    </div>
  )
}

export default Nav