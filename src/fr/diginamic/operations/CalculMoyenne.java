package fr.diginamic.operations;

public class CalculMoyenne {

	
	private double[] tab1 = {12.1, 9.2, 15.3, 17.4, 14.5};
	

	
	public CalculMoyenne() {
		this.tab1 = new double[0];
	}

	
	public void ajoutNombre(double nouveauNombre) {
		
		double[] tab2 = new double[tab1.length + 1];
		
		for (int i = 0 ; i < tab1.length ; i++) { 
			
			//System.out.println("tab1[i]: " + tab1[i]);
			tab2[i] = tab1[i];
			
		}
		
		tab2[tab2.length-1] = nouveauNombre;
		

		double[] tab1 = new double[tab2.length + 1];
		
		for (int j = 0 ; j < tab2.length ; j++) { 
			
			tab1[j] = tab2[j];
			
		}
		
		
	}
		
		
		
	

	public double calculmoy() {
		
		double moyenne = 0;

		for (int k = 0 ; k < tab1.length ; k++) { 
			
			//System.err.println("tab1[k] : " + tab1[k]);
			//System.out.println("tab1[k] : " + tab1[k]);
			moyenne += tab1[k];
			
		}
		
		moyenne = moyenne / tab1.length;
		
		return moyenne;
		
	}

	
	
	
}
