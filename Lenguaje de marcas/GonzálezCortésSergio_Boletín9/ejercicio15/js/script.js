let main = document.querySelector("main");
let turno = "X";
let mensaje = document.getElementById("mensaje");
let limpiar = document.getElementById("limpiar");
main.addEventListener("click", marcarCasilla);
limpiar.addEventListener("click", limpiarCasillas);

function marcarCasilla(evento) {

    let boton = evento.target;

    if (boton.tagName !== "BUTTON" || boton === mensaje || boton === limpiar) {

        return;
    }

    else {

        boton.innerText = turno;

        turno == "X" ? turno = "O" : turno = "X";   
        
        mensaje.innerText = mensaje.innerText.slice(0, (mensaje.innerText.length - 1)) + turno;
    }
}

function limpiarCasillas() {

    let botones = document.getElementsByTagName("button");

    for (boton of botones) {

        if (boton !== mensaje && boton !== limpiar) {

            boton.innerText = "";
        }
        else {

            return;
        }
    }
}

