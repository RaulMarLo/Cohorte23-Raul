let Num1 = parseInt(prompt("Introduce el primer número: "));
let Num2 = parseInt(prompt("Introduce el segundo número: "));
let Num3 = parseInt(prompt("Introduce el tercer número: "));


let listaNumeros = [[Num1, Num2, Num3]] //SE DEBE DEFINIR EL ARRAY ANTES DE LLAMAR A LA FUNCION GLOBAL OrdenMayorAMenor Y OrdenMenorAMayor PARA MOSTRA EL CONSOLE LOG, ALERT O DOM.

function OrdenMayorAMenor(a,b){
    return a-b;
}

function OrdenMenorAMayor(a,b){
    return b-a;
}


alert(listaNumeros.sort(OrdenMayorAMenor));

/*if (Num1>Num2 & Num1>=Num3){

    if (Num1=Num3) console.log(Num3 + " = " + Num1 + " > " + Num2)
    else if (Num1>Num3 && Num2>Num3) console.log(Num1 + " > " + Num2 + "> " + Num3)
    else console.log(Num1 + " > " + Num3 + " > " + Num2)
}

else if (Num1>=Num2 & Num1>Num3){
    if (Num1=Num2) console.log(Num1 + " = " + Num2 + "> " + Num3)
    else if (Num1>Num2 && Num3>Num2) console.log(Num1 + " > " + Num3 + "> " + Num2)
    else console.log(Num1 + " > " + Num2 + " > " + Num3)
}

else if(Num2>Num1 && Num2>=Num3){
    if (Num1>=Num3) console.log(Num2 + ", " + Num1 + ", " + Num3)
    else console.log(Num2 + ", " + Num3 + ", " + Num1)
}

else if(Num2>=Num1 && Num2>Num3){
    if (Num1>=Num3) console.log(Num2 + ", " + Num1 + ", " + Num3)
    else console.log(Num2 + ", " + Num3 + ", " + Num1)
}

else if(Num3>Num1 && Num3>=Num2){
    if (Num1>Num2) console.log(Num3 + ", " + Num1 + ", " + Num2)
    else console.log(Num3 + ", " + Num2 + ", " + Num1)
}

else if(Num3>=Num1 && Num3>Num2){
    if (Num1>Num2) console.log(Num3 + ", " + Num1 + ", " + Num2)
    else console.log(Num3 + ", " + Num2 + ", " + Num1)
}

else if(Num1===Num2 && Num1===Num3){
    console.log(Num1 + " = " + Num2 + " = " + Num3)
}

else {
    console.log("Lo ingresado es diferente a numeros.")
}*/

