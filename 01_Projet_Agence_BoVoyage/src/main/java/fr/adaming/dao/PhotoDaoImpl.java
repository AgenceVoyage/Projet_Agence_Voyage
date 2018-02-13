package fr.adaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Photo;

@Repository
public class PhotoDaoImpl implements IPhotoDao {

	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Photo addPhoto(Photo p) {
		em.persist(p);
		return p;
	}

	@Override
	public Photo updatePhoto(Photo p) {
		em.merge(p);
		return p;
	}

	@Override
	public int deletePhoto(int idVoyage) {
		// écriture de la requete JPQL
		String req = "delete from Photo as p where p.voyage.id=:pIdVoyage";

		// création d'un query
		Query query = em.createQuery(req);
		
		//assignation des paramètres de la requete
		query.setParameter("pIdVoyage", idVoyage);
		
		return query.executeUpdate();
	}

}
