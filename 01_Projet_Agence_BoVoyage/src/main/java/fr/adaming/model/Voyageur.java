package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model pour les voyageurs
 * 
 * @author inti-0265
 *
 */
// @Inheritance
// @MappedSuperclass
public class Voyageur implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * attributs
	 */
	// @Id
	// @GeneratedValue(strategy=)
	// @Column(name="id_voyageur")
	protected int id;
	// @TemporalType(date)
	protected Date dateNaissance;
	protected boolean civilite;
	protected String nom;
	protected String prenom;
	protected boolean clientResa;

	/**
	 * constructeurs
	 */
	public Voyageur() {
		super();
	}

	public Voyageur(Date dateNaissance, boolean civilite, String nom, String prenom, boolean clientResa) {
		super();
		this.dateNaissance = dateNaissance;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.clientResa = clientResa;
	}

	public Voyageur(int id, Date dateNaissance, boolean civilite, String nom, String prenom, boolean clientResa) {
		super();
		this.id = id;
		this.dateNaissance = dateNaissance;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.clientResa = clientResa;
	}

	/**
	 * getters et setters
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public boolean isCivilite() {
		return civilite;
	}

	public void setCivilite(boolean civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isClientResa() {
		return clientResa;
	}

	public void setClientResa(boolean clientResa) {
		this.clientResa = clientResa;
	}

}
