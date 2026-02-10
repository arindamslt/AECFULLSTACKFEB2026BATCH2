import React, { useEffect } from 'react'
import axios from 'axios'
import { useState } from 'react'
function ProductReport() {
       let[product,setProduct]=useState([]);
    useEffect(()=>{ 
           axios.get("http://localhost:1004/product/fetch")
        .then((res)=>{ 
            console.log(res.data);
            setProduct(res.data);
           
        })
        .catch((error)=>{ 
            console.log(error);
        })
    },[])
  return (
    <div>
      { 
        product.length>0 ? 
        <div style={{width:"40%",margin:"50px auto" } }>
         <table className='table table-hover'>
           <thead className='table table-dark'>
            <tr>
                <th>PRODUCT ID</th>
                <th>PRODUCT NAME</th>
                 <th>QUANTITY</th>
                <th>PRICE</th>
                
            </tr>
           </thead>
           <tbody>
            {
                product.map((element,index)=>{ 
                    return(
                        <tr>
                            
                             <td>{element.pid }</td>
                            <td>{element.pname }</td>
                             <td>{element.pqty }</td>
                              <td>{element.price }</td>
                        </tr>
                    )
                })
            }
           </tbody>
         </table>
        </div>
        :<h2 style={{color:"red" } }>NO USER INFORMATION</h2>
      }
    </div>
  )
}

export default ProductReport