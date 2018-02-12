package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author inti0294
 * Classe Assurance qui a pour attribut :
 * 	id : id de l'assurance
 * 	type : type de l'assurance (toutrisque, annulation, rapatriment ...)
 * 	prix : prix de l'assurance
 */
@Entity
@Table(name="assurances")
public class Assurance implements Serializable {

	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_assurance")
	private int id;
	private String type;
	private double prix;
	/**
	 * Convertir les associations uml en java
	 */
	@ManyToMany(mappedBy="listeAssurances") 
	private List<Dossier> listeDossiers;
	
	public List<Dossier> getListeDossiers() {
		return listeDossiers;
	}

	public void setListeDossiers(List<Dossier> listeDossiers) {
		this.listeDossiers = listeDossiers;
	}
	

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
