import React from 'react'
import { useNavigate } from 'react-router-dom'
function Home() {
    var navigate=useNavigate();
  return (
    <div>
      <h2 className='text-primary'>TASTY WHEELS</h2>
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTchfimeTB65ZAIx52pkP2fccY3pzXAHcV3Sw&s"
      height={500}
      width={500}
      alt='NO IMAGE'/>
      <br/><br/>
      <button className='btn btn-outline-secondary'
      onClick={()=>{ 
        navigate("/register")
      }}>REGISTER</button> &nbsp;&nbsp;
       <button className='btn btn-outline-success'
       onClick={()=>{ 
        navigate("/login")
      }}>LOGIN</button>
    </div>
  )
}

export default Home
