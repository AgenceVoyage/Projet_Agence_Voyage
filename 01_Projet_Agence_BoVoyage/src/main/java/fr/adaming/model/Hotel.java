package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Adaming44
 *
 */

 @Entity
 @Table(name="hotels")
public class Hotel implements Serializable {


/**
 * Déclaration des attributs
 */
		 @Id
		 @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;

		private String nomHotel;

		private String nomFormule;

		private double prix;


		
		@Embedded
		private Adresse adresse;
		
		/**
		 * Déclaration des associations UML
		 */
		 @OneToMany(mappedBy="hotel")
		 private List<Voyage> voyageList;
		
		/**
		 * Les constructeurs
		 */
		public Hotel() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Hotel(String nomHotel, String nomFormule, double prix, Adresse adresse) {
			super();
			this.nomHotel = nomHotel;
			this.nomFormule = nomFormule;
			this.prix = prix;
			this.adresse = adresse;
		}

		public Hotel(int id, String nomHotel, String nomFormule, double prix, Adresse adresse) {
			super();
			this.id = id;
			this.nomHotel = nomHotel;
			this.nomFormule = nomFormule;
			this.prix = prix;
			this.adresse = adresse;
		}

		/**
		 * Getters et Setters
		 */
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNomHotel() {
			return nomHotel;
		}

		public void setNomHotel(String nomHotel) {
			this.nomHotel = nomHotel;
		}

		public String getNomFormule() {
			return nomFormule;
		}

		public void setNomFormule(String nomFormule) {
			this.nomFormule = nomFormule;
		}

		public double getPrix() {
			return prix;
		}

		public void setPrix(double prix) {
			this.prix = prix;
		}

		public Adresse getAdresse() {
			return adresse;
		}

		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}

		public Voyage getVoyage() {
			return voyage;
		}

		public void setVoyage(Voyage voyage) {
			this.voyage = voyage;
		}
		
				

}
