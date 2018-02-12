package fr.adaming.model;
/**
 * 
 * @author inti0294
 * Classe Agent qui a pour attribut :
 * 	id : id de l'agent
 * 	mail : mail de l'agent
 * 	mdp : mdp de l'agent
 *  active : boolean si l'agent est active ou non
 */
public class Agent {

	/**
	 * attributs
	 */
	private int id;
	private String mail;
	private String mdp;
	private boolean active;
	
	/**
	 * constructeurs
	 */
	public Agent() {
		super();
	}

	public Agent(String mail, String mdp, boolean active) {
		super();
		this.mail = mail;
		this.mdp = mdp;
		this.active = active;
	}

	public Agent(int id, String mail, String mdp, boolean active) {
		super();
		this.id = id;
		this.mail = mail;
		this.mdp = mdp;
		this.active = active;
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
