import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseMethod {

	
public static String reverse(String phrase) {
		
		//List<String> myList = new ArrayList<String>(Arrays.asList(s.split(","))); OTRA OPCIÓN
		List<String> ls = Arrays.asList(phrase.split(""));
		
		Collections.reverse(ls);
		String palabra = String.join("", ls);
		return palabra;
	
}
}
