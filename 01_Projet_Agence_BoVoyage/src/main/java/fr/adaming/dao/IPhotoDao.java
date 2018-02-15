package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Photo;

/**
 * interface de définition des méthodes concernant les photos des voyages
 * @author Adaming44
 *
 */
public interface IPhotoDao {
	
	/**
	 * méthode d'ajout d'une photo
	 * @param p
	 * @return
	 */
	public Photo addPhoto(Photo p);
	
	/**
	 * méthode de modification d'une photo
	 * @param p
	 * @return
	 */
	public Photo updatePhoto(Photo p);
	
	/**
	 * méthode de suppression d'une photo
	 * @param idVoyage
	 * @return
	 */
	public int deletePhoto(int idVoyage);
	
	public List<Photo> getAllPhotoByIdVoyage(int id);

}
