package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Assurance;

@Repository
public class AssuranceDaoImpl implements IAssuranceDao{
	
	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Assurance> getAllAssurances() {
		// construire la requete JPQL
		String req = "SELECT a FROM Assurance as a";

		// cr�er le query
		Query query = em.createQuery(req);

		// envoyer la requete et recup du resultat
		return query.getResultList();
	}

	@Override
	public Assurance addAssurance(Assurance a) {

		em.persist(a);

		return a;
	}

	@Override
	public Assurance getAssuranceById(int id) {

		Assurance a = (Assurance) em.find(Assurance.class, id);
		if (a != null) {
			return a;
		}
		return null;
	}

	@Override
	public Assurance updateAssurance(Assurance a) {

		em.merge(a);

		return a;
	}

	@Override
	public int deleteAssurance(int id) {
		Assurance a = (Assurance) em.find(Assurance.class, id);
		if (a != null) {
			em.remove(a);
			return 1;
		} else {
			return 0;
		}
	}

}
