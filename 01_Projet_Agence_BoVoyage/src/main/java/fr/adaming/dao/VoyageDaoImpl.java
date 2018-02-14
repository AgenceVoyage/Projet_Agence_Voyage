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
		//écriture de la requete JPQL
		String req = "update Voyage as v set v.nom=:pNom,"
				+ "v.reference=:pRef, v.dateDepart=:pDateDepart,"
				+ "v.dateArrivee=:pDateArrivee, v.nbPlaces=:pNbPlaces,"
				+ "v.prixPublic=:pPrixPublic, v.remise=:pRemise,"
				+ "v.prixRemise=:pPrixRemise, v.disponible=:pDisponible, "
				+ "v.pays=:pPays, v.ville=:pVille,"
				+ "v.continent=:pContinent, v.compagnieVoyage=:pCompagnie "
				+ "v.prestation=:pPrestation, v.listePhotos=:pPhoto "
				+ "v.voiture=:pVoiture, v.hotel=:pHotel"
				+ "v.listeDossiers=:pDossiers where v.id=:pId";
		
		//écriture d'un query
		Query query = em.createQuery(req);
		
		//assignation des paramètres
		query.setParameter("pNom", voy.getNom());
		query.setParameter("pRef", voy.getReference());
		query.setParameter("pDateDepart", voy.getDateDepart());
		query.setParameter("pDateArrivee", voy.getDateArrivee());
		query.setParameter("pNbPlaces", voy.getNbPlaces());
		query.setParameter("pPrixPublic", voy.getPrixPublic());
		query.setParameter("pRemise", voy.getRemise());
		query.setParameter("pPrixRemise", voy.getPrixRemise());
		query.setParameter("pDisponible", voy.isDisponible());
		query.setParameter("pPays", voy.getPays());
		query.setParameter("pVille", voy.getVille());
		query.setParameter("pContinent", voy.getContinent());
		query.setParameter("pCompagnie", voy.getCompagnieVoyage());
		query.setParameter("pPrestation", voy.getPrestation());
		query.setParameter("pPhoto", voy.getListePhotos());
		query.setParameter("pVoiture", voy.getVoiture());
		query.setParameter("pHotel", voy.getHotel());
		query.setParameter("pDossiers", voy.getListeDossiers());
		query.setParameter("pId", voy.getId());
		
		//envoi de la requete
		query.executeUpdate();
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
