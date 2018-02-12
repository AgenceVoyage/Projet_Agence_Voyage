package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * 
 * @author Adaming44
 *
 */
@Embeddable
public class Adresse implements Serializable {

	/**
	 * Déclaration des attributs 
	 */
	private int numero;
	
	private String voirie;
	
	private int codePostal;
	
	private String ville;

	/**
	 * Getters et Setters
	 */
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getVoirie() {
		return voirie;
	}

	public void setVoirie(String voirie) {
		this.voirie = voirie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Les constructeurs
	 */
		
	public Adresse(int numero, String voirie, int codePostal, String ville) {
		super();
		this.numero = numero;
		this.voirie = voirie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
}
