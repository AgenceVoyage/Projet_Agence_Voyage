package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Voiture;

/**
 * Interface des methodes DAO de Voiture
 * 
 * @author inti0294
 *
 */
public interface IVoitureDao {

	/**
	 * Methode pour recuperer la liste des voitures
	 * 
	 * @return
	 */
	public List<Voiture> getAllVoitures();

	/**
	 * Methode pour ajouter une voiture
	 * 
	 * @param v
	 * @return
	 */
	public Voiture addVoiture(Voiture v);

	/**
	 * Methode pour recuperer une voiture par son id
	 * 
	 * @param id
	 * @return
	 */
	public Voiture getVoitureById(int id);

	/**
	 * Methode pour modifier une voiture
	 * 
	 * @param v
	 * @return
	 */
	public Voiture updateVoiture(Voiture v);

	/**
	 * Méthode pour supprimer une voiture
	 * 
	 * @param id
	 * @return
	 */
	public int deleteVoiture(int id);

}
