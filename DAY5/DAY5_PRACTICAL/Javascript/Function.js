//NORMAL FUNCTION
function fn1()
{
    console.log("NORMAL FUNCTION");
}
fn1();
//PARAMETERISED FUNCTION
function fn2(x,y)
{
    console.log(x,y);
}
fn2(10,20);
//FUNCTION WITH RETURN STATEMENT
function fn3(a,b)
{
    return a+b;
}
var res=fn3(25,65);
console.log(res);
//ANNONYMOUS FUNCTION(FUNCTION WITHOUT NAME)
function fn4(f)
{
    f();
    console.log(f);
}
fn4(function(){
    var state='WB';
    console.log(state);
})
//HIGHER ORDER AND CALLBACK FUNCTION
function fn5(f)
{
    f();
    console.log(f);
}
function print()
{
    var city='KOLKATA';
    console.log(city);
}
fn5(print);
//FUNCTION EXPRESSION
var result=function(){
   console.log("FUNCTION EXPRESSION");
}
result();
//ARROW FUNCTION
