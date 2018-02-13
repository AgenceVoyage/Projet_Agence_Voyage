package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Voyage;

public interface IVoyageService {
	
	/**
	 * methode pour récupérer un voyage en fonction de son id (agent)
	 * @param idVoyage
	 * @return
	 */
	public Voyage getVoyageById(int idVoyage);
	
	/**
	 * methode pour récupérer la liste des voyages (accueil utilisateur+agent)
	 * @return
	 */
	public List<Voyage> getAllVoyages();
	
	/**
	 * methode pour ajouter un voyage (agent)
	 * @param voy
	 * @return
	 */
	public Voyage addVoyage(Voyage voy);
	
	/**
	 * méthode pour modifier un voyage (agent)
	 * @param voy
	 * @return
	 */
	public Voyage updateVoyage(Voyage voy);
	
	/**
	 * méthode pour supprimer un voyage selon son id
	 * @param idVoyage
	 * @return
	 */
	public int deleteVoyage(int idVoyage);

}
