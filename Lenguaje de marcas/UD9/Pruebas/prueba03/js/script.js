let boton = document.getElementById ("boton");

boton.addEventListener ("click", botonPulsado);


function botonPulsado () {


    let texto = prompt("Diga el texto del nuevo elemento");

    //Obtengo la lista

    let lista = document.querySelector("ol");

    //Creo el nuevo elemento

    let nuevoLi = document.createElement("li");

    //Le doy contenido 

    nuevoLi.innerText = texto;

    //nuevoLi.innerText = prompt ("Diga el texto del nuevo elemento");

    //Añado el li al ol

    lista.append(nuevoLi);
}