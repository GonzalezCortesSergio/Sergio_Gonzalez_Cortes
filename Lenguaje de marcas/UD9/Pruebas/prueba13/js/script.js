let formulario = document.forms.registro;
formulario.addEventListener("submit", enviarFormulario);
function eventoInputNombre(evento) {

    evento.target.value = evento.target.value.toUpperCase();
}

function enviarFormulario (evento) {

    evento.preventDefault();
    //Hago mis cositas
    alert("He parado el envío del formulario");

    formulario.submit();
}