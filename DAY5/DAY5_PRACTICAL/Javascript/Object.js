var product={
    pid:'P1',
    pname:'TV',
    pqty:5,
    price:25000.00
}
console.log(product.pid,product.pname,product.pqty,product.price);
//ADD A ELEMENT INTO THE EXISTING OBJECT
product.company='SONY';
console.log(product.pid,product.pname,product.pqty,product.price,product.company);
//DELETE COMPONENT IN OBJECT
delete product.company;
console.log(product);
//NESTED OBJECT
var employee={
    eid:1,
    ename:'ANUP',
    address:{
        plotno:'AD10',
        streetnm:'SALTLAKE CITY',
         area:{
            ps:'BIDHANNAGAR',
            dist:'24PGS'
         }
    }
}
console.log(employee.ename,employee.address.streetnm,employee.address.area.ps);