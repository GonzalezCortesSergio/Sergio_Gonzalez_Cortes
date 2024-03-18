let unArray = leerArrayPorTeclado();

alert ("El array tiene " + unArray.length + " elementos y son "+ unArray);

function leerArrayPorTeclado () {

    let continuar;
    let dato;
    let listaDatos = new Array();
    let limite = prompt("Diga cuántos números quiere incluir");

    do {

        dato = prompt("Escriba un número para guardar en un array");
        continuar = (dato !== '');
        if (continuar) {
            if (listaDatos.length >= limite) {

                listaDatos.shift();
            }
            listaDatos.push(dato);
        
        }
    
    }while (continuar);

    return listaDatos;
}

