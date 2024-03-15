let tam = prompt ("Diga cuántos números quiere introducir (ejemplo: 1, 2, 5...)");

let listaNumeros = new Array(tam);

do {

    
    for (let numerichi of listaNumeros) {
        
        numerichi = prompt("Introduce un número");
    
    }

    function sumaNumeros (listaNumeros) {

        let suma = 0;

        for (let numerichi of listaNumeros) {
            
            suma+= numerichi;
        }

        return suma;
    } 

    alert (listaNumeros);

    alert (sumaNumeros(listaNumeros));
    let numero = prompt ("Quiere repetir? 1: Sí 0: No")

}while (numero != 0);