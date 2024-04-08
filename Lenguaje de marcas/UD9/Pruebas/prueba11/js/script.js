

let cuadradichi = document.querySelector("div");

cuadradichi.addEventListener("mouseover", ratonSobre);

function ratonSobre (elevento) {

   // let elh1 = this.querySelector("h1");

    let elh1 = this.firstElementChild;

    elh1.style.display = "block";
} 