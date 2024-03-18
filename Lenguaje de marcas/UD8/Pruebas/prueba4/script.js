let num1 = prompt ("Dime un número");
let num2 = prompt ("Dime otro número");

if(!isNaN(num1) && !isNaN(num2)) {

    alert (parseInt(num1) + parseInt(num2));
}

else {

    alert ("Anda ar carajo");
    
}
