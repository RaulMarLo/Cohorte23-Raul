const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];


const myString = 'Brandon'


function CompararNumCaracteres (a, b){
    
    let arrayVacio = [];


    for(let i = 0; i < a.length; i++){
        if(a[i].length > b.length){


        arrayVacio.push(a[i]);
    }
    
}
return arrayVacio;
}

let Resultado = (CompararNumCaracteres(myArray,myString));
console.log(Resultado);
