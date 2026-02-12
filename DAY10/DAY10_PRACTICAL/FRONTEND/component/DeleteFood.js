import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function DeleteFood() {
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
     
      
     const deleteData=(fid)=>{ 
      alert(fid);
       axios.delete(`http://localhost:1004/food/del/${fid}`)
       .then((res)=>{ 
       console.log(res.data);
       setMsg(res.data);
       })
       .catch((error)=>{ 
        console.log(error);
       
        alert("SOMETHING WENT WRONG FOR DELETING DATA");
        
       })
     }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-secondary'>DELETE FOOD FORM</h2>
       <input type='text' className='form-control' value={food.fid} 
       onChange={(event)=>{ 
        setFood({ 
            ...food,
            fid:event.target.value
        })
       }}
      placeholder='ENTER THE FOOD ID'/>
       
     
         <button className='btn btn-outline-primary' 
         onClick={()=>{ 
          deleteData(food.fid)
         }}>DELETE</button> &nbsp;&nbsp;
         <button className='btn btn-outline-secondary' onClick={refreshData}>REFRESH</button>
          <h2>{ msg}</h2>
    </div>
  )
}

export default DeleteFood