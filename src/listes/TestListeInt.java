package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> initiale = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);
		List<Integer> liste4 = new ArrayList<>();
		liste4.addAll(initiale);
		

		for (int i = 0 ; i < liste4.size() ; i++) {
			
			System.out.print(liste4.get(i) + " ");		
			
		}
		
		System.out.println("\nTaille de la liste : " + liste4.size());
		
		
		int valMax = Collections.max(liste4);
		System.out.println("Plus grand élément : " + valMax);
		
		int valMin = Collections.min(liste4);
		System.out.println("Plus petit élément : " + valMin);
		
		int indexHaut = 0;
		for (int k = 0 ; k < liste4.size() ; k++) {
			
			if (liste4.get(k) == valMin) {
				
				indexHaut = k;
				
			}
			//System.out.print(liste4.get(k) + " ");		
			
		}		
		
		System.out.print("indexHaut : " + indexHaut + "\n");
		liste4.remove(indexHaut); 

		for (int i = 0 ; i < liste4.size() ; i++) {
			
			System.out.print(liste4.get(i) + " ");		
			
		}
		
		
	}

}
