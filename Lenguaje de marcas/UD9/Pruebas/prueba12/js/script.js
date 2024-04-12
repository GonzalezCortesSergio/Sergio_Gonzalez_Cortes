//Cada vez que cambie algún texto, se pone a mayúscula (menos en la contraseña)

let formulario = document.forms.registro;

for(let campo of formulario.elements) {

    if (campo.type === "text") {

        campo.addEventListener("input", pasarMayusculas);
    }
    else if (campo.type === "password") {

        campo.nextElementSibling.addEventListener("pointerover", verContrasenia);
        campo.nextElementSibling.addEventListener("pointerout", ocultarContrasenia);
    } 
}

let botonEnviar = document.querySelectorAll("button");

botonEnviar.addEventListener("click", validarFormulario);
function pasarMayusculas(evento) {

    this.value = this.value.toUpperCase();
}

function verContrasenia(evento) {

    this.previousElementSibling.type = "text";
}

function ocultarContrasenia(evento) {

    this.previousElementSibling.type = "password";
}

function validarFormulario(evento) {

    let resultado = true;

    if (formulario.elements.nombre.value == '') {

        resultado = false;
    }
    if (formulario.elements.apellido.value == '') {

        resultado = false;
    }
    if (!formulario.elements.apellido.value.checked) {
        resultado = false;
    }

    if (resultado) {

        this.submit();
    }
}