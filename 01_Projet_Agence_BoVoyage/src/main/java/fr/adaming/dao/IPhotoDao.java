package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Photo;

/**
 * interface de d�finition des m�thodes concernant les photos des voyages
 * @author Adaming44
 *
 */
public interface IPhotoDao {
	
	/**
	 * m�thode d'ajout d'une photo
	 * @param p
	 * @return
	 */
	public Photo addPhoto(Photo p);
	
	/**
	 * m�thode de modification d'une photo
	 * @param p
	 * @return
	 */
	public Photo updatePhoto(Photo p);
	
	/**
	 * m�thode de suppression d'une photo
	 * @param idVoyage
	 * @return
	 */
	public int deletePhoto(int idVoyage);
	
	public List<Photo> getAllPhotoByIdVoyage(int id);

}
