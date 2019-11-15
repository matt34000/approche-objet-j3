package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		
		Cercle cercle1 = new Cercle(5);
		System.out.println(cercle1);
		System.out.println("Perimetre : " + cercle1.calcPerimetre());
		System.out.println("Surface : " + cercle1.calcSurface());
		
		Cercle cercle2 = new Cercle(7);
		System.out.println(cercle2);
		System.out.println("Perimetre : " + cercle2.calcPerimetre());
		System.out.println("Surface : " + cercle2.calcSurface());

		Cercle cercle3 = new Cercle(75);
		System.out.println(cercle3);
		System.out.println("Perimetre : " + cercle3.calcPerimetre());
		System.out.println("Surface : " + cercle3.calcSurface());
		

	}

}
