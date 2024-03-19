
function sortear (arr) {

    let numAleatorio = Math.floor(Math.random() * arr.length);

    return arr[numAleatorio];
}

function camelize (str) {

    //border-left-radius -> borderLeftRadius

    //quitamos guiones y separamos por palabras
    
    let palabrasSueltas = str.split("-");

    //cambiar primera letra a mayúsculas (a partir de la 2ª)
    for (let i = 1; i< palabrasSueltas.length; i++) {

        let primeraEnMayuscula = palabrasSueltas[i].charAt(0).toUpperCase();
        palabrasSueltas[i] = primeraEnMayuscula + palabrasSueltas[i].substring(1);
    }
    //unir las palabras
    return palabrasSueltas.join('');

}

function pedirNombres () {

    let resultado = new Array();

    let texto = prompt("Introduzca un texto");

    while (isNaN(texto)) {

        resultado.push(texto);
        texto = prompt("Introduzca un texto");
    }

    return resultado;
}


function principal () {

    let propiedadesCSS = pedirNombres();

    for (let i = 0; i< propiedadesCSS.length ; i++) {

        propiedadesCSS[i] = camelize(propiedadesCSS[i]);
    }

    alert ("El escogido es: " + sortear(propiedadesCSS));


}

principal();