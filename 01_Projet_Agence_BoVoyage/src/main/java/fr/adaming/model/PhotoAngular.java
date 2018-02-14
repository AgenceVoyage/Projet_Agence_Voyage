package fr.adaming.model;

import javax.persistence.Lob;

public class PhotoAngular {
	
	@Lob
	private byte[] picture;
	
	private String image;

	public PhotoAngular() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhotoAngular(byte[] picture, String image) {
		super();
		this.picture = picture;
		this.image = image;
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
