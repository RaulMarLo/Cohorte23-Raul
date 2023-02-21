Object //'Object' es una super clase donde se conjuntan todas las clases de dicho objeto.

class persona {

    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    set nombre(nombre) {
        this._nombre = nombre;//Necesita renombrarse this._nombre en el constructor.
    }//Set le asigna un nombre a 'nombre'.

    get nombre() {
        return this._nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }

    get apellido() {
        return this._apellido;
    }

    nombreCompleto() {
        return this._nombre + ' ' + this._apellido;
    }

    toString() {//Sobreescribe el metodo de la clase padre object.
        return this.nombreCompleto();
    }
    //Polimorfismo es una clase que se define como padre y se ejecuta como una clase definida como hija.
}//Los atributos se definiran ahora con el metodo constructor.


class empleado extends persona {
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido, departamento)
        this.departamento = departamento;
    }

    set departamento(departamento) {
        this._departamento = departamento;
    }

    get departamento() {
        return this._departamento;
    }

    //sobreescritura
    nombreCompleto() {
        return super.nombreCompleto() + ' , ' + this._departamento;
    }
}

// let persona3 = new persona('Johnny','Depp');
// console.log(persona3.nombre);

let persona1 = new persona('Juan', 'Perez');
console.log(persona1.toString());

let empleado1 = new empleado('Maria', 'Perez', 'Sistemas')

console.log(empleado1);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());

// console.log(persona1.nombre); //Una forma alternativa de acceder a los atributos.
// console.log(persona1.apellido);

// let persona2 = new persona('Maria', 'Jimenez');
// console.log(persona2);

// console.log(persona2.nombre);
// console.log(persona2.apellido);