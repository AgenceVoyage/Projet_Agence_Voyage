package fr.adaming.model;

import java.io.Serializable;

/**
 * 
 * @author inti0294
 * Classe Role qui a pour attribut :
 * 	id : id du role 
 * 	roleName : appelation du role
 */
public class Role implements Serializable{

	/**
	 * attributs
	 */
	private int id;
	private String roleName;
	
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
