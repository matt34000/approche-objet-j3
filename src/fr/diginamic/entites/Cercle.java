package fr.diginamic.entites;

public class Cercle {

	// variables
	private double rayon = 0;

	// Constructor
	public Cercle(double ray) {
		this.rayon = ray;
	}
	
	// methode perimetre
	public double calcPerimetre() { 
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}

	// methode surface
	public double calcSurface() { 
		double surface = Math.PI * (rayon * rayon);
		return surface;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}


	
}
