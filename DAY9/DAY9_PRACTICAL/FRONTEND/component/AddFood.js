import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function AddFood() {
    let[food,setFood]=useState({
        fid:"",
        fname:"",
        price:""
     })
     let[msg,setMsg]=useState("");
     const refreshData=()=>{ 
        setMsg("");
        setFood({ 
              fid:"",
             fname:"",
            price:""
        })
     }
     let[errors,setErrors]=useState({
      efname:"",
      eprice:""
      })
      
     const addData=()=>{ 
       axios.post("http://localhost:1004/food/add",food)
       .then((res)=>{ 
       console.log(res.data);
       setMsg(res.data);
       })
       .catch((error)=>{ 
        console.log(error);
        setErrors({ 
          efname:error.response.data.fname,
            eprice:error.response.data.price
        })
        //alert("SOMETHING WENT WRONG FOR STORING DATA");
        
       })
     }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>ADD FOOD FORM</h2>
       <input type='text' className='form-control' value={food.fid} 
       onChange={(event)=>{ 
        setFood({ 
            ...food,
            fid:event.target.value
        })
       }}
      placeholder='ENTER THE FOOD ID'/>
       <input type='text' className='form-control' value={food.fname} 
       onChange={(event)=>{ 
        setFood({ 
            ...food,
            fname:event.target.value
        })
       }}
      placeholder='ENTER THE FOOD NAME'/>
     <h2 style={{color:"red"}}>{errors.efname}</h2>
      <input type='text' className='form-control' value={food.price} 
       onChange={(event)=>{ 
        setFood({ 
            ...food,
           price:event.target.value
        })
       }}
      placeholder='ENTER THE FOOD PRICE'/>
       <h2 style={{color:"red"}}>{errors.eprice}</h2>
         <button className='btn btn-outline-primary' onClick={addData}>ADD</button> &nbsp;&nbsp;
         <button className='btn btn-outline-secondary' onClick={refreshData}>REFRESH</button>
          <h2>{ msg}</h2>
    </div>
  )
}

export default AddFood