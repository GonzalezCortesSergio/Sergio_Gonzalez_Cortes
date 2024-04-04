let boton = document.getElementById("boton");

boton.addEventListener("click", botonPulsado);

function botonPulsado () {

    let zonaMensajes = document.querySelector(".zonaMensajes");

    zonaMensajes.innerText = "El botón es del tipo " + boton.type;

    boton.classList.toggle("btn-primary");
    boton.classList.toggle("btn-danger");
}