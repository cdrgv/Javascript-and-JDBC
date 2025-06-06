let guessNumberElement=document.getElementById("guessNumber");
let msgElement=document.getElementById("msg");
let bodyElement=document.getElementById("body");
let marqueeElement=document.getElementById("marquee");
document.getElementById("btn").addEventListener("keypress",function(e){
    if(e.key=="enter"){
        validateNumber();
    }
});
let gNumber=Math.ceil(Math.random()*100);
let count=0;
function validateNumber(){
    let input=parseInt(guessNumberElement.value);
    if(gNumber==input){
        msgElement.innerHTML=`Guess Number is Correct (Your Attempts ${count})`;
        bodyElement.style.backgroundColor="green";
        marqueeElement.innerHTML="<marquee width='300px' direction='right'><h1>Congrats</h1></marquee>";
    }else if(gNumber>input){
        msgElement.innerHTML="Guess Number is Low";
        bodyElement.style.backgroundColor="yellow";
        guessNumberElement.value="";
        guessNumberElement.focus();
    }else if(gNumber<input){
        msgElement.innerHTML="Guess Number is High";
        bodyElement.style.backgroundColor="yellow";
        guessNumberElement.value="";
        guessNumberElement.focus();
    }else{
        msgElement.innerHTML="Input is Incorrect";
        bodyElement.style.backgroundColor="red";
        guessNumberElement.value="";
        guessNumberElement.focus();
    }
    count+=1;
}