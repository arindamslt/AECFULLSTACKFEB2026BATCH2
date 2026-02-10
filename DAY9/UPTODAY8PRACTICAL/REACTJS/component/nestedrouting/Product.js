import React from 'react'
import { Link } from 'react-router-dom'
import "./Product.css"
import { Outlet } from 'react-router-dom'
function Product() {
  return (
    <div className='pmContainer'>
   
      <div className='plContainer'>
     <Link to="electronics">ELECTRONICS</Link>
      <Link to="retails">RETAILS</Link>
       <Link to="garments">GARMENTS</Link>
        <Link to="jewellery">JEWELLERY</Link>
      </div>
      <div className='prContainer'>
       <Outlet/>
      </div>
    </div>
  )
}

export default Product
