package pruebas.JUnit.RML.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.geom.Dimension2D;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebas.JUnit.RML.app.Calculadora;


class CalculadoraTest {
	
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecutando Before() --> configurandoBefore()");
	}
	
	
	@AfterEach public void configurandoAfter() {
		// TODO Auto-generated method stub

		ct = null;
		System.out.println("Ejecutando AfterEach() --> configurandoAfter()");
		System.out.println("-------------------");
	}
	
	
	//2. Se crea la clase test, junto con su metodo
	@Test
	public void calculadoraNull() {
		
		//3. Se crea el assertNull que verifica si el objeto es nulo
		assertNull(ct1, "La clase es una instancia nula");
		System.out.println("Ejecutando primer test ---> Calculadora (Test objeto Nulo");
		//4. Se ejecuta la prueba JUnit que chechara si ct es nulo
	}
	
	
	//5. Se crea un metodo con "assertNotNull" que verifica si el objeto es definido.
	@Test
	public void calculadoraDefinida() {
		// TODO Auto-generated method stub
		
		assertNotNull(ct, "La clase es una instancia definida");
		System.out.println("Ejecutando segundo test ---> Calculadora (Test objeto definido)");
		
		//6. Con "ct = null", el primer test pasara, sin embargo el segundo test fallara
	}

	
	//7. Si un hay un metodo de prueba despues de un metodo que retorna un test fallido, este se omitira.
	
	//8. Creamos un "BeforeEach" en la lina 16 que ejecutara cierto codigo antes de cada @Test
	
	//9. Creamos un "AfterEach" en la linea 25 que ejecutara cierto codigo despues de cada @Test
	
	
	
	/**********************Primeras Pruebas*******************/
	
	
	//10. Creamos un metodo que verificara las acciones que va a evaluar 
	@Test
	public void primerosAssets() {
		
		//1- Indicar que sera evaluado
		//2- Indicar que se realizara
		//3- Evaluar con assert respectivo
		
		
	//14. Con assert equals, asegura que el resultado sea el definido en los parametros()	
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(6,4);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test --> primerosAssert()");
		
	}
	
	//15. Se crea un test que evalua el metodo sumar
	@Test public void sumaTest() {
		// TODO Auto-generated method stub
		
		Calculadora calculadora = new Calculadora();
		assertEquals(20,  calculadora.sumar(10, 10));
		System.out.println("Ejecutando cuarto test --> primerosAssert()");
	
	}
	
	//16. Se crea un test que evalua que 1 sea igual a 1 y que ("Generation", "Generation") en otras palabras que la string Generation sea igual al string actual. (resultadoEsperado, resultadoActual)  
	@Test
	public void tiposAsserts() {
		assertTrue(1 == 1);
		//
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		
		//17. Aqui evalua con "assertSame" que el objeto 1 sea igual al segundo objeto (c1,c3) el cual retornara verdadero ya que declaramos que c3 = c1.
		assertSame(c1, c3);
		
		
		//18 Aqui evalua con "assertNotSame" que el objeto sea diferente , en este caso que c2 sea diferente a c3
		assertNotSame(c2, c3);
		
		//19. Con "assertEquals" compararemos dos objetos que a comparacion de "assertSame" definimos despues de los primeros 2 parametros (n1, n2, .5) define que tiene una tolerancia de .5
		assertEquals(1, 1.5, .5);
	}
	
	@Test
	public void validandoSuma() {
		//20. Validamos la suma con los parametros (resultadoEsperado, resultadoActual) (11, ct.sumar(5,6))
		assertEquals(11,ct.sumar(5, 6));
	}
	
	//21. Validamos ct.restar con parametros definidos
	@Test
	public void validandoResta () {
		
		assertEquals(50, ct.restar(56, 6));	
	}
	
	//22. Validamos ct.restar con parametros definidos
	@Test
	public void validandoRestaNegativa() {
		
		assertEquals(-10, ct.restar(10, 20));
	}
	
	//23. Validamos ct.division con parametros definidos
	@Test
	public void validandoDivision() {
		
		assertEquals(5, ct.division(50, 10));
	}
	
	//24. Validamos con ct.divisionEntreZero con parametros definidos, en este caso el metodo tiene un if, entonces mostrara una lina amarilla ya que depende del parametro toma un resultado
	
	
	@Disabled //25. Disabled desactiva el test
	@Test
	public void validandoDivisionEntreZero() {
		
		assertThrows(ArithmeticException.class, ()->ct.divisionEntreZero(10, 1),"Division entre cero es indefinido");
		}

}
