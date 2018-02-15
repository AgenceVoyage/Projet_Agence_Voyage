package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.multipart.MultipartFile;

/**
 * Classe model pour les voyages
 * 
 * @author Adaming44
 *
 */
@Entity
@Table(name="voyages")
public class Voyage implements Serializable {

	/**
	 * attributs
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_voyage")
	private int id;
	private String nom;
	private String reference;

	@Temporal(TemporalType.DATE)
	private Date dateDepart;
	

	@Temporal(TemporalType.DATE)
	
	@Lob
	private Date dateArrivee;

	private int nbPlaces;
	private double prixPublic;
	private double remise;
	private double prixRemise;
	private boolean disponible;
	private String pays;
	private String ville;
	private String continent;
	private String compagnieVoyage;
	private String prestation; // avion seul ou avion+voiture ou avion+hotel...
	
	@OneToMany(mappedBy="voyage", cascade=CascadeType.ALL)
	private List<Photo> listePhotos;
	
	@ManyToOne
	@JoinColumn(name="voiture_id", referencedColumnName="id_voiture")
	private Voiture voiture;
	
	@ManyToOne
	@JoinColumn(name="hotel_id", referencedColumnName="id_hotel")
	private Hotel hotel;
	
	@OneToMany(mappedBy="voyage", cascade=CascadeType.ALL)
	private List<Dossier> listeDossiers;
	
	@Transient
	private MultipartFile file;
	@Transient
	private List<String> imageString;
	@Transient
	private int nbPhoto;
	
	private byte[] image;

	/**
	 * constructeurs
	 */
	public Voyage() {
		super();
	}

	public Voyage(String nom, String reference, Date dateDepart, Date dateArrivee, int nbPlaces, double prixPublic,
			double remise, String pays, String ville, String continent,
			String compagnieVoyage,byte[] image) {
		super();
		this.nom = nom;
		this.reference = reference;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbPlaces = nbPlaces;
		this.prixPublic = prixPublic;
		this.remise = remise;
		this.pays = pays;
		this.ville = ville;
		this.continent = continent;
		this.compagnieVoyage = compagnieVoyage;
		this.image=image;

	}
	
	public Voyage(String nom, String reference, Date dateDepart, Date dateArrivee, int nbPlaces, double prixPublic,
			double remise, String pays, String ville, String continent,
			String compagnieVoyage) {
		super();
		this.nom = nom;
		this.reference = reference;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbPlaces = nbPlaces;
		this.prixPublic = prixPublic;
		this.remise = remise;
		this.pays = pays;
		this.ville = ville;
		this.continent = continent;
		this.compagnieVoyage = compagnieVoyage;

	}

	public Voyage(int id, String nom, String reference, Date dateDepart, Date dateArrivee, int nbPlaces,
			double prixPublic, double remise, String pays, String ville,
			String continent, String compagnieVoyage,byte[] image) {
		super();
		this.id = id;
		this.nom = nom;
		this.reference = reference;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbPlaces = nbPlaces;
		this.prixPublic = prixPublic;
		this.remise = remise;
		this.pays = pays;
		this.ville = ville;
		this.continent = continent;
		this.compagnieVoyage = compagnieVoyage;
		this.image=image;
	
	}
	
	

	/**
	 * getters et setters
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	
	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public double getPrixPublic() {
		return prixPublic;
	}

	public void setPrixPublic(double prixPublic) {
		this.prixPublic = prixPublic;
	}

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

	public double getPrixRemise() {
		return prixRemise;
	}

	public void setPrixRemise(double prixRemise) {
		this.prixRemise = prixRemise;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCompagnieVoyage() {
		return compagnieVoyage;
	}

	public void setCompagnieVoyage(String compagnieVoyage) {
		this.compagnieVoyage = compagnieVoyage;
	}

	public String getPrestation() {
		return prestation;
	}

	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}

	public List<Photo> getListePhotos() {
		return listePhotos;
	}

	public void setListePhotos(List<Photo> listePhotos) {
		this.listePhotos = listePhotos;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Dossier> getListeDossiers() {
		return listeDossiers;
	}

	public void setListeDossiers(List<Dossier> listeDossiers) {
		this.listeDossiers = listeDossiers;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public List<String> getImageString() {
		return imageString;
	}

	public void setImageString(List<String> imageString) {
		this.imageString = imageString;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getNbPhoto() {
		return nbPhoto;
	}

	public void setNbPhoto(int nbPhoto) {
		this.nbPhoto = nbPhoto;
	}
	
	

}
