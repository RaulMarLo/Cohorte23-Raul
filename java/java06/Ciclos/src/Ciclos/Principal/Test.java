package Ciclos.Principal;

import Ciclos.Control.DoSwitch;
import Ciclos.ForWhileDo.UsoDo;
import Ciclos.ForWhileDo.UsoFor;
import Ciclos.ForWhileDo.UsoWhile;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsoWhile ObjetoUW = new UsoWhile();//Se puede importar la clase cuando se escribe la clase.
		
		//ObjetoUW.cicloW();
		//ObjetoUW.centinelaW();
		//ObjetoUW.banderaW();
		
		UsoFor ObjetoUsoFor =new UsoFor();
		//ObjetoUsoFor.cicloFor();
		//ObjetoUsoFor.letrasfor();
		
		UsoDo ObjetoDo = new UsoDo();
		//ObjetoDo.cicloDo();
		
		DoSwitch dw = new DoSwitch();
		dw.controlador();
	}
	

}
