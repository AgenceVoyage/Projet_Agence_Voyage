package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Voyageur;
/**
 * interface des methodes CRD pour un voyageur
 * @author inti0294
 *
 */
public interface IVoyageurDao {

	/**
	 * Methode pour ajouter un voyageur
	 * @param voyageur
	 * @return
	 */
	public Voyageur addVoyageur(Voyageur voyageur);
	
	/**
	 * Methode pour supprimer un voyageur
	 * @param voyageur
	 * @return
	 */
	public int deleteVoyageur(Voyageur voyageur);
	/**
	 * Methode pour récuperer un voyageur par son id
	 * @param id
	 * @return
	 */
	public Voyageur getVoyageurById(int id);
	
}
