package fr.adaming.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Adresse;
import fr.adaming.model.Client;
import fr.adaming.model.Role;

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

	@SuppressWarnings("unchecked")
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

		String req = "UPDATE Client c SET c.dateNaissance=:pDate, c.civilite=:pCiv, c.nom=:pNom,"
				+ "c.prenom=:pPrenom, c.clientResa=:pCli, c.numCB=:pCB, c.tel=:pTel,"
				+ "c.mail=:pMail, c.mdp=:pMdp, c.active=:pAct, c.adresse.numero=:pNum,"
				+ "c.adresse.voirie=:pVoirie, c.adresse.codePostal=:pCP, c.adresse.ville=:pVille"
				+ "c.role=:pRole WHERE c.id=:pId";
		// écriture d'un query
		Query query = em.createQuery(req);

		// assignation des paramètres
		query.setParameter("pDate", c.getDateNaissance());
		query.setParameter("pCiv", c.isCivilite());
		query.setParameter("pNom", c.getNom());
		query.setParameter("pPrenom", c.getPrenom());
		query.setParameter("pCli", c.isClientResa());
		query.setParameter("pCB", c.getNumCB());
		query.setParameter("pTel", c.getTel());
		query.setParameter("pMail", c.getMail());
		query.setParameter("pMdp", c.getMdp());
		query.setParameter("pAct", c.isActive());
		query.setParameter("pNum", c.getAdresse().getNumero());
		query.setParameter("pVoirie", c.getAdresse().getVoirie());
		query.setParameter("pCP", c.getAdresse().getCodePostal());
		query.setParameter("pVille", c.getAdresse().getVille());
		query.setParameter("pRole", c.getRole());
		query.setParameter("pId", c.getId());

		// envoi de la requete
		query.executeUpdate();
		return c;

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
