package fr.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.adaming.model.Voyage;

@Controller
public class VoyageController {

	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		System.out.println("Accueil");

		return "accueil";
	}

	// ***********************************************************************************************************************
	// ******************** AJOUTER UN VOYAGE
	// *****************************************************************************

	@RequestMapping(value = "/voyage/ajouter")
	public String afficheForm(Model model) {
		model.addAttribute("vForm", new Voyage()); // ajouter model Voyage
		return "ajoutVoyage";
	}

	@RequestMapping(value = "/voyage/soumettreAjoutVoyage", method = RequestMethod.POST)
	public String soumettreAjouterCA(Model model, @ModelAttribute("vForm") Voyage v) {

		return "redirect:accueil";
	}

	// ***********************************************************************************************************************

}