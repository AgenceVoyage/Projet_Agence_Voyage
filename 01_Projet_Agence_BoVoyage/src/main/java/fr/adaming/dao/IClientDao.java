package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Client;

/**
 * M�thodes DAO du client
 * 
 * @author inti-0265
 *
 */
public interface IClientDao {

	/**
	 * M�thode pour la connection
	 * 
	 * @param client
	 * @return
	 */
	public Client isExist(Client client);

	/**
	 * M�thode pour r�cup�rer la liste des clients
	 * 
	 * @return
	 */
	public List<Client> getAllClients();

	/**
	 * M�thode pour ah=jouter un client
	 * 
	 * @param c
	 * @return
	 */
	public Client addClient(Client c);

	/**
	 * M�thode pour modifier un client
	 * 
	 * @param c
	 * @return
	 */
	public Client updateClient(Client c);

	/**
	 * M�thode pour supprimer un client
	 * 
	 * @param id
	 * @return
	 */
	public int deleteClient(int id);

	/**
	 * M�thode pour r�cup�rer un client par son id
	 * 
	 * @param id
	 * @return
	 */
	public Client getClientById(int id);

}
