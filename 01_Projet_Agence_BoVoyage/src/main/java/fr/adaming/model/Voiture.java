package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Adaming44
 * 
 */

 @Entity
 @Table(name="voitures")
public class Voiture implements Serializable{

	/** Déclaration des attributs */
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String loueur;

	private String categorie;

	private double prix;

	/**
	 * Déclaration des associations UML en Java
	 */
	 @ManyToOne
	 @JoinColumn(name="v_id",referencedColumnName="id")
	 private Voyage voyage;

	/**
	 * Les constructeurs
	 */

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String loueur, String categorie, double prix) {
		super();
		this.loueur = loueur;
		this.categorie = categorie;
		this.prix = prix;
	}

	public Voiture(int id, String loueur, String categorie, double prix) {
		super();
		this.id = id;
		this.loueur = loueur;
		this.categorie = categorie;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoueur() {
		return loueur;
	}

	public void setLoueur(String loueur) {
		this.loueur = loueur;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}
	

}
