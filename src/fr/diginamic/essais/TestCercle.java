package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		
		Cercle cercle1 = new Cercle(5.99);
		System.out.println("Cercle 1");
		System.out.println("Perimetre : " + cercle1.calcPerimetre());
		System.out.println("Surface : " + cercle1.calcSurface());
		
		Cercle cercle2 = new Cercle(7.11);
		System.out.println("Cercle 2");
		System.out.println("Perimetre : " + cercle2.calcPerimetre());
		System.out.println("Surface : " + cercle2.calcSurface());

		Cercle cercle3 = new Cercle(64.339);
		System.out.println("Cercle 3");
		System.out.println("Perimetre : " + cercle3.calcPerimetre());
		System.out.println("Surface : " + cercle3.calcSurface());
		
		Cercle cercle4 = CercleFactory.creerCercle(7.519);
		System.out.println("Cercle 4");
		System.out.println("Perimètre: " + cercle4.calcPerimetre());
		System.out.println("Surface: " + cercle4.calcSurface());

	}

}
