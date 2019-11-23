package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;


public class Application {
	public static void main(String[] args) {
		
		
		//List<String> list = new ArrayList<>();
		//List<Ville> villes = new ArrayList<Ville>();
		
		try {
			File file = new File("E:/diginamic/_sts/191119/recensement population 2016.csv");

			//String filePath = ClassLoader.getSystemClassLoader().getResource("recensement.csv").getFile();
			//System.out.println(filePath);
			//Recensement recensement = RecensementUtils.lire(filePath);
						
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			int cpt = 0;
			
			for (String ligne : lignes) {
				
				
			
				if (cpt != 0) {
				
					System.out.println(ligne);
					
					String[] morceaux = ligne.split(";");
					String codeRegion = morceaux[0];
					String nomRegion = morceaux[1];
					String codeDepartement = morceaux[2];
					String codeCommune = morceaux[5];
					String nomCommune = morceaux[6];
					String population = morceaux[7];
		
					int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
					 
					Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
					
					cpt++;
					
				}
			
			}
			
			
			
			
			//System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

		
	}
}
