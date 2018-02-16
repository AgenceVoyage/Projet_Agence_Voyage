package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Adresse;
import fr.adaming.model.Client;
import fr.adaming.model.Voyageur;

@Repository
public class VoyageurDaoImpl implements IVoyageurDao {

	@PersistenceContext(unitName = "pu") // Pour l'injection d'un em
	EntityManager em;

	// Setter pour l'inkection de dependance
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Client addVoyageur(Voyageur voyageur) {
		Client client = new Client();
		client.setDateNaissance(voyageur.getDateNaissance());
		client.setCivilite(voyageur.isCivilite());
		client.setNom(voyageur.getNom());
		client.setPrenom(voyageur.getPrenom());
		client.setClientResa(voyageur.isClientResa());
		client.setAdresse(new Adresse());
		em.persist(client);
		return client;
	}

	@Override
	public int deleteVoyageur(Voyageur voyageur) {
		// Creation de la requete JPQL
		String req = "delete from Client as c where c.id=:pId ";
		//Création de la requete
		Query query= em.createQuery(req);
		// Parametrer le query
		query.setParameter("pId",voyageur.getId());
		return query.executeUpdate();
		
	}

	@Override
	public Voyageur getVoyageurById(int id) {
		// Creation de la requete JPQL
		String req = "select c from Client as c where c.id=:pId ";
		// Creer un query
		Query query = em.createQuery(req);
		// Parametrer le query
		query.setParameter("pId",id);
		// Envoyer la requete
		Client client=(Client) query.getSingleResult();
		
		return client;
	}

}
