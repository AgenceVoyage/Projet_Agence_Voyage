package fr.adaming.service;

import fr.adaming.model.Photo;
import fr.adaming.model.Voyage;

public interface IPhotoService {
	
	/**
	 * méthode d'ajout d'une photo
	 * @param p
	 * @param v
	 * @return
	 */
	public Photo addPhoto(Photo p, Voyage v);
	
	/**
	 * méthode de modification d'une photo
	 * @param p
	 * @param v
	 * @return
	 */
	public Photo updatePhoto(Photo p, Voyage v);
	
	/**
	 * méthode de suppression d'une photo
	 * @param v
	 * @return
	 */
	public int deletePhoto(Voyage v);

}
