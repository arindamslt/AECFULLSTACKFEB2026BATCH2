var arr=[100,200,300,400];
console.log(arr);
console.log(typeof arr);
//ADD A LAST ELEMNT IN ARRAY
arr.push(500);
console.log(arr);
//DELETE A ELEMENT FROM LAST
arr.pop();
console.log(arr);
//ADD A ELEMENT IN FIRST POSITION
arr.unshift(50);
console.log(arr);
//DELETE THE FIRST INDEX VALUE
arr.shift();
console.log(arr);
//DELETE A ELEMENT FROM SPECIFIC POSITION
arr.splice(2,1);
console.log(arr);
//ADD THE ELEMENT IN SPECIFIC POSITION
arr.splice(2,0,300);
console.log(arr);
//forEach()
arr.forEach(function(element,index){
console.log(index,element);
})
//map()
var newarr=arr.map(function(element,index){
return element*10;
})
console.log(newarr);
//filter()
var newarr1=arr.filter(function(element,index){
return element>200;
})
console.log(newarr1);