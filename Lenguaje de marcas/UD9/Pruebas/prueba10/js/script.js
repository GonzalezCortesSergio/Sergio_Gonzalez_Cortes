let boton = document.getElementById("boton");
let contador = 1;

boton.addEventListener("click", incrementarNumerichi);

function incrementarNumerichi() {

    let numerichi = document.getElementById("numerichi");

    numerichi.innerText = contador++;
    
}