package fr.diginamic.recensement;

public class Ville {


	private String codeRegion;
	private String nomRegion;
	private String codeDept;
	private String nomCommune;
	private int populationTotale;
	
	
	
	
	public Ville(String codeRegion, String nomRegion, String codeDept, String nomCommune, int populationTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}	
	

	
	@Override
	public String toString() {
		return "Département n°" + codeDept + " - Ville : " + nomCommune + " - " + populationTotale + " hab.";
	}
	
	
	public String getCodeRegion() {
		return codeRegion;
	}




	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}




	public String getNomRegion() {
		return nomRegion;
	}




	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}




	public String getCodeDept() {
		return codeDept;
	}




	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}




	public String getNomCommune() {
		return nomCommune;
	}




	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}




	public int getPopulationTotale() {
		return populationTotale;
	}




	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}








}