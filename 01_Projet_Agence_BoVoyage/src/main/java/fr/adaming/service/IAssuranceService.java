package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Assurance;

public interface IAssuranceService {

	/**
	 * Methode pour récuperer la liste des assurances
	 * @return
	 */
	public List<Assurance> getAllAssurances();

	/**
	 * Methode pour ajouter une assurance
	 * @param a
	 * @return
	 */
	public Assurance addAssurance(Assurance a);

	/**
	 * Methode pour obtenir une assurance par son id
	 * @param id
	 * @return
	 */
	public Assurance getAssuranceById(int id);

	/**
	 * Methode pour modifier une assurance
	 * @param a
	 * @return
	 */
	public Assurance updateAssurance(Assurance a);

	/**
	 * Methode pour supprimer une assurance
	 * @param id
	 * @return
	 */
	public int deleteAssurance(int id);

}
