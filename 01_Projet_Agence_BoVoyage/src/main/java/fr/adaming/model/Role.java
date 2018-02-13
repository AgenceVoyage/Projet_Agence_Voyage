package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author inti0294 Classe Role qui a pour attribut : id : id du role roleName :
 *         appelation du role
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable {

	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role")
	private int id;
	private String roleName;

	@OneToMany(mappedBy = "role")
	private List<Agent> listeAgents;

	@OneToMany(mappedBy = "role")
	private List<Client> listeClients;

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
	 * 
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

	public List<Agent> getListeAgents() {
		return listeAgents;
	}

	public void setListeAgents(List<Agent> listeAgents) {
		this.listeAgents = listeAgents;
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}
}
