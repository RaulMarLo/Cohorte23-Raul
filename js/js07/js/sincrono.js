alert('Cohorte 23');
console.log('Hola, buenn díaa');
console.log('adios');

// setTimeout(
//     function () {
//         console.log('Hola mundo, con retraso');
//     }, 1000//Funcion se ejecuta despues de 100 milisegundos, por esta cuestion 'Hola mundo, con retraso' se muestra en la consola despues de 'sorpresa'.
// )
// console.log('Sorpresa');

const myCallBack = () => console.log('Hola mundo, con retraso');
setTimeout(myCallBack, 0);//Funcion sigue siendo asincrona incluso poniendo un perametro de 0 milisegundos.

console.log('Sorpresa');