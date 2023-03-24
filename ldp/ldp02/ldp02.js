
let temperatureUser = parseFloat(prompt("Introduzca temperatura en grados Celsius"));

function convertirCelsiusAFahrenheit(){

    let tempFahrenheit = (temperatureUser*(9/5))+32;

    alert(temperatureUser + " grados Celsius son " + tempFahrenheit + " grados Fahrenheit.");
}

function convertirCelsiusAKelvin(){

    let tempKelvin = (temperatureUser + 273.15);

    alert(temperatureUser + " grados Celsius son " + tempKelvin + " grados Kelvin.");
}

convertirCelsiusAFahrenheit();
convertirCelsiusAKelvin();



