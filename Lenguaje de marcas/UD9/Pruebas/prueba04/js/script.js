let boton = document.getElementById("boton");

boton.addEventListener("click", botonPulsado);

function botonPulsado () {


    let boton = document.querySelector("button");

    boton.insertAdjacentHTML("afterend", "<p>Petición correcta</p>");
}