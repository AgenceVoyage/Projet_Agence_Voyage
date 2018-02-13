package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Voyage;

/**
 * interface de d�finition des m�thodes CRUD pour un voyage
 * @author Adaming44
 *
 */
public interface IVoyageDao {
	
	/**
	 * methode pour r�cup�rer un voyage en fonction de son id (agent)
	 * @param idVoyage
	 * @return
	 */
	public Voyage getVoyageById(int idVoyage);
	
	/**
	 * methode pour r�cup�rer la liste des voyages (accueil utilisateur+agent)
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
	 * m�thode pour modifier un voyage (agent)
	 * @param voy
	 * @return
	 */
	public Voyage updateVoyage(Voyage voy);
	
	/**
	 * m�thode pour supprimer un voyage selon son id
	 * @param idVoyage
	 * @return
	 */
	public int deleteVoyage(int idVoyage);

}
