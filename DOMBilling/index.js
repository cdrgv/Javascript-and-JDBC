let GrossAmountElement=document.getElementById("GrossAmount");
let DisAmountElement=document.getElementById("DisAmount");
let AfterDisAmountElement=document.getElementById("AfterDisAmount");
let TaxElement=document.getElementById("Tax");
let AfterTaxElement=document.getElementById("AfterTax");
let TipAmountElement=document.getElementById("TipAmount");
let NetAmountElement=document.getElementById("NetAmount");
let SplitElement=document.getElementById("Split");
let SplitBillElement=document.getElementById("SplitBill");
function AfterDisAmountBill(){
    AfterDisAmountElement.value=parseInt(GrossAmountElement.value)-parseInt(DisAmountElement.value);
}
function AfterTaxBill(){
    AfterTaxElement.value=(AfterDisAmountElement.value*parseInt(TaxElement.value))/100;
}
function NetAmountBill(){
    NetAmountElement.value=parseInt(AfterDisAmountElement.value)+parseInt(AfterTaxElement.value)+parseInt(TipAmountElement.value);
}
function AfterSplitBill(){
    SplitBillElement.value=Math.round(NetAmountElement.value/SplitElement.value);
}
function Payment(){
    alert("You Paid Rs."+NetAmountElement.value+" Sucessfully");
}