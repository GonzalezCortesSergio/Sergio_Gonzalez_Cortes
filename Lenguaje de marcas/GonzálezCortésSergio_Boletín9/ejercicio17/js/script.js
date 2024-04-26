let botonesEditar = document.querySelectorAll(".btnEditar");

for (boton of botonesEditar) {

    boton.addEventListener("click", editarColumna);
}

function editarColumna(evento) {

    this.classList.toggle("bi-save");
    
}