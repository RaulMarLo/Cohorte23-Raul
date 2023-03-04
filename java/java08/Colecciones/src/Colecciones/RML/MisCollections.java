package Colecciones.RML;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MisCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		//wrapperClass();
		MisCollections c = new MisCollections();
		//imprimir(c.listaCollections());
		//se llama al metodo, especificamente imprimir usando la clase hija listaCollections.
		//imprimir(c.setCollections());
		//imprimir((Collection) c.mapCollections());
		mapCollections();
		
	}
	
	//UNA COLECCION UTILIZA CLASES QUE POTENCIALIZA A LOS ARREGLOS.
	
	//Se declara el metodo WrapperClass
	static void wrapperClass() {
		// byte, short, long, int, float, double, char
		
		byte numeroB = 12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max de un byte es " + Byte.MAX_VALUE);
		System.out.println("Valor Min de byte es " + Byte.MIN_VALUE);
		//Se llama a las propiedades de el tipo Byte, en este caso usamos SIZE y MAX VALUE

		System.out.println("--->" + numeroB);
		
		System.out.println("Tamaño de un entero " + Integer.SIZE);
		System.out.println("Valor Max de un entero es " + Integer.MAX_VALUE);
		System.out.println("Valor Min de byte es " + Integer.MIN_VALUE);
		
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor Max de un short es " + Short.MAX_VALUE);
		System.out.println("Valor Min un short es " + Short.MIN_VALUE);

		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor Max de un long es " + Long.MAX_VALUE);
		System.out.println("Valor Min un long es " + Long.MIN_VALUE);
		
		long NumeroLong = -922337203685477580l;
		

	}
	
	private static void mapCollections() {
		
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		
	}
	
	
	
	Set setCollections() {//Set no admite elementos duplicados.
	Set miSet = new HashSet();
	
	miSet.add("Uno");
	miSet.add("Dos");
	miSet.add("Tres");
	miSet.add("Cuatro");
	
	System.out.println("set");
	
	miSet.add(miSet);
	
	System.out.println(miSet);
	
	
	System.out.println(miSet.contains("Uno"));
	//Contains checa que el set cuente con el elemento definido, en este caso Uno.
	
	
	return miSet;
	}
	
	
	
	
	List listaCollections() {
		
		List miLista = new ArrayList();
		System.out.println("Tamaño de la lista antes " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());
		//Se manda el mensaje de la lista antes de usar el metodo add a la lista, que añade los numeros 1,2,3.
		
		
		//Se añaden los elementos , 1,2 y 3 en la lista. 
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(0, "Pato");
		
		miLista.set(0, miLista); //Con set remplazamos un elemento en el indice definido, seguido de el elemento que se remplazara.
		
		
		
		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty()); //Con .isEmpty analizamos si la lista esta vacia, dando un resultado booleano, en este caso si la lista tiene elementos el resulatdo sera false.
		
		return miLista;
	}
	
	private static void imprimir (Collection collection)
	//Collection collection define que se usara todas las collecciones (Set, List, etc.) Tambien se puede usar Set set, para solo usar set.
	{
		
		
	}
	
	
}

