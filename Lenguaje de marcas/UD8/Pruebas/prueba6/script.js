/*
Escribe la funcion camelize (str). Esta funcion recibe un único parámetro del tipo String. 
Se espera que la funcion convierta palabras separadas por guión
*/

let a = "border-left-radius";


alert (camelize (a));

function camelize (str) {

    //border-left-radius -> borderLeftRadius

    //quitamos guiones y separamos por palabras
    
    let palabrasSueltas = str.split("-");

    //cambiar primera letra a mayúsculas (a partir de la 2ª)
    for (let i = 1; i< palabrasSueltas.length; i++) {

        let primeraEnMayuscula = palabrasSueltas[i].charAt[0].toUpperCase();
        palabrasSueltas[i] = primeraEnMayuscula + palabrasSueltas[i].subString(1);
    }
    //unir las palabras
    palabrasSueltas.join("");

    return palabrasSueltas;
}

