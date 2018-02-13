package fr.adaming.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DbUtil {
	
	

	private static EntityManagerFactory emf=null;
	private static EntityManager em=null;
	private static EntityTransaction tx=null;
	
	public static EntityManager getEM(){
		
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		
		return em;
	}
	
	
	
	public static void closeTransaction(EntityManager entityManager){
		tx.commit();
		if (tx != null)
			tx.rollback(); // Revenir a l'état initial de tx
		
		if (entityManager != null)
			entityManager.close();
		if (emf != null)
			emf.close();
		
	}

}
