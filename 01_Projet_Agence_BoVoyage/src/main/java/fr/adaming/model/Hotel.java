package fr.adaming.model;

import java.io.Serializable;
/**
 * 
 * @author Adaming44
 *
 */

// @Entity
// @Table(name="hotels")
public class Hotel implements Serializable {


/**
 * Déclaration des attributs
 */
		// @Id
		// @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;

		private String nomHotel;

		private String nomFormule;

		private double prix;


		
		//@Embedded
		//private Adresse adresse;
		
		/**
		 * Déclaration des associations UML
		 */
		// @ManyToOne
		// @JoinColumn(name="v_id",referencedColumnName="id")
		// private Voyage voyage;
		
		/**
		 * Les constructeurs
		 */
		public Hotel() {
			super();
			// TODO Auto-generated constructor stub
		}


}
