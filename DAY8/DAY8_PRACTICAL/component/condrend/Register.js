import React from 'react'

function Register({setState }) {
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-secondary'>REGISTER FORM</h2>
      <input type='text' className='form-control' placeholder='ENTER THE USERNAME'/>
       <input type='password' className='form-control' placeholder='ENTER THE PASSWORD'/>
        <input type='text' className='form-control' placeholder='ENTER THE NAME'/>
        <button className='btn btn-outline-secondary'
        onClick={()=>{ 
            setState(true);
        }}>REGISTER</button>


    </div>
  )
}

export default Register
