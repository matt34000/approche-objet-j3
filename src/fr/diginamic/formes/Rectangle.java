package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private double longueur;	
	private double largeur;


	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {

		double surfaceRect = (this.longueur + this.largeur) * 2;
		return surfaceRect;
	}

	@Override
	public double calculerPerimetre() {

		double perimetreRect = this.longueur * this.largeur;
		return perimetreRect;
	}

}
