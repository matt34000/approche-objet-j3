package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {

	
	public static Cercle creerCercle(double pRayon) {

		Cercle cerc = new Cercle(pRayon);
		return cerc;
	}
	
	
}
