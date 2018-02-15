package fr.adaming.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.adaming.model.Adresse;
import fr.adaming.model.Assurance;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;
import fr.adaming.model.Hotel;
import fr.adaming.model.Voiture;
import fr.adaming.model.Voyage;
import fr.adaming.model.Voyageur;
import fr.adaming.service.IMailPdfService;

@Controller
@RequestMapping("/mailPdf")
public class MailPdfController {

	@Autowired
	private IMailPdfService mailPdfService;

	public void setMailPdfService(IMailPdfService mailPdfService) {
		this.mailPdfService = mailPdfService;
	}

	// *******************************PAGE ACCUEIL****************************************************************

	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		System.out.println("Accueil");

		return "accueil";
	}
	// ***********************************************************************************************************************

	// *******************************CREER PDF****************************************************************
	@RequestMapping(value = "/soumettrePdf", method = RequestMethod.GET)
	public String soumettrePdf(Model model) {
		Dossier dossier = new Dossier(1, "AA015","acceptée",10000);
		Client c1= new Client();
		c1.setId(1);
		c1.setNom("DUPONT");
		c1.setPrenom("Jacques");
		Client c2= new Client();
		c2.setId(2);
		c2.setNom("HENRY");
		c2.setPrenom("Paul");
		c2.setClientResa(true);
		c2.setMail("manu49_8@hotmail.fr");
		List<Client> listeClients= new ArrayList<>();
		listeClients.add(c1);
		listeClients.add(c2);
		dossier.setListeClients(listeClients);
		Voyage voyage = new Voyage("Escapade à Madagascar", "MAD028",new Date(),new Date(),18,1000,800,"Madagascar","Antananarivo","AFRIQUE","EASYJET");
		Voiture voiture =  new Voiture("SIXT", "4x4", 200);
		voyage.setVoiture(voiture);
		Adresse adresse= new Adresse(2, "avenue de l'océan", 45000, "Antananarivo");
		Hotel hotel = new Hotel("Hotel bleu", "pension complete", 500, adresse);
		voyage.setHotel(hotel);
		dossier.setVoyage(voyage);
		Assurance a1= new Assurance("annulation", 80);
		Assurance a2= new Assurance("rapatriment", 90);
		List<Assurance> listeAssurance= new ArrayList<>();
		listeAssurance.add(a1);
		listeAssurance.add(a2);
		dossier.setListeAssurances(listeAssurance);
		
		mailPdfService.creerPdf(dossier);
		return "redirect:accueil";

	}
	
	@RequestMapping(value = "/soumettreMail", method = RequestMethod.GET)
	public String envoyerMail(Model model) {
		Dossier dossier = new Dossier(1, "AA015","acceptée",10000);
		Client c1= new Client();
		c1.setId(1);
		c1.setNom("DUPONT");
		c1.setPrenom("Jacques");
		Client c2= new Client();
		c2.setId(2);
		c2.setNom("HENRY");
		c2.setPrenom("Paul");
		c2.setClientResa(true);
		c2.setMail("manulg13@gmail.com");
		List<Client> listeClients= new ArrayList<>();
		listeClients.add(c1);
		listeClients.add(c2);
		dossier.setListeClients(listeClients);
		Voyage voyage = new Voyage("Escapade à Madagascar", "MAD028",new Date(),new Date(),18,1000,800,"Madagascar","Antananarivo","AFRIQUE","EASYJET");
		Voiture voiture =  new Voiture("SIXT", "4x4", 200);
		voyage.setVoiture(voiture);
		Adresse adresse= new Adresse(2, "avenue de l'océan", 45000, "Antananarivo");
		Hotel hotel = new Hotel("Hotel bleu", "pension complete", 500, adresse);
		voyage.setHotel(hotel);
		dossier.setVoyage(voyage);
		Assurance a1= new Assurance("annulation", 80);
		Assurance a2= new Assurance("rapatriment", 90);
		List<Assurance> listeAssurance= new ArrayList<>();
		listeAssurance.add(a1);
		listeAssurance.add(a2);
		dossier.setListeAssurances(listeAssurance);
		
		mailPdfService.envoyerMail2(dossier);
		return "redirect:accueil";

	}
	
	
}
