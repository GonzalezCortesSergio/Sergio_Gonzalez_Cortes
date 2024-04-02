
let boton = document.getElementById("boton");

boton.addEventListener("click", botonPulsado);

function botonPulsado () {

    let zonaMensajes = document.querySelector(".zonaMensajes");

    let numMensajes = zonaMensajes.querySelector("strong");
    let numActual = parseInt(numMensajes.innerText)+1;

    numMensajes.innerText = numActual;
}