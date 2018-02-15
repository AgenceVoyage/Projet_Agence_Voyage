package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Classe model pour attribuer des photos à un voyage
 * @author Adaming44
 *
 */
@Entity
@Table(name="photos")
public class Photo implements Serializable{
	
	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_photo")
	private int id;
	
	@Lob
	private byte[] picture;
	
	private String image;
	
	@ManyToOne
	@JoinColumn(name="voyage_id", referencedColumnName="id_voyage")
	private Voyage voyage;

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

	public Voyage getVoyage() {
		return voyage;
	}

	public void setVoyage(Voyage voyage) {
		this.voyage = voyage;
	}

}
