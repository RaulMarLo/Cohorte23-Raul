var elementoID = document.getElementById('botonSuma')
console.log(elementoID)


var elementoEtiqueta = document.getElementsByTagName('button');
console.log(elementoEtiqueta),
console.log('Esto es una colección de elementos de mis botones', elementoEtiqueta[0]); //elementoEtiqueta se le asigno los elementos de tag name 'button'.


//Coleccion de HTML son listas de elementos que comparte HTML pero ocupan metodos distintos a los arrays.

var elementoClassName = document.getElementsByClassName('botones');
console.log(elementoClassName);

//  QuerySelector remplazan a los metodos tradicionales

// Metodos Recientes:

//     -document.querySelector(.botones)
//     -document.querySelectorAll(.botones)

// var unElemento = document.querySelector('#input1');
// console.log(unElemento);

// var variosElementos = document.querySelectorAll('.botones');
// console.log(variosElementos);

var input1 = document.getElementById('input1');
var input2 = document.getElementById('input2');

var botonSuma = document.getElementById('botonSuma');
var botonResta = document.getElementById('botonResta');
var botonMultiplicación = document.getElementById('botonMultiplicación');
var botonDivisión = document.getElementById('botonDivisión');

var resultado = document.getElementById('resultado');

/*
Creación de Nodos

    -document.createElement(tipoNodo)
*/

//Creación de una etiqueta del tipo imagen
var imagenPerrito = document.createElement('img');

imagenPerrito.src = 'https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg';
imagenPerrito.alt = 'Foto de perrito tierno';
imagenPerrito.style.width = '150px';

//Finaliza y pone el elemento etiqueta o nodos en el documento html.
document.body.append(imagenPerrito);

//Actualizar o modificar elementos o nodos
//1er Paso: Identificar el elemento o nodo que quiero cambiar (outer)
//2ndo Paso: Modificar el elemento o nodo(inner)

var resultadoQueCambia = document.getElementById('resultado');

resultadoQueCambia.innerHTML='Saludos, cambie el texto juas juas.'; //Se le especifica por innerHTML que le añada la string definida a la etiqueta resultadoQueCambia.

//Definir con que se va a interactuar y almacenerlo en una variable
const textoAModificar = document.querySelector('#h1')

//Decidir o definir la funcion que se va a a ejecutar, en este caso se ejecutara una función que cambiara el color a un azul.
// function cambiarColor(color){
//     textoAModificar.style.color = color;

// }


function suma(){
    let valor1 = parseInt(input1.value); //<input>
    let valor2 = parseInt(input2.value); //Se requiere definir el value ya que este value es el que regresa el valor del input, si se define sin .value lo que se mostrara son los inputs.
    let suma = valor1 + valor2; //Calculo la suma
    resultado.innerHTML = suma; //pongo el resultado en el lugar asignado

}


function resta(){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let resta = valor1 - valor2;
    resultado.innerHTML = resta;
}


function multiplicación(){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let multiplicación = valor1 * valor2;
    resultado.innerHTML = multiplicación;

}


function división(){
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let división = valor1 / valor2;
    resultado.innerHTML = división;

}

botonSuma.addEventListener('click',suma);
botonResta.addEventListener('click',resta);
botonMultiplicación.addEventListener('click',multiplicación);
botonDivisión.addEventListener('click',división);


/*Como se crea un elemento (addEventListener)

    -node.addEventListener ('Elemento a escuchar', lo que quiero que haga cuando se escuche)*/