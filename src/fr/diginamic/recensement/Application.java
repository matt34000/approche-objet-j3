package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;


public class Application {
	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		
		
		//List<String> list = new ArrayList<>();
		//List<Ville> villes = new ArrayList<Ville>();
		
		try {
			File file = new File("E:/diginamic/_sts/191119/recensement population 2016.csv");

			//String filePath = ClassLoader.getSystemClassLoader().getResource("recensement.csv").getFile();
			//System.out.println(filePath);
			//Recensement recensement = RecensementUtils.lire(filePath);
						
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			int cpv = 0;
			int poptot = 0;
			
			lignes.remove(0);
			
			for (String ligne : lignes) {
				
							
					
					
						//System.out.println(ligne);
						
						String[] morceaux = ligne.split(";");
						String codeRegion = morceaux[0];
						String nomRegion = morceaux[1];
						String codeDepartement = morceaux[2];
						String nomCommune = morceaux[5];
						String population = morceaux[6];
			
						int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
						 
						Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, nomCommune, populationTotale);
						
						if (ville.getPopulationTotale() > 200000) {
							System.out.println(cpv + "\t" + ville.getCodeDept() + "\t\t" + ville.getNomCommune() + "\t\t\t\t" + ville.getPopulationTotale());
							cpv++;
						}
						
						//poptot = poptot + ville.getPopulationTotale();
						
					

					
				
					
			}
			
			
			//System.out.println("poptot : " + poptot);
			
			
			
			//System.out.println("Nombre de lignes :" + lignes.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

		/*

		1 Population d’une ville donnée
		2 Population d’un département donné
		3 Population d’une région donnée
		4 Afficher les 10 régions les plus peuplées
		5 Afficher les 10 départements les plus peuplés
		6 Afficher les 10 villes les plus peuplées d’un département
		7 Afficher les 10 villes les plus peuplées d’une région
		8 Afficher les 10 villes les plus peuplées de France
		9 Sortir
  
		 */
		
		
		//scanner.close();
	}
}
