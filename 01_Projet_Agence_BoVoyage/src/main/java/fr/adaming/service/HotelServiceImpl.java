package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.dao.IHotelDao;
import fr.adaming.model.Hotel;

public class HotelServiceImpl implements IHotelService {

	@Autowired
	IHotelDao hotelDao;

	public void setHotelDao(IHotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelDao.getAllHotels();
	}

	@Override
	public Hotel addHotel(Hotel h) {
		return hotelDao.addHotel(h);
	}

	@Override
	public Hotel getHotelById(int id) {
		return hotelDao.getHotelById(id);
	}

	@Override
	public Hotel updateHotel(Hotel h) {
		return hotelDao.updateHotel(h);
	}

	@Override
	public int deleteHotel(int id) {
		return hotelDao.deleteHotel(id);
	}

}
