

let texto = prompt ("Introduzca una cadena de texto, y el programa dirá si es un palíndromo o no");

function palindromo (texto) {

    texto = texto.toLowerCase().replace(/\s/g, "");

    if (texto === texto.split("").reverse().join("")) {

        alert ("El texto es palíndromo");
    }

    else {

        alert ("El texto no es palíndromo");
    }

}

palindromo(texto);