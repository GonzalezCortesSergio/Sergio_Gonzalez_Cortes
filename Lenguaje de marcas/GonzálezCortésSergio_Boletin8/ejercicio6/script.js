 

let letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
"X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
"T"];
let dni = prompt("Introduzca su DNI");
let letraIntroducida = prompt ("Ahora introduzca su letra");



if (dni < 0 && dni > 99999999) {

    alert ("El número proporcionado no es válido");
}

let letraReal = letras [dni % 23];


if (letraIntroducida == letraReal) {

    alert ("La letra introducida es correcta")
}

if (letraIntroducida != letraReal) {

    alert ("La letra introducida no es correcta")
}



