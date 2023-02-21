function añadirPuntos(texto){
    return texto.split('').join(".").toString();//toString es una palabra reservada que convierte el resultado en un string.
}

let texto = 'HoLa Mundo';

textoModificado = (añadirPuntos(texto));
textoModificado = textoModificado.substring(7,0) + " " + textoModificado.substring(10,19)

console.log(textoModificado)