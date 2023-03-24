let Num1 = Number(prompt("Introduce el primer número: "));
let Num2 = Number(prompt("Introduce el segundo número: "));
let Num3 = Number(prompt("Introduce el tercer número: "));

// let Num2 = parseInt(prompt("Introduce el segundo número: "));
// let Num3 = parseInt(prompt("Introduce el tercer número: "));


// let listaNumeros = [[Num1, Num2, Num3]] //SE DEBE DEFINIR EL ARRAY ANTES DE LLAMAR A LA FUNCION GLOBAL OrdenMayorAMenor Y OrdenMenorAMayor PARA MOSTRA EL CONSOLE LOG, ALERT O DOM.


//listaNumeros.sort(function(a,b){return b-a});


// function Test (){

//     var listaOrdenada = listaNumeros.sort((a,b)=> b-a);
//     return listaOrdenada;
    
// }

ListaNumeros = [Num1,Num2,Num3]

function MenorAMayor (a,b){

   {return a-b};
    }

function MayorAMenor (a,b){

    {return b-a};
}


    console.log("Los numeros introducidos originalmente son: " + ListaNumeros)
    console.log(ListaNumeros.sort(MenorAMayor));
    console.log(ListaNumeros.sort(MayorAMenor));


    if ((Num1 == Num2) && (Num2 == Num3)){
        
        console.log("Los numeros ", Num1, Num2, Num3, " son numeros iguales.");
    }

    
    else if(Num1 == Num2){
        
    console.log("Los numeros ", Num1, Num2, " son iguales, mientras ", Num3, " es diferente.")    
        }

    else if (Num2 == Num3){

    console.log("Los numeros ", Num2, Num3, " son iguales, mientras ", Num1, " es diferente.")   
    }

    else if (Num1 == Num3){

        console.log("Los numeros ", Num1, Num3, " son iguales, mientras ", Num2, " es diferente.")   
        }


// }
// while (condition) {
    
// }
// while (condition) {
    
// }

// for (let index = 0; index < 5; index++) {
//     const element = array[index];
    
// }

//let listaOrdenada = sort.((a,b)=> b-a);

// alert(NumOriginal,NumModificado);


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

