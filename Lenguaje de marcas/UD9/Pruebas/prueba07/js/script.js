let boton = document.getElementById("boton");

boton.addEventListener("click", botonPulsado);

function botonPulsado () {

    //Obtengo la lista

    let lista = document.querySelector("ol");

    let segundoLi = lista.querySelector("li:nth-child(2)");

    //Añado el li al ol
    lista.append(segundoLi);
}