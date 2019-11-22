package fr.diginamic.recensement;

public class Ville {

	
	private int codeRegion;
	private String nomRegion;
	private int codeDept;
	private int codeCommune;
	private String nomCommune;
	private int population;
	
	
	
	
	public Ville(int codeRegion, String nomRegion, int codeDept, int codeCommune, String nomCommune, int population) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}




	public int getCodeRegion() {
		return codeRegion;
	}




	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}




	public String getNomRegion() {
		return nomRegion;
	}




	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}




	public int getCodeDept() {
		return codeDept;
	}




	public void setCodeDept(int codeDept) {
		this.codeDept = codeDept;
	}




	public int getCodeCommune() {
		return codeCommune;
	}




	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}




	public String getNomCommune() {
		return nomCommune;
	}




	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}




	public int getPopulation() {
		return population;
	}




	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	
	
	
	
	
	
	
	
}
