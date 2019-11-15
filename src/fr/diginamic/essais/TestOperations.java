package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		
		System.out.println("op1 : " + Operations.calcul(5.99,10.01,'+')); // 16
		
		System.out.println("op2 : " + Operations.calcul(24.53,7.53,'-')); // 17
		
		System.out.println("op3 : " + Operations.calcul(2.4,7.5,'*')); // 18
		
		System.out.println("op4 : " + Operations.calcul(95,5,'/')); // 19
		
		
	}

}
