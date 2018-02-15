package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Hotel;

public interface IHotelService {

	/**
	 * Methode pour recuperer la liste des hotels
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
	 * Methode pour obtneir un hotel par son id
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
