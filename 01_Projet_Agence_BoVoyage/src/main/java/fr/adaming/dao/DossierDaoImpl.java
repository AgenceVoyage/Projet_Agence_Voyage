package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;
import fr.adaming.model.Dossier;

@Repository
public class DossierDaoImpl implements IDossierDao {

	@PersistenceContext(unitName = "pu") // Pour l'injection d'un em
	EntityManager em;

	// Setter pour l'injection de dependance
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Dossier addDossier(Dossier dossier) {
		// dossier = new Dossier();
		// dossier.setVoyage(dossier.getVoyage());
		// dossier.setNumDossier(dossier.getNumDossier());
		// dossier.setStatut(dossier.getStatut());
		// dossier.setPrixTotal(dossier.getPrixTotal());
		em.persist(dossier);
		return dossier;
	}

	@Override
	public Dossier updateDossier(Dossier dossier) {
		// Creation de la requete JPQL
		String req = "UPDATE Dossier as d SET d.numDossier=:pNumDossier, d.prixTotal=:pPrixTotal, d.statut=:pStatut, d.voyage=:pVoyage WHERE d.id=:pId";
		// Creation du query
		Query query = em.createQuery(req);
		// Assigner les paramètres
		query.setParameter("pNumDossier", dossier.getNumDossier());
		query.setParameter("pPrixTotal", dossier.getPrixTotal());
		query.setParameter("pStatut", dossier.getStatut());
		// query.setParameter("pClients", dossier.getListeClients());
		// query.setParameter("pAssurances", dossier.getListeAssurances());
		query.setParameter("pVoyage", dossier.getVoyage());
		query.setParameter("pId", dossier.getId());
		// Envoi de la requete
		query.executeUpdate();
		return dossier;
	}

	@Override
	public int deleteDossier(Dossier dossier) {
		// Creation de la requete JPQL
		String req = "delete from Dossier as d where d.id=:pId";
		// Creation du query
		Query query = em.createQuery(req);
		// Assigner les parametres de la req
		query.setParameter("pId", dossier.getId());
		return query.executeUpdate();
	}

	@Override
	public Dossier getDossierById(int id) {
		// Creation de la requete JPQL
		String req = "select d from Dossier as d where d.id=:pId";
		// Creer le query
		Query query = em.createQuery(req);
		// Assigner les parametres du query
		query.setParameter("pId", id);
		// Envoyer la requete
		Dossier dossier = (Dossier) query.getSingleResult();
		return dossier;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dossier> getAllDossiers() {
		// Creation de la requete JPQL
		String req = "select d from Dossier d";
		// Creer le query
		Query query = em.createQuery(req);
		return query.getResultList();
	}


}
