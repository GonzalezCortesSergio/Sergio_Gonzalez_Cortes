let formulario = document.forms.formulario;

let fechaHoy = new Date().toISOString().substring(0, 10);
formulario.elements.fechaNacimiento.max = fechaHoy;

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


function comprobarCositas() {

    comprobarDni();
    comprobarContrasenia();
}