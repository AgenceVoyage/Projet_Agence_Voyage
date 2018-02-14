package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Dossier;

/**
 * Interface des methodes CRUD pour un dossier de reservation
 * @author intiformation
 *
 */

public interface IDossierDao {
	
	/**
	 * Methode pour ajouter un dossier de reservation
	 * @param dossier
	 * @return dossier
	 */
	public Dossier addDossier(Dossier dossier);
	
	/**
	 * Methode pour modifier un dossier de reservation
	 * @param dossier
	 * @return dossier
	 */
	public Dossier updateDossier(Dossier dossier);
	
	/**
	 * Methode pour supprimer un dossier de reservation
	 * @param dossier
	 * @return dossier
	 */
	public int deleteDossier (Dossier dossier);
	
	/**
	 * Methode pour rechercher un dossier par son id
	 * @param id
	 * @return dossier
	 */
	public Dossier getDossierById (int id);
	
	/**
	 * Methode permettant de recuperer l'ensemble de tout les dossiers
	 * @return une liste de dossier
	 */
	public List<Dossier> getAllDossiers();
}
