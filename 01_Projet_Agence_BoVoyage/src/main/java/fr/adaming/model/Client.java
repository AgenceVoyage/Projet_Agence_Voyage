package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model pour les clients
 * 
 * @author inti-0265
 *
 */
// @Entity
// @Table(name=clients)
public class Client extends Voyageur implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * attributs
	 */
	private long numCB;
	private String tel;
	private String mail;
	private String mdp;
	private boolean active;

	/**
	 * constructeurs
	 */
	public Client() {
		super();
	}

	public Client(Date dateNaissance, boolean civilite, String nom, String prenom, boolean clientResa, long numCB,
			String tel, String mail, String mdp, boolean active) {
		super(dateNaissance, civilite, nom, prenom, clientResa);
		this.numCB = numCB;
		this.tel = tel;
		this.mail = mail;
		this.mdp = mdp;
		this.active = active;
	}

	public Client(int id, Date dateNaissance, boolean civilite, String nom, String prenom, boolean clientResa,
			long numCB, String tel, String mail, String mdp, boolean active) {
		super(id, dateNaissance, civilite, nom, prenom, clientResa);
		this.numCB = numCB;
		this.tel = tel;
		this.mail = mail;
		this.mdp = mdp;
		this.active = active;
	}

	/**
	 * getters et setters
	 * 
	 * @return
	 */
	public long getNumCB() {
		return numCB;
	}

	public void setNumCB(long numCB) {
		this.numCB = numCB;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
