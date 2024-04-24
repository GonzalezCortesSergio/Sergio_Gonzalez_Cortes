let formulario = document.forms.formulario;

for (campo of formulario) {

    if(campo.type === 'text') {

        campo.addEventListener("input", pasarAMayusculas);
    }
    else if (campo.type === 'password') {

        campo.nextElementSibling.addEventListener("pointerover", verContrasenia);
        campo.nextElementSibling.addEventListener("pointerout", ocultarContrasenia);
    }
}

let datosErroneos = false;

formulario.addEventListener("submit", comprobarDatos);


function verContrasenia(evento) {

    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(evento) {

    this.previousElementSibling.type = "password";
}

function pasarAMayusculas(evento) {

    this.value = this.value.toUpperCase();
}

function comprobarDNI() {

    let letras = ["T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", 
    "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
    "T"];

    let campoDni = formulario.elements.dni;
    let letraDni = dni.value.substring(8, 9);
    let dniSinLetra = dni.value.split('');
    dniSinLetra.pop();
    dniSinLetra = dniSinLetra.join("");

    if (letras[dniSinLetra % 23] !== letraDni) {

        let mensajeError = campoDni.nextElementSibling;

        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "La letra del DNI es incorrecta";

        datosErroneos = true;
    }


}

function comprobarCorreo() {

    let patronCorreo =  /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

    let campoCorreo = formulario.elements.email;

    if (!patronCorreo.test(campoCorreo.value)) {

        let mensajeError = campoCorreo.nextElementSibling;

        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "El correo no es válido";

        datosErroneos = true;
    }
}

function comprobarContrasena() {

    let campoContrasena = formulario.elements.contrasenia;
    let campoRepetirContrasena = formulario.elements.repetirContrasenia;

    let patronContrasenia = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,15}/;

    if (!patronContrasenia.test(campoContrasena.value) || campoContrasena.value !== campoRepetirContrasena.value) {

        let mensajeError = campoRepetirContrasena.nextElementSibling.nextElementSibling;

        mensajeError.classList.add("bg-danger");
        mensajeError.innerHTML = "La contraseña no es válida o no coinciden las dos contraseñas";

        datosErroneos = true;
    }
}

function comprobarEdad() {

    let tiempo = Date.now();
    let anioActual = new Date(tiempo).getFullYear();

    let fechaNacimiento = formulario.elements.fechaNacimiento.value;
    let anioNacimiento = new Date(fechaNacimiento).getFullYear();

    if ((anioActual - anioNacimiento) < 18) {

        let mensajeError = formulario.elements.fechaNacimiento.nextElementSibling;

        mensajeError.classList.add("bg-danger");

        datosErroneos = true;
    }
}

function comprobarDatos(evento) {
    
    evento.preventDefault();
    
    datosErroneos = false;
    
    comprobarDNI();
    comprobarCorreo();
    comprobarContrasena();
    comprobarEdad();

    if (!datosErroneos) {

        formulario.submit();

    }

}
