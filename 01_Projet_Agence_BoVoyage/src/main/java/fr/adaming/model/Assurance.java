package fr.adaming.model;
/**
 * 
 * @author inti0294
 * Classe Assurance qui a pour attribut :
 * 	id : id de l'assurance
 * 	type : type de l'assurance (toutrisque, annulation, rapatriment ...)
 * 	prix : prix de l'assurance
 */
public class Assurance {

	/**
	 * attributs
	 */
	private int id;
	private String type;
	private double prix;
	
	/**
	 * constructeur
	 */
	public Assurance() {
		super();
	}

	public Assurance(String type, double prix) {
		super();
		this.type = type;
		this.prix = prix;
	}

	public Assurance(int id, String type, double prix) {
		super();
		this.id = id;
		this.type = type;
		this.prix = prix;
	}

	/**
	 * getters et setters
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
