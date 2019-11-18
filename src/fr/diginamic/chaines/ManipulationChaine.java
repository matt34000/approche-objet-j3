package fr.diginamic.chaines;



public class ManipulationChaine {

	public static void main(String[] args)  {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println("Longueur de la chaine : " + chaine.length());
		
		System.out.println("Index du 1er point virgule : " + chaine.indexOf(';'));
		
		System.out.println("substring 7 à 13 : " + chaine.substring(7, 13));
		
		System.out.println("Nom de famille : " + chaine.substring(0, chaine.indexOf(';')));
		
		System.out.println("NOM DE FAMILLE : " + (chaine.substring(0, chaine.indexOf(';'))).toUpperCase());
		
		System.out.println("nom de famille : " + (chaine.substring(0, chaine.indexOf(';'))).toLowerCase());

		
		String[] morceaux = chaine.split(";");
				
		for (String cha : morceaux) {
			System.out.println(cha);
		}
		
		String client = morceaux[0] + " " + morceaux[1];
		System.out.println("Client : " + client);

		String compte = morceaux[2];
		System.out.println("Compte n° : " + compte);

		String solde = morceaux[3];
		String solde2 = solde.replaceAll(" ","") + "0";
		// j'ai tenté d'utiliser bigdecimal mais ca ne rajoutait pas un zéro à la fin
		
		
		System.out.println("Solde : " + solde2);		
		
		

	}

}
