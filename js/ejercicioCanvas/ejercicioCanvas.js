// function getRandomInt(numeroAAdivinar) {
//     return Math.floor(Math.random() * max);
// }

// let numeroSecreto = Math.floor(Math.random() * 100)
// console.log(numeroSecreto);

// let numeroDeUsuario = parseInt(guess('Introduzca un numero'))

// function descubrir(){
//     if (numeroDeUsuario === numeroSecreto){
//         alert('Felicidades descubriste el numero secreto')}

//     else if (numeroDeUsuario > numeroSecreto){
//         alert('El numero introducido es mayor a el numero secreto')}

//     else if (numeroDeUsuario < numeroSecreto){
//         alert('El numero introducido es menor a el numero secreto')}

//     else alert('El numero introducido no es valido')
// }

// let secreto = Math.floor(Math.random()*100)
// console.log(secreto);
// class Jugador{
//     constructor(nombre, intentos){
//         this.nombre=nombre
//         this.intentos=intentos
//     }
// }
//     let name=prompt("ingresa tu nombre")
// let player=new Jugador(name,0)

// let ingresados=[]
// let verificar=()=>{
//     let texto
//     let number =Number(document.getElementById('number').value)
//     if(isNaN(number)){texto="Papi, dejate de cosas y poner un numero"
//     player.intentos+=1}
//     else {
//         if(number>100||number<0){texto="Hablo en chino? Te dije que del uno al 100" 
//         player.intentos+=1}
//     else if(number!=secreto){
//         texto=number>secreto?"Dale poquito pa abajo":"Dos pesitos mas"
//         player.intentos+=1
//         ingresados.push(number)
//     }else{texto="Ese mero carnal" 
//         secreto=Math.floor(Math.random()*100)
//         player.intentos+=1
//         if (localStorage.getItem(name)!=null)
//         {
//             if (localStorage.getItem(name)>player.intentos){alert("Has mejorado")
//             localStorage.setItem(`${player.nombre}` ,player.intentos)}
//             else{alert("Mas practica")}
//         }else{(localStorage.setItem(`${player.nombre}` ,player.intentos))}

        
        
        

//         setTimeout(() => {
//         document.getElementById('mensaje').innerHTML=""
//         document.getElementById('intentos').innerHTML="0"
//         ingresados=[] 
//         document.getElementById('ingresados').innerHTML=ingresados.toString() 
//     }, 5000);
// document.getElementById('ingresados').innerHTML="Ingresaste los siguentes numeros " +ingresados.toString()
// }
// }

// document.getElementById('mensaje').innerHTML=texto
// document.getElementById('intentos').innerHTML=player.intentos
// }
// document.getElementById('button').addEventListener("click", verificar)