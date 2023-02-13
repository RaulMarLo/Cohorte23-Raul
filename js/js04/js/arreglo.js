let lista = [12, 5, 80, 34, 7];
let listaNueva = lista.slice(1,3);
console.log(listaNueva)

lista.push(100);
console.log(lista);

let masE= lista.concat(100,200,300);
console.log(masE);

// console.log(lista.lenght);

for (let i = 0; i < lista.length; i++) {
    console.log(lista[i]);
}
console.log(lista);