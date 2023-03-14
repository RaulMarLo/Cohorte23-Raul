package pruebas.JUnit.RML.app;

public class Lasagna {
	  
	   // TODO: define the 'expectedMinutesInOven()' method

	    public int expectedMinutesInOven(){

	        int n1 = 40;
	    	
	        return  n1;
	    }
	    
	    // TODO: define the 'remainingMinutesInOven()' method

	    public int remainingMinutesInOven(int n2){

	       int n3 = (expectedMinutesInOven()-n2);
	        
	        return  n3;
	    }
	    
	    // TODO: define the 'preparationTimeInMinutes()' method

	    public int preparationTimeInMinutes(int n3){

	    	
	        int n = (n3*2);
	        
	        return  n;
	    }
	    
	    // TODO: define the 'totalTimeInMinutes()' method


	    public int totalTimeInMinutes(int n1,int n2){

	        int n3 = preparationTimeInMinutes(n1);
	        int n4 = n2+n3;
	        
	        return  n4;
	    }
	}
