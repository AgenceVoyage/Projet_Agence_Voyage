package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Voiture;

@Repository
public class VoitureDaoImpl implements IVoitureDao {

	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Voiture> getAllVoitures() {
		// construire la requete JPQL
		String req = "SELECT v FROM Voiture as v";

		// créer le query
		Query query = em.createQuery(req);

		// envoyer la requete et recup du resultat
		return query.getResultList();
	}

	@Override
	public Voiture addVoiture(Voiture v) {

		em.persist(v);

		return v;
	}

	@Override
	public Voiture getVoitureById(int id) {

		Voiture v = (Voiture) em.find(Voiture.class, id);
		if (v != null) {
			return v;
		}
		return null;
	}

	@Override
	public Voiture updateVoiture(Voiture v) {

		em.merge(v);

		return v;
	}

	@Override
	public int deleteVoiture(int id) {
		Voiture v = (Voiture) em.find(Voiture.class, id);
		if (v != null) {
			em.remove(v);
			return 1;
		} else {
			return 0;
		}
	}

}
