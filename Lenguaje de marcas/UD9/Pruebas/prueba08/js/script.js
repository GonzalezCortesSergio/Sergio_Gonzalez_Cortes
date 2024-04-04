let boton = document.getElementById("boton");

boton.addEventListener("click", botonPulsado);

function botonPulsado() {
    
    let zonaMensajes = document.querySelector(".zonaMensajes");

    zonaMensajes.innerText = "El botón es del tipo " + boton.type;
    
    let enlace = document.createElement("a");

    enlace.setAttribute("href", "#inicio");

    document.querySelector("body").id = "inicio";

    enlace.innerText = "Ir al inicio";

    zonaMensajes.append(enlace);
}