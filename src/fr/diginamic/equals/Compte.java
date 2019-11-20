package fr.diginamic.equals;

public class Compte {

	private int numero;
	private double solde;

	
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	
	public String toString() { 
		return "Numéro de compte : " + numero + " | " + "Solde : " + solde + " €";
		
	}
	
	
	@Override
	public boolean equals(Object object) {
	if (!(object instanceof Compte)) {
	return false;
	}
	Compte other = (Compte) object;
	return this.numero==other.getNumero() && this.solde == other.getSolde();
	}

	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
