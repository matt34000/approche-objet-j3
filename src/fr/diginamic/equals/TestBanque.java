package fr.diginamic.equals;

public class TestBanque {

	public static void main(String[] args) {
		
		
		Compte compte1 = new Compte(45712654, 650842.14);
		Compte compte2 = new Compte(45712654, 650842.14);
		
		boolean a = compte1.equals(compte2);
		
		System.out.println(a);
		
		
		
		
		//System.out.println("numero : " + compte1.getNumero());
		//System.out.println("solde : " + compte1.getSolde());
		
		//compte1.setNumero(987654321);
		
		//System.out.println("numero : " + compte1.getNumero());
		

	}

}
