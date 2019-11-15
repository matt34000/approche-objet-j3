package fr.diginamic.operations;

public class Operations {


	
	public static double calcul (double a, double b, char c) {
		
		double d = 0;
		
		if (c == '+') { 
			d = a + b;			
		}
		else if (c == '-') {
			d = a - b;				
		}
		else if (c == '*') {
			d = a * b;				
		}
		else if (c == '/') {
			d = a / b;				
		}
		
		return d;
	
	}
		
}
