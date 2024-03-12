
let texto = prompt ("Introduzca una cadena de texto con o sin mayúsculas");

function definirMayusculas (texto) {

    if (texto === texto.toUpperCase()) {

        alert ("El texto está compuesto de mayúsculas");
    }

    else if (texto === texto.toLowerCase()) {

        alert ("El texto está compuesto de minúsculas");
    }

    else {

        alert ("El texto está compuesto por una mezcla de mayúsculas y minúsculas");
    }

}

definirMayusculas(texto);