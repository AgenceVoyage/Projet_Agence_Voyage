package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Hotel;

public interface IHotelService {

	public List<Hotel> getAllHotels();

	public Hotel addHotel(Hotel h);

	public Hotel getHotelById(int id);

	public Hotel updateHotel(Hotel h);

	public int deleteHotel(int id);
}
