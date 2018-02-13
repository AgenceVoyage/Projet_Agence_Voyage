package fr.adaming.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Agent;

@Repository
public class AgentDaoImpl implements IAgentDao {

	@Autowired
	private SessionFactory sf;

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public Agent getAgentByMail(String mail) {

		// Recuperer la session
		Session s = sf.getCurrentSession();
		String req = "FROM Agent a WHERE a.mail=:pMail";
		Query query = s.createQuery(req);
		query.setParameter("pMail", mail);

		return (Agent) query.uniqueResult();
	}

}
