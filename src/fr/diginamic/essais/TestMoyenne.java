package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;


public class TestMoyenne {

	public static void main(String[] args) {
		

	
		CalculMoyenne calcMoyenne = new CalculMoyenne();
		
		calcMoyenne.ajoutNombre(5);
		
		calcMoyenne.ajoutNombre(66);
		
		calcMoyenne.ajoutNombre(777);
		
			
		
		double moy = calcMoyenne.calculmoy();
		System.out.println("Moyenne: " + moy);
		
		//j'otiens un NaN : Not a Number
		// je n'arrive pas à debugguer le fichier CalculMoyenne.java
		// System.out ou System.err n'apparaissent pas dans la console ?
		// comment on fait dans ce cas là ?
		
		
	}

}
