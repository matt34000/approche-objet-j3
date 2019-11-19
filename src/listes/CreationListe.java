package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		
	
		
		List<Integer> list = new ArrayList<>();
				
		for (int i = 0 ; i < 100 ; i++) {
			
			list.add(i);
		
		}

		
		for (int i = 0 ; i < 100 ; i++) {
			
			System.out.print(list.get(i) + "-");
					
		}
		
		
		System.out.print("\nTaille de la liste : " + list.size() + " éléments");

		
		
		/*
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0 ; i <= 100 ; i++) {
		
			Nombre nb1 = new Nombre(i);
			list.add(nb1);
		
		}
		*/		
		

	}

}
