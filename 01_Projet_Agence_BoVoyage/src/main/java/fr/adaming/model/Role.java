package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author inti0294
 * Classe Role qui a pour attribut :
 * 	id : id du role 
 * 	roleName : appelation du role
 */
@Entity
@Table(name="roles")
public class Role implements Serializable{

	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_role")
	private int id;
	private String roleName;
	
	@ManyToOne
	@JoinColumn(name="agent_id", referencedColumnName="id_agent")
	private List<Agent> listeAgent;
	
	@OneToOne(mappedBy="role")
	private Client client;
	/**
	 * constructeurs
	 */
	public Role() {
		super();
	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	public Role(int id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
