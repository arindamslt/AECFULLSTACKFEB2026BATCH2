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
         <button className='btn btn-outline-primary'>ADD</button> &nbsp;&nbsp;
         <button className='btn btn-outline-secondary'>REFRESH</button>
    </div>
  )
}

export default AddProduct
