var a=10;
{
    let b=20;
    const c=30;

}

console.log(a); //10
//console.log(b); //err
//console.log(c); //err

const arr=["sagar","sdd","grg"];
//arr=["Palkar"];
console.log(arr[2]);
console.log(arr);
console.log("================");
var x=10;
//console.log(x);
const m=10;
if(m===x)
console.log("true");

if(m==x)
console.log("data type is same");
//console.log(typeof x);
console.log("======================================================================================================================");

function add1(n1,n2=30)
{
    return n1+n2;
}
add1(10,20);
let dispaly=function(){
    console.log("anonymouys function");

}
dispaly();
let display=()=>console.log("arrow function");
display();
let add=(n1,n2)=>{
    return n1+n2;
}



let fruit=["Amba","orange"];
fruit.push("watermelon","Grapes");
console.log(fruit);

// console.log(fruit.pop());
// console.log(fruit.pop());
// console.log(fruit);


// console.log(fruit.slice(1));
// console.log(fruit.slice(1,4));
// console.log(fruit.slice(1,5));
// console.log(fruit.slice(1,2));
// console.log(fruit.slice(-2));
// console.log(fruit.slice(2,-1));
// console.log(fruit.slice());

// console.log("=====================");
// console.log(fruit.splice(1,0,"amba","tarbuj","kharbuj"));

// //console.log(fruit);
// const result=fruit.filter(fruits=>fruits.startsWith("a"));
// console.log(result);
console.log("=====================");
const array1=[1,2,3,4,5];
const map=array1.map(x=>x*x);
console.log(map);

const result1=fruit.map(c=>c.length);
console.log(result1);

let car=["BMW","TATA","HONDA","MERCEDES"];


const res=fruit.join(a=>a.car);
console.log(res);

const para="enfdjkeghfjefhgeufgfhqgfyuegfggfyegfgewfeygfeyf"
console.log(para.replace('en','fdj'));

console.log(para.substring(2,5)); //
console.log(para.substr(2,4)); //




















