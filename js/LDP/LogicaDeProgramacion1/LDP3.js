
// let Num1 = (prompt("Introduce un numero compaye: "));

// let Factorial = 1;

// if (!isNaN(Num1)){

//     for (i = Num1; i >= 1; i--) {

//         Factorial = Factorial * i;

//     }
    
//     alert(Factorial);
// }

// if (isNaN(Num1)) {

//     alert(Num1 + "no es un numero.");
// }

//Crear un programa en Javascript que realice lo siguiente:

//Debe solicitar al usuario un número por prompt o por input y guardarlo.
    var Darla = 0;
    var a = prompt("Introduzca un número: ");

if (a === Darla) {
    alert("El número de la serie Fibonacci es 0")
} 

else {
    //LOOP

    for (i = 1; i < a; i++) {
        a = a + i;
    
        let ArregloFibo =  [0]
    
        ArregloFibo.push(a)
    }

alert("Los números de la serie Fibonacci es " + ArregloFibo)

}









// const factorial = numero => {
// 	if (numero < 0) numero = numero * -1;
// 	if (numero <= 0) return 1;
// 	let factorial = 1;
// 	while (numero > 1) {
// 		factorial = factorial * numero;
// 		numero--;
// 	}
// 	return factorial;
// }

// for (let x = 0; x < 5; x++) {
// 	console.log(`El factorial de ${x} es ${factorial(x)}`);
// }


