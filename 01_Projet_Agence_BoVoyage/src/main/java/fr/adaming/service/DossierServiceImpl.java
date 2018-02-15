package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IDossierDao;
import fr.adaming.model.Assurance;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;

@Service
@Transactional
public class DossierServiceImpl implements IDossierService {

	@Autowired
	private IDossierDao dossierDao;

	// Setter pour l'injection de dépendance
	public void setDossierDao(IDossierDao dossierDao) {
		this.dossierDao = dossierDao;
	}

	@Override
	public Dossier addDossier(Dossier dossier) {
		double prixHotel;
		if(dossier.getVoyage().getHotel().getNomFormule().equals("hebergement seul")){
			prixHotel = dossier.getVoyage().getHotel().getPrix();
		}else if (dossier.getVoyage().getHotel().getNomFormule().equals("petit dejeuner")){
			prixHotel= dossier.getVoyage().getHotel().getPrix()*(1+10/100);
		}else if (dossier.getVoyage().getHotel().getNomFormule().equals("demi pension")){
			prixHotel= dossier.getVoyage().getHotel().getPrix()*(1+30/100);
		}else{
			prixHotel= dossier.getVoyage().getHotel().getPrix()*(1+50/100);
		}
		dossier.getVoyage().getHotel().setPrix(prixHotel);
		double prixAssurance = 0;
		for (Assurance assurance : dossier.getListeAssurances()) {
			prixAssurance = prixAssurance + assurance.getPrix();
		}
		if (dossier.getVoyage().getPrestation().equals("avion")) {
			dossier.setPrixTotal(dossier.getVoyage().getPrixRemise() + prixAssurance);
		} else if (dossier.getVoyage().getPrestation().equals("avion+hotel")) {
			dossier.setPrixTotal(
					dossier.getVoyage().getPrixRemise() + prixAssurance + dossier.getVoyage().getHotel().getPrix());
		} else if (dossier.getVoyage().getPrestation().equals("avion+hotel+voiture")) {
			dossier.setPrixTotal(dossier.getVoyage().getPrixRemise() + prixAssurance
					+ dossier.getVoyage().getHotel().getPrix() + dossier.getVoyage().getVoiture().getPrix());
		} else {
			dossier.setPrixTotal(
					dossier.getVoyage().getPrixRemise() + prixAssurance + dossier.getVoyage().getVoiture().getPrix());
		}

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
