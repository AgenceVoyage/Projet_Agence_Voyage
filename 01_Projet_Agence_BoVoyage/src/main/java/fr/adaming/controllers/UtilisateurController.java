package fr.adaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.adaming.model.Voyage;
import fr.adaming.service.IVoyageService;

/**
 * controller pour gérer les flux concernant le frontOffice utilisateur
 * @author Adaming44
 *
 */
@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	IVoyageService voyageService;
	
	public void setVoyageService(IVoyageService voyageService) {
		this.voyageService = voyageService;
	}



	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		//récupération de la liste de voyages de la BD
		List<Voyage> listVoyages = voyageService.getAllVoyages();
		
		//ajout de la liste dans le modele
		model.addAttribute("voyageList", listVoyages);

		return "accueil";
	}

}
