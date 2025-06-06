let a=["Jan","Feb","Mar","Apr","May","Jun"]
const it=a.values();
for(const value of it){
    console.log(value)
}
console.log(a.sort())
console.log(a.reverse())
console.log(a.at(0),a[0])
let num=[1,2,4,5,33,22,12,13]
console.log(num.sort())//sort method
console.log(num.fill(9,2,num.length-1))//fill method
