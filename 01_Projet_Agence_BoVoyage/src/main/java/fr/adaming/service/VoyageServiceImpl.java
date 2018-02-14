package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IVoyageDao;
import fr.adaming.model.Voyage;

@Service
@Transactional
public class VoyageServiceImpl implements IVoyageService {

	@Autowired
	private IVoyageDao voyageDao;
	
	public void setVoyageDao(IVoyageDao voyageDao) {
		this.voyageDao = voyageDao;
	}

	@Override
	public Voyage getVoyageById(int idVoyage) {
		return voyageDao.getVoyageById(idVoyage);
	}

	@Override
	public List<Voyage> getAllVoyages() {
		return voyageDao.getAllVoyages();
	}

	@Override
	public Voyage addVoyage(Voyage voy) {
		voy.setDisponible(true);
		voy.setPrixRemise(voy.getPrixPublic()*(1-voy.getRemise()/100));
		return voyageDao.addVoyage(voy);
	}

	@Override
	public Voyage updateVoyage(Voyage voy) {
		if (voy.getNbPlaces()==0) {
			voy.setDisponible(false);
		} else {
			voy.setDisponible(true);
		}
		voy.setPrixRemise(voy.getPrixPublic()*(1-voy.getRemise()/100));
		
		return voyageDao.updateVoyage(voy);
	}

	@Override
	public int deleteVoyage(int idVoyage) {
		return voyageDao.deleteVoyage(idVoyage);
	}
	
	

}
