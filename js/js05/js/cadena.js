// let texto = 'Hola Mundo'; //definimos la cadena de caracteres que le asignaremos a texto.
// let mensaje = 'El texto tiene ' + texto.length + ' caracteres.';//esta cadena de caracteres e puede ver como un objeto o un arreglo.
// console.log(mensaje); //el codigo imprime cuantos caracteres tiene la palabra que se definio en texto, en este caso 'Hola Mundo', el cual tiene 10 caracteres.


//Añadir
let texto = 'Hola Mundo';
let mensaje =' ';

for (let index = 0; index < texto.length; index++)//creamos el ciclo
    {mensaje += texto[index] + ' '; //con el operado '+=' concatenamos mensaje con el texto
}


// //trim
// mensaje = mensaje.trim() //'trim' es un operador que quita los espacios al inicio y final de la cadena de caracteres, en este caso al final ya que no hay espacios en blanco al incio.

console.log(mensaje);


// //toUpperCase
// let texto='Hola Mundo';
// let mensaje = texto.toUpperCase(); //'toUpperCase' es una palabra reservada que convierte cada caracter de la cadena de texto a mayusculas.
// console.log(mensaje);


// //substr
// let texto='Hola Mundo';
// let palabra=texto.substr(0,7);//'substr' es una funcion que nos regresa los caracteres de la cadena depende de donde lo definamos, en este caso del caracter 0 al 7 se mantienen en la cadena. 
// //Si solo se define (7) entonces mostrara lo restante desde el caracter 7, en este caso seria substr(7); Output: 'ndo'.
// //Si se define con un signo negativo (-8) se mostrara desde la derecha a la izquierda. Output: 'la Mundo'

// console.log(palabra);// Output: 'Hola Mu'


// //substring
// let texto='Hola Mundo';
// let palabra = texto.substring(3,7);//'substring' es una funcion que regresa los caracteres despues del primer digito definido hasta el ultimo digito definido incluyendolo. (3,7) Output:'a Mu'
// console.log(palabra);


// //split
// let texto='Hola Mundo';
// let palabra = texto.split(' ');//'split' es un operador que divide la cadena de caracteres en cada caracter definido dentro de la funcion(), en este caso (' ') esta deividiendo la cadena de caracteres en cada espacio. Despues de separarlo lo convierte en cada elemento en un array. Output: ['Hola', 'Mundo'].
// console.log(palabra);


//includes
let texto='Hola Mundo';
    if(texto.includes('Hola'))//'includes' busca el caracter definido en la cadena de caracteres. En este caso se esa definiendo un condicional que se ejecuta si el booleano regresa como true. Output:'Esta cadena incluye el caracter:  l'
        {console.log('Esta cadena incluye el caracter:  l');
    }

    else{
        console.log('Este caracter o caracteres no pertenecen en el texto')
    }


