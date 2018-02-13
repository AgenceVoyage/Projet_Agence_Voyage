package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;

@Repository
public class ClientDaoImpl implements IClientDao {

	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Client isExist(Client client) {
		String req = "SELECT c FROM Client c WHERE c.mail=:pMail AND c.mdp=:pMdp ";
		Query query = em.createQuery(req);
		query.setParameter("pMail", client.getMail());
		query.setParameter("pMdp", client.getMdp());
		return (Client) query.getSingleResult();
	}

	@Override
	public List<Client> getAllClients() {
		String req = "SELECT c FROM Client c";
		Query query = em.createQuery(req);
		return query.getResultList();
	}

	@Override
	public Client addClient(Client c) {
		em.persist(c);
		return c;
	}

	@Override
	public Client updateClient(Client c) {
		Client cOut = em.merge(c);
		return cOut;
	}

	@Override
	public int deleteClient(int id) {
		Client c = em.find(Client.class, id);
		if (c != null) {
			em.remove(c);
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public Client getClientById(int id) {
		Client cOut = em.find(Client.class, id);
		return cOut;
	}

}
