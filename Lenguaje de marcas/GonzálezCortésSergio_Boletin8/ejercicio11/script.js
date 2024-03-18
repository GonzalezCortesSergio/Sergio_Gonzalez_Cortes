let listaNumeros = new Array();
let numerichi;
let tam = prompt("Cuántos números quiere introducir");


function pedirNumerichis (listaNumeros, numerichi, tam) {

    do {

        numerichi = prompt("Introduzca un número, pulse espacio únicamente para salir");
        if (numerichi !== '') {

            if (listaNumeros.length >= tam) {

                listaNumeros.shift();
            }

            listaNumeros.push(numerichi);
        }

    }while (numerichi !== '');
}

function sumarNumerichis (listaNumeros) {

    let suma = 0;

    for (const numero of listaNumeros) {
        suma+= numero;
    }

    return suma;
}

alert ("La lista de números está compuesta por " + pedirNumerichis(listaNumeros, numerichi, tam) + " cuya suma es " + sumarNumerichis(listaNumeros));