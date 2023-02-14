let listaNombres = ['Maria', 'Antony', 'Joy', 'Juan']
let añadirNombre = (prompt('Indica el nombre que quieres añadir a la lista: '))

listaNombres.push(añadirNombre)
console.log(listaNombres)

let conocerNombre = (prompt('Indica el nombre que quieres conocer si pertenece en la lista: '))
alert(listaNombres.includes(conocerNombre))

let listaNombres2 = (prompt('Introduce a continuación la segunda lista de nombres.'))
let listaNombres3 = listaNombres.filter(element => listaNombres2.includes(element)) //En esta declaracion al incio tuvimos problemas ya que quisimos comparar la lista de Nombres 2 (la cual es la que el usuario va a introducir) con la lista de Nombres 1, en este caso JS retornaba error ya que lista de Nombres 2 no es una funcion.
alert(listaNombres3)

let listaNombresaNumeros = (prompt('Introduce la lista de nombres: '))

let numeroaFiltrar = prompt('Introduce un número: ')
console.log(numeroaFiltrar)

function funcionNumeroaFiltrar() {
    let numeroaFiltrar = prompt('Introduce un número: ');

    if (numeroaFiltrar < 0)
        alert(numeroaFiltrar + 'es menor a 0.');

    else if (numeroaFiltrar = 0)
        alert(numeroaFiltrar + 'es igual a 0.');

}