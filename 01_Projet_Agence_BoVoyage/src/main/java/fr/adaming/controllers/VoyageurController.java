package fr.adaming.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.adaming.model.Voyageur;
import fr.adaming.service.IVoyageurService;

@Controller
@RequestMapping("/client")
public class VoyageurController {
	
	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	} 
	
	@Autowired
	private IVoyageurService voyageurService;
	
	public void setVoyageurService(IVoyageurService voyageurService) {
		this.voyageurService = voyageurService;
	}

	
	// *******************************PAGE ACCUEIL****************************************************************

	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		System.out.println("Accueil");

		return "accueil";
	}
	// ***********************************************************************************************************************

	
	// *******************************AJOUTER UN VOYAGEUR****************************************************************
		
	@RequestMapping(value = "/formAjouter", method = RequestMethod.GET)
	public String afficheFormAjout(Model model) {
		model.addAttribute("vForm", new Voyageur()); // ajouter model Voyage
		return "ajoutVoyageur";
	}
		
	@RequestMapping(value = "/soumettreFormAjoutVoyageur", method = RequestMethod.POST)
	public String soumettreAjouterVoyageur(Model model, @ModelAttribute("vForm") Voyageur voyageur) {
		voyageur.setClientResa(false);
		System.out.println("DATE NAISSANCE" +voyageur.getDateNaissance());
		Voyageur vOut=voyageurService.addVoyageur(voyageur);
		if (vOut.getId() != 0) {
			return "redirect:accueil";
		} else
			return "redirect:formAjouter";
	}

	// ***********************************************************************************************************************

}
