package fr.diginamic.essais;

import fr.diginamic.formes.AffichageForme;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {


	public static void main(String[] args) {
		Cercle cer = new Cercle(10);
		Rectangle rect = new Rectangle(4, 5);
		Carre car = new Carre(5);
		
		AffichageForme aff = new AffichageForme();
		aff.afficher(cer);
		aff.afficher(rect);
		aff.afficher(car);
		
		
		// vu que je n'arrivais pas à bien faire l'exercice j'ai fini par faire un copié collé
		// et ca ne marche pas non plus
		// je n'arrive pas à résoudre le bug :
		// The method calculerPerimetre() is undefined for the type Forme
		// The method calculerSurface() is undefined for the type Forme
		
		// j'ai du mal à bien comprendre la POO, je pense qu'il va me falloir encore un peu de temps
		

	}

}
