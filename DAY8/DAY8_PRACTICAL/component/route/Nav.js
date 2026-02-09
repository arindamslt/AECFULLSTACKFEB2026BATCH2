import React from 'react'
import "./Nav.css"
function Nav() {
  return (
    <div className='mConatiner'>
     
      <div className='lContainer'>
       <h2> PRACT APP</h2>
      </div>
      <div className='rContainer'>
       <a href="/state">STATE</a>
        <a href="/profile">PROFILE</a>
       <a href="/props">PROPS</a>
       <a href="/pdrilling">PROPSDRILLING</a>
        <a href="/context">CONTEXT</a>
         <a href="/axios">AXIOS</a>
          <a href="/useeffect">USEEFFECT</a>
           <a href="/crend">CONDREND</a>
           <a href="/preport">PRODUCT REPORT</a>
            <a href="/product">PRODUCT</a>
             <a href="/addproduct">ADDPRODUCT</a>
      </div>
    </div>
  )
}

export default Nav
