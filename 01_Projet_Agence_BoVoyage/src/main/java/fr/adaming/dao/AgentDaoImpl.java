package fr.adaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Agent;

@Repository
public class AgentDaoImpl implements IAgentDao {
	
	@PersistenceContext(unitName="pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Agent getAgentByMail(String mail) {

		String req = "SELECT a FROM Agent WHERE a.mail=:pMail";

		// Creer un bus pour envoyer la requete sql
		Query query = em.createQuery(req, Agent.class);

		// Assigner les paramètres de la requète
		query.setParameter("pMail", mail);

		return (Agent) query.getSingleResult();

	}

}
