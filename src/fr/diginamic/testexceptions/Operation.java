package fr.diginamic.testexceptions;

import java.io.IOException;

public class Operation {

	
	public static double diviser(double a, double b) throws DivException { 
		
			if (b == 0) { 
				throw new DivException("Division par zéro!");	
			}

			return a / b;
			

		
		
	}
	
	
	
	
}
