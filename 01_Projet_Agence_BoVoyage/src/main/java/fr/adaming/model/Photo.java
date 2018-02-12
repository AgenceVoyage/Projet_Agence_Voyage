package fr.adaming.model;

import java.io.Serializable;

/**
 * Classe model pour attribuer des photos à un voyage
 * @author Adaming44
 *
 */
//@Entity
//@Table(name=photos)
public class Photo implements Serializable{
	
	/**
	 * attributs
	 */
	//@Id
	//@GeneratedValue(strategy=)
	//@Column(name="id_photo")
	private int id;
	
	//@Lob
	private byte[] picture;
	
	private String image;

	/**
	 * constructeurs
	 */
	public Photo() {
		super();
	}

	public Photo(int id, byte[] picture, String image) {
		super();
		this.id = id;
		this.picture = picture;
		this.image = image;
	}

	public Photo(byte[] picture, String image) {
		super();
		this.picture = picture;
		this.image = image;
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

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
