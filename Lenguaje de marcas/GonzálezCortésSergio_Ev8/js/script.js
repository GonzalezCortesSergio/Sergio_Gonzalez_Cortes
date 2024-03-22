

//Ejercicio 1

function redondearElementos (arr) {

    for (let i = 0; i < arr.length; i++) {
        
        if (isNaN(arr[i])) {

            arr.splice(i, 1); 
            i--;           
        }

        else {

           arr[i] = Math.round(arr[i]);
        }
        
    }

    return arr;
}

//Ejercicio 2

function compararNumeros (a, b) {

    if (a > b) {

        return 1;
    }

    else {

        if (a < b) {

            return -1;
        }

        return 0;
    }
}

function eliminarExtremos (arr) {


    arr = arr.sort(compararNumeros);

    arr.pop();
    arr.shift();

    return arr;

}

function eliminarExtremosV2 (arr) {

    let indexMayor = 0;
    let indexMenor = 0;

    for (let i = 0; i < arr.length; i++) {

        if (arr[i] > arr[indexMayor]) {

            indexMayor = i;
        }

        if (arr[i] < arr[indexMenor]) {

            indexMenor = i;
        }
    }

    arr.splice(indexMayor, 1);
    arr.splice(indexMenor, 1);
}


//Ejercicio 3


function parsearNotas(str) {

    let listaJurados = str.split("#");

    let notas = new Array();

    for (let i = 0; i < listaJurados.length; i++) {
        
        notas [i] = listaJurados[i].substring(listaJurados[i].indexOf(":") + 1);
        
    }

    return notas;
}

//Ejercicio 4



function principal() {

    let cadenaCaracteres = "Jurado1:4.56#Jurado2:nulo#Jurado3:9.28#Jurado4:3.34#Jurado5:5.9#Jurado6:7.32"

    let listaNotas = parsearNotas(cadenaCaracteres);

    listaNotas = redondearElementos (listaNotas);

    listaNotas = eliminarExtremos(listaNotas);

    let suma = 0;

    for (const iterator of listaNotas) {
     
        suma+= iterator;
    }

    let media = suma / listaNotas.length;

    alert(media);

}

principal();



