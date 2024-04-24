
let body = document.querySelector("body");
let coloresGenerados = 0;
let botonGenerar = document.getElementById("btnGenerar");
let botonLimpiar = document.getElementById("btnLimpiar");

botonGenerar.addEventListener("click", generarColorAleatorio);
botonLimpiar.addEventListener("click", limpiarColores);

function generarColorAleatorio () {
    let mensaje = document.getElementById("aviso");

    let r = Math.floor(Math.random() * (255 - 0 + 1) ) + 0;
    let g = Math.floor(Math.random() * (255 - 0 + 1) ) + 0;
    let b = Math.floor(Math.random() * (255 - 0 + 1) ) + 0;

    let color = "rgb(" + r + ", " + g + ", " + b + ")"

    body.style.backgroundColor = color;
    coloresGenerados++;

    mensaje.innerHTML = "<p class='badge badge-pill bg-success'>" + "El color elegido es " + color + ". Lleva generados " + coloresGenerados + " colores." + "</p>"; 

}

function limpiarColores() {

    let mensaje = document.getElementById("aviso");
    mensaje.innerHTML = "";
    coloresGenerados = 0;
    body.style.backgroundColor = "white";
}