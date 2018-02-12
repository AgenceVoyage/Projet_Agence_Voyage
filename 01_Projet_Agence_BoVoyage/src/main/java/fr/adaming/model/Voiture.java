package fr.adaming.model;

/**
 * 
 * @author Adaming44
 * 
 */

// @Entity
// @Table(name="voitures")
public class Voiture {

	/** Déclaration des attributs */
	// @Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String loueur;

	private String categorie;

	private double prix;

	/**
	 * Déclaration des associations UML en Java
	 */
	// @ManyToOne
	// @JoinColumn(name="v_id",referencedColumnName="id")
	// private Voyage voyage;

	/**
	 * Les constructeurs
	 */

	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String loueur, String categorie, double prix) {
		super();
		this.loueur = loueur;
		this.categorie = categorie;
		this.prix = prix;
	}

	public Voiture(int id, String loueur, String categorie, double prix) {
		super();
		this.id = id;
		this.loueur = loueur;
		this.categorie = categorie;
		this.prix = prix;
	}

}
