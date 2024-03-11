
let nEntero = prompt ("Introduzca un número entero");

function parOImpar (nEntero) {

    return nEntero % 2;
}

if (parOImpar == 0) {

    alert ("El número " + nEntero + " es par, ya que el resto de su división entre 2 es igual a " + parOImpar(nEntero));
}

else {

    alert ("El número " + nEntero + "es impar, ya que el resto de su división entre 2 es igual a "+ parOImpar(nEntero));
}

