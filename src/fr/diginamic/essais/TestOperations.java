package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		
		System.out.println("op1 : " + Operations.calcul(5.99,10.61,'+')); 		
		System.out.println("op2 : " + Operations.calcul(24.53,6.83,'-')); 		
		System.out.println("op3 : " + Operations.calcul(2.35,8,'*')); 		
		System.out.println("op4 : " + Operations.calcul(378.1,19,'/'));
		
		
	}

}
