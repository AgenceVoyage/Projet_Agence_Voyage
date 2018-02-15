package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Hotel;

@Repository
public class HotelDaoImpl implements IHotelDao{

	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> getAllHotels() {
		// construire la requete JPQL
		String req = "SELECT h FROM Hotel as h";

		// créer le query
		Query query = em.createQuery(req);

		// envoyer la requete et recup du resultat
		return query.getResultList();
	}

	@Override
	public Hotel addHotel(Hotel h) {

		em.persist(h);

		return h;
	}

	@Override
	public Hotel getHotelById(int id) {

		Hotel h = (Hotel) em.find(Hotel.class, id);
		if (h != null) {
			return h;
		}
		return null;
	}

	@Override
	public Hotel updateHotel(Hotel h) {
		
		// écriture de la requete JPQL
		String req = "update Hotel as h set h.nomHotel=:pNomHotel, h.prix=:pPrix where h.id=:pId";
		
		//écriture d'un query
		Query query = em.createQuery(req);
		
		//assignation des paramètres
		query.setParameter("pNomHotel", h.getNomHotel());
		query.setParameter("pPrix", h.getPrix());
		query.setParameter("pId", h.getId());
		
		//envoi de la requete
		query.executeUpdate();
		
		return h;
	}

	@Override
	public int deleteHotel(int id) {
		Hotel h = (Hotel) em.find(Hotel.class, id);
		if (h != null) {
			em.remove(h);
			return 1;
		} else {
			return 0;
		}
	}

}
