package fr.diginamic.entites;

public class Cercle {

	// variables
	private double rayon = 0;

	// Constructor
	public Cercle(int ray) {
		this.rayon = ray;
	}
	
	// methode perimetre
	public double perimetre() { 
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}

	// methode surface
	public double surface() { 
		double surface = Math.PI * (rayon * rayon);
		return surface;
	}


	
}
