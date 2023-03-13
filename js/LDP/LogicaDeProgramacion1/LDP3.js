
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
// var Darla = 0;
// var a = prompt("Introduzca un número: ");

// if (a === Darla) {
//     alert("El número de la serie Fibonacci es 0")
// }

// else {
//     //LOOP

//     for (i = 1; i < a; i++) {
//         a = a + i;

//         let ArregloFibo = [0]

//         ArregloFibo.push(a)
//     }

//     alert("Los números de la serie Fibonacci es " + ArregloFibo)

// }


// Función para validar si el dato de entrada es de tipo number
// function validarEntrada(dato) {
//     while (isNaN(dato)) {
//         dato = prompt("Error. Por favor ingrese un número válido:");
//     }
//     return parseInt(dato);
// }

// // Función para generar la serie de Fibonacci
// function fibonacci(numero) {
//     let a = 0, b = 1, temp;
//     const serie = [a, b];

//     for (let i = 2; i <= numero; i++) {
//         temp = a + b;
//         a = b;
//         b = temp;
//         serie.push(temp);
//     }

//     return serie;
// }



// // Pedir el número al usuario y validar la entrada
// let numero = prompt("Ingrese un número:");
// numero = validarEntrada(numero);

// // Generar la serie de Fibonacci y mostrarla en la consola
// const serie = fibonacci(numero);
// console.log(serie);

// Pedir al usuario que ingrese un número
let numero;
do {
  numero = prompt("Por favor ingrese un número:");
} while (isNaN(numero) || numero === "" || numero === null);
numero = parseInt(numero);

// Mostrar la serie de Fibonacci hasta el número ingresado
let serie = [0, 1];
for (let i = 2; i < numero; i++) {
  serie.push(serie[i-2] + serie[i-1]);
}
console.log(serie);



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


