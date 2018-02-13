package fr.adaming.service;

import fr.adaming.model.Photo;
import fr.adaming.model.Voyage;

public interface IPhotoService {
	
	/**
	 * m�thode d'ajout d'une photo
	 * @param p
	 * @param v
	 * @return
	 */
	public Photo addPhoto(Photo p, Voyage v);
	
	/**
	 * m�thode de modification d'une photo
	 * @param p
	 * @param v
	 * @return
	 */
	public Photo updatePhoto(Photo p, Voyage v);
	
	/**
	 * m�thode de suppression d'une photo
	 * @param v
	 * @return
	 */
	public int deletePhoto(Voyage v);

}
