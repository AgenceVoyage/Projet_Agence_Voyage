package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model pour les voyages
 * @author Adaming44
 *
 */
//@Entity
//@Table(name=voyages)
public class Voyage implements Serializable {
	
	/**
	 * attributs
	 */
	//@Id
	//@GeneratedValue(strategy=)
	//@Column(name="id_voyage")
	private int id;
	private String nom;
	private String reference;
	
	//@TemporalType(both)
	private Date dateDepart;
	//@TemporalType(both)
	private Date dateArrivee;
	
	private int nbPlaces;
	private double prixPublic;
	private double remise;
	private double prixRemise;
	private boolean disponible;
	private String pays;
	private String ville;
	private String continent;
	private String compagnieVoyage;
	private String prestation; //avion seul ou avion+voiture ou avion+hotel...
	
	
	/**
	 * constructeurs
	 */
	public Voyage() {
		super();
	}


	public Voyage(String nom, String reference, Date dateDepart, Date dateArrivee, int nbPlaces, double prixPublic,
			double remise, double prixRemise, boolean disponible, String pays, String ville, String continent,
			String compagnieVoyage, String prestation) {
		super();
		this.nom = nom;
		this.reference = reference;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbPlaces = nbPlaces;
		this.prixPublic = prixPublic;
		this.remise = remise;
		this.prixRemise = prixRemise;
		this.disponible = disponible;
		this.pays = pays;
		this.ville = ville;
		this.continent = continent;
		this.compagnieVoyage = compagnieVoyage;
		this.prestation = prestation;
	}


	public Voyage(int id, String nom, String reference, Date dateDepart, Date dateArrivee, int nbPlaces,
			double prixPublic, double remise, double prixRemise, boolean disponible, String pays, String ville,
			String continent, String compagnieVoyage, String prestation) {
		super();
		this.id = id;
		this.nom = nom;
		this.reference = reference;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbPlaces = nbPlaces;
		this.prixPublic = prixPublic;
		this.remise = remise;
		this.prixRemise = prixRemise;
		this.disponible = disponible;
		this.pays = pays;
		this.ville = ville;
		this.continent = continent;
		this.compagnieVoyage = compagnieVoyage;
		this.prestation = prestation;
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


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public Date getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}


	public Date getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	public int getNbPlaces() {
		return nbPlaces;
	}


	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}


	public double getPrixPublic() {
		return prixPublic;
	}


	public void setPrixPublic(double prixPublic) {
		this.prixPublic = prixPublic;
	}


	public double getRemise() {
		return remise;
	}


	public void setRemise(double remise) {
		this.remise = remise;
	}


	public double getPrixRemise() {
		return prixRemise;
	}


	public void setPrixRemise(double prixRemise) {
		this.prixRemise = prixRemise;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public String getCompagnieVoyage() {
		return compagnieVoyage;
	}


	public void setCompagnieVoyage(String compagnieVoyage) {
		this.compagnieVoyage = compagnieVoyage;
	}


	public String getPrestation() {
		return prestation;
	}


	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}
	
	
	
	
	

}
