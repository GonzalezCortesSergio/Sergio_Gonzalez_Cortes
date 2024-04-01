/*
let p1 = document.getElementById("parrafo1");

alert (p1.innerHTML);

p1.innerHTML = '<strong> Ces has cambiasdos estos muasjaja </strong>';
*/

let elementos = document.querySelectorAll ("li");

for (let el of elementos) {

    alert (el.innerText);
    el.innerText += " leído";
}

