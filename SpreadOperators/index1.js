let person={
    id:1,
    name:"sukesh"
}
let details={
    address:"Ongole"
}
const person_details={...person,...details};
console.log(person);
console.log(details);
console.log(person_details);
const rao=person_details;//shallow Copy
const roa={...person_details};//deep Copy
const str=JSON.parse(JSON.stringify(person_details));
person_details["language"]="Eng";
console.log(person_details);
console.log(rao);
console.log(roa);