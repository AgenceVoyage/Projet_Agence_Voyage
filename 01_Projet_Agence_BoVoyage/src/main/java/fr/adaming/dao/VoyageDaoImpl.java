package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Voyage;

@Repository
public class VoyageDaoImpl implements IVoyageDao {

	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Voyage getVoyageById(int idVoyage) {
		return em.find(Voyage.class, idVoyage);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Voyage> getAllVoyages() {
		// écriture de la requete JPQL
		String req = "select v from Voyage as v";

		// création d'un query
		Query query = em.createQuery(req);

		// retourner la liste
		return query.getResultList();
	}

	@Override
	public Voyage addVoyage(Voyage voy) {
		em.persist(voy);
		return voy;
	}

	@Override
	public Voyage updateVoyage(Voyage voy) {
		em.merge(voy);
		return voy;
	}

	@Override
	public int deleteVoyage(int idVoyage) {
		// écriture de la requete JPQL
		String req = "delete from Voyage as v where v.id=:pId";

		// création du query
		Query query = em.createQuery(req);
		
		//assignation des paramètres
		query.setParameter("pId", idVoyage);
		
		//envoi de la requete
		return query.executeUpdate();
	}

}
