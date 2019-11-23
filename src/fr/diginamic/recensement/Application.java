package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

import fr.diginamic.support.comptage.Article;


public class Application {
	public static void main(String[] args) {
		
		Ville vil = new Ville();
		
		//List<String> list = new ArrayList<>();
		List<Ville> villes = new ArrayList<Ville>();
		
		try {
			File file = new File("E:/diginamic/_sts/191119/recensement population 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			//System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

		/*
		 * // On commence par découper la ligne en morceaux sur la base du
		 * // caractère séparateur « ; » . De plus on ne récupère que les morceaux
		 * // qui nous intéressent. En l’occurrence on ignore les morceaux 3 et 4
		 * // dont on a pas besoin dans le TP
		 *  
		 * String[] morceaux = ligne.split(";");
		 * String codeRegion = morceaux[0];
		 * String nomRegion = morceaux[1];
		 * String codeDepartement = morceaux[2];
		 * String codeCommune = morceaux[5];
		 * String nomCommune = morceaux[6];
		 * String population = morceaux[7];
		 * 
		 * // Pour la population, avant la conversion en int, il
		 * // faut d’abord supprimer les espaces qui se trouvent à l’intérieur
		 * 
		 * int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
		 * 
		 * // On cree enfin la ville avec toutes les données utiles
		 * Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
		 * 
		 */
		
		
		
		//String filePath = ClassLoader.getSystemClassLoader().getResource("recensement.csv").getFile();
		//System.out.println(filePath);
		//Recensement recensement = RecensementUtils.lire(filePath);
		
		
		
	}
}
