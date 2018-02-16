package fr.adaming.service;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IClientDao;
import fr.adaming.dao.IDossierDao;
import fr.adaming.model.Assurance;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;
import fr.adaming.model.Voyageur;

@Service
@Transactional
public class DossierServiceImpl implements IDossierService {

	@Autowired
	private IDossierDao dossierDao;
	
	@Autowired
	private IClientDao clientDao;

	// Setter pour l'injection de dépendance
	public void setDossierDao(IDossierDao dossierDao) {
		this.dossierDao = dossierDao;
	}

	@Override
	public Dossier addDossier(Dossier dossier) {
		dossier.setStatut("en attente");
		return dossierDao.addDossier(dossier);
	}

	@Override
	public Dossier updateDossier(Dossier dossier) {
		DecimalFormat df = new DecimalFormat("#");
		dossier.setNumDossier(dossier.getVoyage().getPays().substring(0, 3) + df.format(Math.random() * (1000 - 100))
				+ dossier.getVoyage().getContinent().substring(0, 3));

		double prixHotel;
		if (dossier.getVoyage().getHotel() != null) {
			if (dossier.getNomFormule().equals("hebergement seul")) {
				prixHotel = dossier.getVoyage().getHotel().getPrix();
			} else if (dossier.getNomFormule().equals("petit dejeuner")) {
				prixHotel = dossier.getVoyage().getHotel().getPrix() * (1 + 10 / 100);
			} else if (dossier.getNomFormule().equals("demi pension")) {
				prixHotel = dossier.getVoyage().getHotel().getPrix() * (1 + 30 / 100);
			} else if (dossier.getNomFormule().equals("pension complete")) {
				prixHotel = dossier.getVoyage().getHotel().getPrix() * (1 + 50 / 100);
			} else {
				prixHotel = 0;
			}
			dossier.getVoyage().getHotel().setPrix(prixHotel);
		}

		double prixAssurance = 0;
		if (dossier.getListeAssurances() != null) {
			for (Assurance assurance : dossier.getListeAssurances()) {
				prixAssurance = prixAssurance + assurance.getPrix();
			}
		}

		if (dossier.getPrestation().equals("avion")) {
			dossier.setPrixTotal(dossier.getVoyage().getPrixRemise() + prixAssurance);
		} else if (dossier.getPrestation().equals("avion+hotel")) {
			dossier.setPrixTotal(
					dossier.getVoyage().getPrixRemise() + prixAssurance + dossier.getVoyage().getHotel().getPrix());
		} else if (dossier.getPrestation().equals("avion+hotel+voiture")) {
			dossier.setPrixTotal(dossier.getVoyage().getPrixRemise() + prixAssurance
					+ dossier.getVoyage().getHotel().getPrix() + dossier.getVoyage().getVoiture().getPrix());
		} else {
			dossier.setPrixTotal(
					dossier.getVoyage().getPrixRemise() + prixAssurance + dossier.getVoyage().getVoiture().getPrix());
		}

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

	@Override
	public Dossier recupDernierDossier() {
		// récupération de tous les dossiers
		List<Dossier> listOut = dossierDao.getAllDossiers();
		
		Dossier dOut = listOut.get(listOut.size()-1);
		return dOut;
	}

	@Override
	public void confirmAddDossier(Dossier dossier, String mail) throws Exception {
		String smtpHost = "smtp.gmail.com";
		String from = "adaming444@gmail.com";
		String to = mail;
		String username = "adaming444@gmail.com";
		String password = "adaming44";

		Properties props = new Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", "587");

		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		//message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail));
		message.setSubject("Confirmation creation du compte BoVoyage");
		// message.setText("Vous avez bien ajouter le produit
		// :"+p.getDesignation());
		// message.setText("La quantité du produit ajouté est de :
		// :"+p.getQuantite());
		// message.setText(" Descriptif du produit :"+p.getDescription());
		
		int idClientResa = 0;
		for (Voyageur voyageur : dossier.getListeClients()) {
			if (voyageur.isClientResa()) {
				idClientResa = voyageur.getId();
			}
		}
		message.setText("Vous avez effectué votre réservation, au nom de  :"+clientDao.getClientById(idClientResa).getNom() +" "+"client.getPrenom()"+ '\n'+"Votre date de naissance est "+ "client.getDateNaissance()" + '\n'+ "En cas de reservation, la confirmation sera envoyé au telephone : "+"client.getTel()"+ '\n'+"Nous vous invitons à poursuivre la navigation sur notre site :"+"http://localhost:8080/01_Projet_Agence_BoVoyage/utilisateur/accueil" );

		Transport tr = session.getTransport("smtp");
		tr.connect(smtpHost, username, password);
		message.saveChanges();

		// tr.send(message);
		/**
		 * Genere l'erreur. Avec l authentification, oblige d utiliser
		 * sendMessage meme pour une seule adresse...
		 */

		tr.sendMessage(message, message.getAllRecipients());
		tr.close();

	}

		
	
}
