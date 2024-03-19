
let nombres = pedirNombres();

alert (nombres);
function pedirNombres () {

    let resultado = new Array();

    let texto = prompt("Introduzca un texto");

    while (isNaN(texto)) {

        resultado.push(texto);
        texto = prompt("Introduzca un texto");
    }

    return resultado;
}