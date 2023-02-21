const myURL = document.URL.toString();
const promesa = fetch(myURL);//Fetch es otra palabra que denota un proceso asincronico, con mas control.
promesa.then(resultado => console.log(resultado),
e => console.log('error callback ${e}'));
