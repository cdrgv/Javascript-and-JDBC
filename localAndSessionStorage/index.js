let Name=document.getElementById("name");
let Marks=document.getElementById("marks");
function saveHandler(){
    localStorage.setItem("name",Name.value);
    localStorage.setItem("marks",Marks.value);
    Name.value="";
    Marks.value="";
    Name.focus();
}
function getHandler(){
    Name.value=localStorage.getItem("name");
    Marks.value=localStorage.getItem("marks");
}
function removeHandler(){
    Name.value="";
    Marks.value="";
}
function deleteHandler(){
    localStorage.clear();
}