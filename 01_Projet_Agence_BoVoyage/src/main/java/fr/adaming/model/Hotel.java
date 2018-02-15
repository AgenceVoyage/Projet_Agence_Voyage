package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe model pour les hotels
 * @author Adaming44
 *
 */

@Entity
@Table(name = "hotels")
public class Hotel implements Serializable {

	/**
	 * Déclaration des attributs
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_hotel")
	private int id;

	private String nomHotel;

	private double prix;

	@Embedded
	private Adresse adresse;

	/**
	 * Déclaration des associations UML
	 */
	@OneToMany(mappedBy = "hotel")
	private List<Voyage> listeVoyages;

	/**
	 * Les constructeurs
	 */
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String nomHotel, double prix, Adresse adresse) {
		super();
		this.nomHotel = nomHotel;
		this.prix = prix;
		this.adresse = adresse;
	}

	public Hotel(int id, String nomHotel, double prix, Adresse adresse) {
		super();
		this.id = id;
		this.nomHotel = nomHotel;
		this.prix = prix;
		this.adresse = adresse;
	}

	/**
	 * Getters et Setters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Voyage> getListeVoyages() {
		return listeVoyages;
	}

	public void setListeVoyages(List<Voyage> listeVoyages) {
		this.listeVoyages = listeVoyages;
	}

}
