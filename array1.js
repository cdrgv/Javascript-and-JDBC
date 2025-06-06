const num=[1,2,3,4,5,6]
num.pop()
console.log(num)
let sum=0
num.forEach((val)=>{
    sum=sum+val
})
console.log(sum)
num.push(7)
console.log(num)
num.unshift(1)
console.log(num)
num.shift()
console.log(num)