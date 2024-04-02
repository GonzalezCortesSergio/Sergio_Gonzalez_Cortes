let boton = document.getElementById ("boton");
let contador = 0;
boton.addEventListener ("click", botonPulsado);


function botonPulsado () {


   /* let texto = prompt("Diga el texto del nuevo elemento");

    //Obtengo la lista

    let lista = document.querySelector("ol");

    //Creo el nuevo elemento

    let nuevoLi = document.createElement("li");

    //Le doy contenido 

    nuevoLi.innerText = texto;

    //nuevoLi.innerText = prompt ("Diga el texto del nuevo elemento");

    //Añado el li al ol

    lista.append(nuevoLi);
    */

    /*let zonaMensajes = document.querySelector(".zonaMensajes");

    let nuevoP = zonaMensajes.cloneNode(true);
    
    nuevoP.querySelector("strong").innerText = contador++;

    zonaMensajes.after(nuevoP);
    */

    document.querySelector("strong").innerText = contador++;
}