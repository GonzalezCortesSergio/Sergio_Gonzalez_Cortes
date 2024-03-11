let n = prompt ("Introduzca un número entero y se calculará su factorial");
let factorial = 1;

for (let index = n; index > 0; index--) {
    
    factorial*= index;
    
}

alert ("El factorial de " + n + " es " + factorial);