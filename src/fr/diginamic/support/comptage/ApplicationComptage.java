package fr.diginamic.support.comptage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/** Application de comptage utilisant les HashMap
 * @author DIGINAMIC
 *
 */
public class ApplicationComptage {
	
	/** Point d'entr�e
	 * @param args non utilis�s ici
	 */
	public static void main(String[] args){
		List<Article> articles = new ArrayList<>();
		articles.add(new Article("IPhone 11", "REF001", "Smartphone", 859.0));
		articles.add(new Article("Dragon Quest XI: Les combattants de la destin�e", "REF013", "Jeu vid�o", 44.49));
		articles.add(new Article("IPhone 11 Pro", "REF002", "Smartphone", 1159.0));
		articles.add(new Article("Izuku support t�l�phone voiture", "REF003", "Accessoires Smartphone", 11.99));
		articles.add(new Article("Fire TV Stick", "REF004", "Accessoires High Tech", 11.99));
		articles.add(new Article("Echo dot enceinte connect�e", "REF005", "Accessoires High Tech", 59.99));
		articles.add(new Article("FIFA 20", "REF006", "Jeu vid�o", 54.99));
		articles.add(new Article("Joyguard coque IPhone 11", "REF007", "Accessoires Smartphone", 5.99));
		articles.add(new Article("Samsung Galaxy A10 Dual sim", "REF008", "Smartphone", 121.0));
		articles.add(new Article("HETP Ecouteur Bluetooth sans fil", "REF009", "Accessoires High Tech", 121.0));
		articles.add(new Article("XIAOMI Redmi Note 7", "REF010", "Smartphone", 169.94));
		articles.add(new Article("Rampow adaptateur USB C vers OTG 3.1", "REF011", "Accessoires High Tech", 6.99));
		articles.add(new Article("The legend of Zelda: Link'a Awakening", "REF012", "Jeu vid�o", 41.99));
		
		
		// Cr�ation du stockage des compteurs:
		// - cl� de type String qui va correspondre � la cat�gorie, exemple: Jeu vid�o.
		// - valeur de type Integer qui va correspondre au nombre d'articles dans cette cat�gorie
		HashMap<String, Integer> compteurs = new HashMap<>();
		
		// Parcourt de la liste des articles
		for (int i=0; i<articles.size(); i++){
			Article article = articles.get(i);
			String categorie = article.getCategorie();
		
			// On recherche le compteur correspondant � la cat�gorie de l'article
			Integer compteur = compteurs.get(categorie);
			
			// Si le compteur n'existe pas on le cr��
			if (compteur==null){
				compteur = 0;
			}
			
			// On l'incr�mente de 1
			compteur++;
			
			// On le remet dans la map avec la nouvelle valeur
			compteurs.put(categorie, compteur);
		}
		
		// On affiche maintenant les r�sultats
		Set<String> categories = compteurs.keySet();
		Iterator<String> iterateur = categories.iterator();
		while (iterateur.hasNext()){
			String categorie = iterateur.next();
			Integer valeurCompteur = compteurs.get(categorie);
			
			System.out.println("Categorie:"+categorie+" - Nombre d'articles:"+valeurCompteur);
		}
		
	}

}
