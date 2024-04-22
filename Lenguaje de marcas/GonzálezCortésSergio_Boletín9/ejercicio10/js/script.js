let formulario = document.forms.formulario;

let contrasenias = formulario.querySelectorAll("input[type=password]");

formulario.addEventListener("submit", comprobarDatos);

for(let contrasenia of contrasenias) {

    contrasenia.nextElementSibling.addEventListener("pointerover", verContrasenia);
    contrasenia.nextElementSibling.addEventListener("pointerout", ocultarContrasenia);
}

function verContrasenia(evento) {

    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(evento) {

    this.previousElementSibling.type = "password";
}

function pasarNombreApellidosAMayusculas() {

    let nombre = formulario.elements.nombre.value;
    let apellidos = formulario.elements.apellidos.value;

    nombre = nombre.toUpperCase();
    apellidos = apellidos.toUpperCase();
}

function comprobarDNI() {
    
    let letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
    "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
    "T"];

    let campoDni = formulario.elements.dni;
    let letraDni = dni.value.substring(7, 7);
    letraDni = letraDni.toUpperCase();
    let dniSinLetra = dni.value.split('');
    dniSinLetra.pop();
    dniSinLetra.join('');

    if (letras[dniSinLetra % 23] !== letraDni) {

        let mensajeError = campoDni.nextElementSibling;

        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "La letra del DNI es incorrecta";
    }

}

function comprobarDatos() {

    
    pasarNombreApellidosAMayusculas();
    comprobarDNI();

}
