let persona = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto: function(){
        return 'el nombre es ' + this.nombre + ' ' + this.apellido;}
}//Se declara una variable a la que se le asigna la definicion del objeto. 'this' es una palabra reservada que se refiere a los atributos del objeto.

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());