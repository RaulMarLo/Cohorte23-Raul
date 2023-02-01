let miVariable = 34;

let miArreglo = []; //declaracion literal
let miArreglo01 = new Array(); //declaracion por instancia

let miArreglo02 = [31,32,33,34]; //
console.log('Dato de miArreglo en el indice 0 - ' + miArreglo02[0]);
console.log('Dato de miArreglo en el indice 1 - ' + miArreglo02[1]);
console.log('Dato de miArreglo en el indice 2 - ' + miArreglo02[2]);
console.log('Dato de miArreglo en el indice 3 - ' + miArreglo02[3]);
console.log('El tamaño del número de elementos del arreglo 02 es: '+ miArreglo02.length); //Existe una manera de saber de que tamaño es el arreglo

let miArreglo03 = ['Hola', 'que', 'tal']; //Arreglo de tipo de caracteres
console.log(miArreglo03[0]);
console.log(miArreglo03[1]);
console.log(miArreglo03[2]);
console.log('El tamaño del número de elementos del arreglo 03 es: ' + miArreglo03.length);

let miArreglo04 = [{nombre:'Raúl'}, {apellido: 'Martínez'}, {edad: 26}]; //Arreglo de tipo objeto [{propiedad: valor de la propiedad}]
console.log('Elemento del arreglo de tipo objeto miArreglo04: ' + miArreglo04[0].nombre); //Si se escribe dentro de los corchetes 0, marcara Object. Tambien se puede escribir como miArreglo[0]['nombre']
console.log('Elemento del arreglo de tipo objeto miArreglo04: ' + miArreglo04[1].apellido);
console.log('Elemento del arreglo de tipo objeto miArreglo04: ' + miArreglo04[2].edad);
console.log('El tamaño del número de elementos del arreglo 04 es: ' + miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log ('Orden de mi arregloNuevo: ' + nuevoArreglo00.sort()); //Sort es un metodo que permite ordenar el arreglo
console.log ('Orden de mi arregloNuevo: ' + nuevoArreglo00.pop()); //Pop es un metodo que muestra el ultimo elemento del arreglo
console.log ('Orden de mi arregloNuevo: ' + nuevoArreglo00.push(10)); //Push es un metodo que añade un elemento al arreglo
console.log ('Orden de mi arregloNuevo: ' + nuevoArreglo00.reverse()); //Reverse es un metodo que orderna de mayor a menor el arreglo

console.log('javascript'[2]); //Muestra el tercer caracter de la palabra javascript
console.log('javascript'.length); //Muestra el tamaño de caracteres de la palabra javascript

let matriz = [[1,2,3],[4,5,6],[7,8,9]]; //Arreglo en arreglo, un arreglo bidimensional
/*let matriz = [
                [1,2,3],
                [4,5,6],
                [7,8,9]
            ]; //Arreglo en arreglo, un arreglo bidimensional de otra manera de ver la matriz*/
console.log('Tamaño de la matriz: ' + matriz.length); //Muestra el tamaño de los elementos de la matriz, solo de los elementos principales en vez de los sub elementos de cada elemento principal.
console.log(matriz[1][1]); //Muestra el subelemento de cada elemento [Elemento][Subelemento]