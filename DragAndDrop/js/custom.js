const draggables = document.querySelectorAll(".draggables");
const dropContainer = document.getElementById("formContainer");
draggables.forEach((ele) => {
    ele.addEventListener("dragstart", e => {
        e.dataTransfer.setData("type", e.target.dataset.type);
    });
});
dropContainer.addEventListener("dragover", e => {
    e.preventDefault();
})
dropContainer.addEventListener("drop", e => {
    e.preventDefault();
    const type = e.dataTransfer.getData("type");
    let element;
    switch (type) {
        case 'input':
            let labelInput = prompt("Enter Text label name");
            element = document.createElement("input");
            element.type = "text";
            element.placeholder = "Enter Text";
            element.value=labelInput;
            break;
        case 'textarea':
            element = document.createElement("textarea");
            element.placeholder = "Textarea";
            let textArea=prompt("Enter text in TextArea");
            element.value=textArea;
            break;
        case 'select':
            element = document.createElement("select");
            let noOfOptions=prompt("Enter no of options");
            for(let i=0;i<noOfOptions;i++){
                let opt=document.createElement("option");
                let optName=prompt("Enter option name");
                opt.text=optName;
                let optValue=prompt("Enter option value");
                opt.value=optValue;
                element.appendChild(opt);
            }
            break;
        case 'checkbox':
            element = document.createElement('input');
            element.type = 'checkbox';
            let checkValue=prompt("Enter value of checkbox");
            element.value=checkValue;
            break;
        case 'radio':
            element = document.createElement('input');
            element.type = 'radio';
            let radioValue=prompt("Enter value of radio");
            element.value=radioValue;
            break;
        case 'button':
            element = document.createElement('button');
            let buttonInput = prompt("Enter button name");
            element.textContent = buttonInput;
            break;
        case 'label':
            element = document.createElement('label');
            let labelName = prompt("Enter label Name");
            element.textContent = labelName;
            break;
        default:
            return;
    }
    element.style.display = "block";
    element.style.marginBottom = "10px";
    dropContainer.appendChild(element);
}
);