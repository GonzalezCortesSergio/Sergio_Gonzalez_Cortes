let listaNumeros = pedirNumerichis();

alert ("El array está compuesto por " + listaNumeros + " cuya suma es " + sumarNumerichis(listaNumeros))


function pedirNumerichis () {

    let dato;
    let listaDatos = new Array()
    let tam = prompt("Diga cuántos números quiere introducir")
    do {

        dato = prompt("Introduzca un número, pulse espacio únicamente para salir");
        if (dato !== '') {

            if (listaDatos.length >= tam) {

                listaDatos.shift();
            }

            listaDatos.push(dato);
        }

    }while (dato !== '');

    return listaDatos;
}

function sumarNumerichis (listaNumeros) {

    let suma = 0;

    for (const numero of listaNumeros) {
        suma+= parseInt(numero);
    }

    return suma;
}
