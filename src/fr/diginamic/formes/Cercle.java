package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon = 0;

	public Cercle(int ray) {
		this.rayon = ray;
	}

	@Override
	public double calculerSurface() {

		double surfaceCercle = Math.PI * Math.pow(this.rayon, 2);
		return surfaceCercle;
	}

	@Override
	public double calculerPerimetre() {

		double perimetreCercle = (2 * Math.PI * rayon);
		return perimetreCercle;
	}

}
