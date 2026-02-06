//SPREAD OPERATOR
var obj1={
    id:1,
    nm:'ALOKE',
    dept:'FINANCE'
}
var obj2={
...obj1,
dept:'HR'
}
console.log(obj1);
console.log(obj2);
//REST PARAMETER
function fn(x,y,...data)
{
  console.log(x,y,data);
}
fn(10,20,30,40);
//DESTRUCTING OBJECT
var{nm,dept}=obj1;
console.log(nm,dept);
//AROOW FUNCTION
/*function fn1()
{
    console.log("NORMAL FUNCTION");
}*/
const fn1=()=>{
    console.log("ARROW FUNCTION");
}
fn1();
var arr=[100,200,300,400];
arr.forEach(function(element,index){
console.log(index,element);
})
arr.forEach((element,index)=>{
    console.log(index,element);
})