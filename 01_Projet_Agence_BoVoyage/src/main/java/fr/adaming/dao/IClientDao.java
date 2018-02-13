package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;

/**
 * Méthodes DAO du client
 * 
 * @author inti-0265
 *
 */
public interface IClientDao {

	/**
	 * Méthode pour la connection
	 * 
	 * @param client
	 * @return
	 */
	public Client isExist(Client client);

	/**
	 * Méthode pour récupérer la liste des clients
	 * 
	 * @return
	 */
	public List<Client> getAllClients();

	/**
	 * Méthode pour ah=jouter un client
	 * 
	 * @param c
	 * @return
	 */
	public Client addClient(Client c);

	/**
	 * Méthode pour modifier un client
	 * 
	 * @param c
	 * @return
	 */
	public Client updateClient(Client c);

	/**
	 * Méthode pour supprimer un client
	 * 
	 * @param id
	 * @return
	 */
	public int deleteClient(int id);

	/**
	 * Méthode pour récupérer un client par son id
	 * 
	 * @param id
	 * @return
	 */
	public Client getClientById(int id);

}
