package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Hotel;

/**
 * interface des methodes dao de Hotel
 * @author inti0294
 *
 */
public interface IHotelDao {

	/**
	 * Methode pour récuperer la liste des hoteles
	 * @return
	 */
	public List<Hotel> getAllHotels();
	
	/**
	 * Methode pour ajouter un hotel 
	 * @param h
	 * @return
	 */
	public Hotel addHotel(Hotel h);
	
	/**
	 * Methode pour obtenir un hotel par son Id
	 * @param id
	 * @return
	 */
	public Hotel getHotelById(int id);
	
	/**
	 * Methode pour modifier un hotel
	 * @param h
	 * @return
	 */
	public Hotel updateHotel(Hotel h);

	/**
	 * Methode pour supprimer un hotel
	 * @param id
	 * @return
	 */
	public int deleteHotel(int id);
}
