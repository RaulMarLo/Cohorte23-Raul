import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca una palabra: ");
		String phrase = input.nextLine();
		input.close();
		System.out.println("La palabra introducida al reves es: "+ ReverseMethod.reverse(phrase));	
		
	}

}
