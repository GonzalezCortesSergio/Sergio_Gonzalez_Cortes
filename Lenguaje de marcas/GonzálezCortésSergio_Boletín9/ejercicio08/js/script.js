let formulario = document.forms.formulario;

let fechaHoy = new Date().toISOString().substring(0, 10);
formulario.elements.fechaNacimiento.max = fechaHoy;

let contrasenias = formulario.querySelectorAll("input[type=password]");

for(let contrasenia of contrasenias) {

    contrasenia.nextElementSibling.addEventListener("pointerover", verContrasenia);
    contrasenia.nextElementSibling.addEventListener("pointerout", ocultarContrasenia);
}

formulario.addEventListener("submit", comprobarCositas);

function comprobarDni() {

    let dni = formulario.elements.dni.value;
    let patron = /^(\d{8})([A-Z])$/;

    if (!patron.test(dni)) {

        alert("El DNI debe contener 8 números y una letra")
    }

}

function comprobarContrasenia() {

    let contrasenia = formulario.elements.contrasenia.value;
    let repetirContrasenia = formulario.elements.repetirContrasenia.value;

    if (contrasenia !== repetirContrasenia) {

        alert("Las dos contraseñas no coinciden");
    }
}

function verContrasenia(evento) {

    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(evento) {

    this.previousElementSibling.type = "password";
}

function comprobarCositas() {

    comprobarDni();
    comprobarContrasenia();
}