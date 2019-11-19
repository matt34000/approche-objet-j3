package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
	public static void main(String args[]) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		List<String> liste3 = new ArrayList<String>();
		
		int taille3 = liste1.size() + liste2.size();
		
		//for (int i = 0 ; i < taille3 ; i++) {
			
			for (int j = 0 ; j < liste1.size() ; j++) {
			
				liste3.add(liste1.get(j));
			
			}
			
			for (int k = 0 ; k < liste2.size() ; k++) {
				
				liste3.add(liste2.get(k));
			
			}			
			
			
			
		//}		

		
		
		for (int l = 0 ; l < liste3.size() ; l++) {
			
			System.out.print(liste3.get(l) + " ");
			
		
		}
		
		
		
	}
}
