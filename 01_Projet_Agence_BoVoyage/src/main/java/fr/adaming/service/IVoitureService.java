package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Voiture;

public interface IVoitureService {

	/**
	 * Methode pour recuperer la liste des voitures
	 * @return
	 */
	public List<Voiture> getAllVoitures();

	/**
	 * Methode pour ajouter une voiture
	 * @param v
	 * @return
	 */
	public Voiture addVoiture(Voiture v);

	/**
	 * Methode pour obtenir une voiture par son id
	 * @param id
	 * @return
	 */
	public Voiture getVoitureById(int id);

	/**
	 * Methode pour modifier une voiture
	 * @param v
	 * @return
	 */
	public Voiture updateVoiture(Voiture v);

	/**
	 * Methode pour supprimer une voiture
	 * @param id
	 * @return
	 */
	public int deleteVoiture(int id);
}
