package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IDossierDao;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;

@Service
@Transactional
public class DossierServiceImpl implements IDossierService{
	
	@Autowired
	private IDossierDao dossierDao;
	
	//Setter pour l'injection de dépendance
	public void setDossierDao(IDossierDao dossierDao) {
		this.dossierDao = dossierDao;
	}

	@Override
	public Dossier addDossier(Dossier dossier) {
		return dossierDao.addDossier(dossier);
	}

	@Override
	public Dossier updateDossier(Dossier dossier) {
		return dossierDao.updateDossier(dossier);
	}

	@Override
	public int deleteDossier(Dossier dossier) {
		return dossierDao.deleteDossier(dossier);
	}

	@Override
	public Dossier getDossierById(int id) {
		return dossierDao.getDossierById(id);
	}

	@Override
	public List<Dossier> getAllDossiers() {
		return dossierDao.getAllDossiers();
	}
}
