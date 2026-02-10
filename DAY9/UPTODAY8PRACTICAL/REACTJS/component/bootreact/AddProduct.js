import React from 'react'
import axios from 'axios'
import { useState } from 'react'
function AddProduct() {
    let[product,setProduct]=useState({
        pid:"",
        pname:"",
        pqty:"",
        price:""
     })
     let[msg,setMsg]=useState("");
     const refreshData=()=>{ 
        setMsg("");
        setProduct({ 
              pid:"",
             pname:"",
             pqty:"",
             price:""
        })
     }
     const addData=()=>{ 
       axios.post("http://localhost:1004/product/add",product)
       .then((res)=>{ 
       console.log(res.data);
       setMsg(res.data);
       })
       .catch((error)=>{ 
        console.log(error);
        alert("SOMETHING WENT WRONG FOR STORING DATA");
       })
     }
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>ADD PRODUCT FORM</h2>
       <input type='text' className='form-control' value={product.pid} 
       onChange={(event)=>{ 
        setProduct({ 
            ...product,
            pid:event.target.value
        })
       }}
      placeholder='ENTER THE PRODUCT ID'/>
       <input type='text' className='form-control' value={product.pname} 
       onChange={(event)=>{ 
        setProduct({ 
            ...product,
            pname:event.target.value
        })
       }}
      placeholder='ENTER THE PRODUCT NAME'/>
      <input type='text' className='form-control' value={product.pqty} 
       onChange={(event)=>{ 
        setProduct({ 
            ...product,
            pqty:event.target.value
        })
       }}
      placeholder='ENTER THE PRODUCT QUANTITY'/>
      <input type='text' className='form-control' value={product.price} 
       onChange={(event)=>{ 
        setProduct({ 
            ...product,
           price:event.target.value
        })
       }}
      placeholder='ENTER THE PRODUCT PRICE'/>
         <button className='btn btn-outline-primary' onClick={addData}>ADD</button> &nbsp;&nbsp;
         <button className='btn btn-outline-secondary' onClick={refreshData}>REFRESH</button>
          <h2>{ msg}</h2>
    </div>
  )
}

export default AddProduct
