import React from 'react'

function AddProduct() {
  return (
    <div style={{width:"30%",margin:"50px auto"}}>
      <h2 className='text-primary'>ADD PRODUCT FORM</h2>
       <input type='text' className='form-control' placeholder='ENTER THE PRODUCT ID'/>
       <input type='text' className='form-control' placeholder='ENTER THE PRODUCT NAME'/>
        <input type='text' className='form-control' placeholder='ENTER THE PRODUCT QUANTITY'/>
         <input type='text' className='form-control' placeholder='ENTER THE PRICE'/>
         <button className='btn btn-outline-primary'>ADD</button> &nbsp;&nbsp;
         <button className='btn btn-outline-secondary'>REFRESH</button>
    </div>
  )
}

export default AddProduct
