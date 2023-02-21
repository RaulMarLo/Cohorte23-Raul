//Objeto: Se puede definir como una instancia de una clase.

class operacionesAritmeticas {
    numero0 = 5;
    numero1 = 0;

    constructor(valor0, valor1) {
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(a, b) {
        return a + b;
    }
}//Se usa la palabra reservada class para definir un objeto asbstracto, dentro de la clase se le definen atributos y caracteristicas que definen al objeto. En la forma clasica de Orientacion de objetos, no se define como var, const, etc.

let obj4 = new operacionesAritmeticas(8, 6); // Aqui 8 y 6 se reasignan a valor0 y a valor1 respectivamente.
console.log(obj4.sumar(obj4.numero0, obj4.numero1)); //Output: 14

let obj3 = new operacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;
console.log(obj3.sumar(obj3.numero0, obj3.numero1)); //Output: 13

let obj2 = new operacionesAritmeticas();
console.log(obj2.sumar(5, 6));//Aqui se demuestra que sumar es un atributo que se le definio como una suma, pero sigue siendo un atributo. //Output: 11

let obj1 = new operacionesAritmeticas(); //Se le pone objetos ya que no se le llama a la clase antes definida sino a una función llamada constructor.
console.log(obj1.numero0) //Output: 5