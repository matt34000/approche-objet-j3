package fr.diginamic.formes;

public class AffichageForme {

	public void afficher(Forme form) {
		System.out.println("P�rim�tre de la forme: " + form.calculerPerimetre());
		System.out.println("Surface de la forme: " + form.calculerSurface());
	}

}
