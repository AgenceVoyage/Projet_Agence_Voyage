package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author inti0294
 * Classe Agent qui a pour attribut :
 * 	id : id de l'agent
 * 	mail : mail de l'agent
 * 	mdp : mdp de l'agent
 *  active : boolean si l'agent est active ou non
 */
@Entity
@Table(name="agents")
public class Agent implements Serializable{

	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_agent")
	private int id;
	private String mail;
	private String mdp;
	private boolean active;
	/**
	 * Convertir les associations uml en java
	 */
	@OneToMany(mappedBy="agent")
	private Role role;
	
	
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

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
