package fr.adaming.model;

import java.io.Serializable;

/**
 * 
 * @author inti0294
 * Classe Dossier qui a pour attribut :
 * 	id : id du dossier
 * 	numDossier : numéro de ref du dossier
 * 	statut : statut du dossier (validé, en attente, traitée ...)
 * 	prixTotal : prix total du dossier n'incluant pas les frais d'assurances
 */

public class Dossier implements Serializable{

	/**
	 * attributs
	 */
	private int id;
	private String numDossier;
	private String statut;
	private double prixTotal;
	
	
	/**
	 * constructeurs
	 */
	public Dossier() {
		super();
	}

	public Dossier(String numDossier, String statut, double prixTotal) {
		super();
		this.numDossier = numDossier;
		this.statut = statut;
		this.prixTotal = prixTotal;
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
	
}
