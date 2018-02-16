package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.JoinColumn;

/**
 * 
 * @author inti0294
 * Classe Dossier qui a pour attribut :
 * 	id : id du dossier
 * 	numDossier : numéro de ref du dossier
 * 	statut : statut du dossier (validé, en attente, traitée ...)
 * 	prixTotal : prix total du dossier n'incluant pas les frais d'assurances
 */

@Entity
@Table(name="dossiers")
public class Dossier implements Serializable{

	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_dossier")
	private int id;
	private String numDossier;
	private String statut;
	private double prixTotal;
	private String nomFormule;
	private String prestation;
	
	/**
	 * Convertir les associations uml en java
	 */

	@ManyToMany
	@JoinTable(name="assurance_dossier",joinColumns=@JoinColumn(name="assurance_id"),inverseJoinColumns=@JoinColumn(name="dossier_id"))
	private List<Assurance> listeAssurances;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="client_dossier",joinColumns=@JoinColumn(name="client_id"),inverseJoinColumns=@JoinColumn(name="dossier_id"))
	private List<Client> listeClients;

	@ManyToOne
	@JoinColumn(name="voyage_id", referencedColumnName="id_voyage")
	private Voyage voyage;
	
	
	public List<Assurance> getListeAssurances() {
		return listeAssurances;
	}

	public void setListeAssurances(List<Assurance> listeAssurances) {
		this.listeAssurances = listeAssurances;
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

	
	/**
	 * constructeurs
	 */
	public Dossier() {
		super();
	}	

	public Dossier(int id, String numDossier, String statut, double prixTotal, String nomFormule, String prestation) {
		super();
		this.id = id;
		this.numDossier = numDossier;
		this.statut = statut;
		this.prixTotal = prixTotal;
		this.nomFormule = nomFormule;
		this.prestation = prestation;
		
	}

	public Dossier(String numDossier, String statut, double prixTotal, String nomFormule, String prestation) {
		super();
		this.numDossier = numDossier;
		this.statut = statut;
		this.prixTotal = prixTotal;
		this.nomFormule = nomFormule;
		this.prestation = prestation;
	}
	
	

	public Dossier(int id, String numDossier, String statut, double prixTotal) {
		super();
		this.id = id;
		this.numDossier = numDossier;
		this.statut = statut;
		this.prixTotal = prixTotal;
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

	public String getNumDossier() {
		return numDossier;
	}

	public void setNumDossier(String numDossier) {
		this.numDossier = numDossier;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getNomFormule() {
		return nomFormule;
	}

	public void setNomFormule(String nomFormule) {
		this.nomFormule = nomFormule;
	}

	public String getPrestation() {
		return prestation;
	}

	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}
	
	
	
}
