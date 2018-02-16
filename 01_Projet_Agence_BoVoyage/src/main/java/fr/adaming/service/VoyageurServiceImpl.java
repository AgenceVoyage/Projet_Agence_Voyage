package fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IVoyageurDao;
import fr.adaming.model.Client;
import fr.adaming.model.Voyageur;

@Service
@Transactional
public class VoyageurServiceImpl implements IVoyageurService{

	@Autowired
	private IVoyageurDao voyageurDao;
	
	//Setter pour l'injection de dépendance
	public void setVoyageurDao(IVoyageurDao voyageurDao) {
		this.voyageurDao = voyageurDao;
	}
	
	@Override
	public Client addVoyageur(Client voyageur) {
		return voyageurDao.addVoyageur(voyageur);
	}


	@Override
	public int deleteVoyageur(Voyageur voyageur) {
		return voyageurDao.deleteVoyageur(voyageur);
	}

	@Override
	public Voyageur getVoyageurById(int id) {
		return voyageurDao.getVoyageurById(id);
	}

}
