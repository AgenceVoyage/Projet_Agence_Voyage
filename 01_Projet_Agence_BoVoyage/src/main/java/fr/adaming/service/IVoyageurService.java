package fr.adaming.service;

import fr.adaming.model.Client;
import fr.adaming.model.Voyageur;

public interface IVoyageurService {

	/**
	 * Methode pour ajouter un voyage
	 * @param voyageur
	 * @return
	 */
	public Client addVoyageur(Client voyageur);
	
	/**
	 * Methode pour supprimer un voyageur
	 * @param voyageur
	 * @return
	 */
	public int deleteVoyageur(Voyageur voyageur);
	
	/**
	 * Mehode pour recuperer un voyageur avec son id
	 * @param id
	 * @return
	 */
	public Voyageur getVoyageurById(int id);

}
