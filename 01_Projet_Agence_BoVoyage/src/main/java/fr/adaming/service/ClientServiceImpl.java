package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;
import fr.adaming.model.Role;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public Client isExist(Client client) {
		return clientDao.isExist(client);
	}

	@Override
	public List<Client> getAllClients() {
		return clientDao.getAllClients();
	}

	@Override
	public Client addClient(Client c) {
		c.setClientResa(true);
		c.setActive(true);
		c.setRole(new Role(2, "ROLE_CL"));
		return clientDao.addClient(c);
	}

	@Override
	public Client updateClient(Client c) {
		return clientDao.updateClient(c);
	}

	@Override
	public int deleteClient(int id) {
		return clientDao.deleteClient(id);
	}

	@Override
	public Client getClientById(int id) {
		return clientDao.getClientById(id);
	}

	@Override
	public Client getClientByMail(String mail) {
		return clientDao.getClientByMail(mail);
	}

	@Override
	public Client getClientByDossier(Dossier d) {
		List<Client> listOut = clientDao.getListVoyageursByDossier(d);
		Client c = new Client();
		
		for (Client element : listOut) {
			if (element.isClientResa()) {
				c=element;
			}
		}
		
		return c;
	}

}
