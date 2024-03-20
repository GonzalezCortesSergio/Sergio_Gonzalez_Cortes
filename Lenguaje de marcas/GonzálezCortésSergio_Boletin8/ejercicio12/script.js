
let listaNumeros = [5, 4, 1, 2, 3, 6, 7, 10, 9, 8];

function compararNumeros (n1, n2) {

    if (n1 > n2) {

        return 1;
    }

    else {

        if (n1 < n2) {

            return -1;
        }

        return 0;
    }
}

function ordenarLista (listaNumeros) {

    return listaNumeros.sort(compararNumeros);

}

let listaOrdenada = ordenarLista(listaNumeros);

alert(listaOrdenada);