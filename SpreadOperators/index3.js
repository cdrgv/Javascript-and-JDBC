//Rest Operator
function sum(a,...rest){
    total=a;
    for(let i=0;i<rest.length;i++){
        total+=rest[i];
    }
    return total;
}
console.log(sum(10,20));
console.log(sum(10,20,30));
console.log(sum(10,20,30,40));
console.log(sum(10,20,30,40,50));