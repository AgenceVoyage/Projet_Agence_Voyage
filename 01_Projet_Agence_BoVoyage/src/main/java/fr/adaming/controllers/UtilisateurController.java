package fr.adaming.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.model.Client;
import fr.adaming.model.Voyage;
import fr.adaming.service.IClientService;
import fr.adaming.service.IVoyageService;

/**
 * controller pour gérer les flux concernant le frontOffice utilisateur
 * 
 * @author Adaming44
 *
 */
@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	IVoyageService voyageService;

	@Autowired
	private IClientService clientService;

	public void setVoyageService(IVoyageService voyageService) {
		this.voyageService = voyageService;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		// récupération de la liste de voyages de la BD
		List<Voyage> listVoyages = voyageService.getAllVoyages();

		// ajout de la liste dans le modele
		model.addAttribute("voyageList", listVoyages);

		return "accueil";
	}

	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	/**
	 * Méthode pour afficher le formulaire d'inscription
	 * 
	 * @return
	 */
	@RequestMapping(value = "/client/afficheAjout", method = RequestMethod.GET)
	public ModelAndView afficheAjouter() {
		return new ModelAndView("ajoutClient", "clientAjout", new Client());
	}

	/**
	 * Méthode de soumision du formulaire d'inscription : Ajout d'un client dans
	 * la base
	 * 
	 * @param c
	 * @return
	 */
	@RequestMapping(value = "/client/soumettreAjout", method = RequestMethod.POST)
	public String soumettreAjouter(@ModelAttribute("clientAjout") Client c) {
		Client cOut = clientService.addClient(c);
		if (cOut.getId() != 0) {
			return "accueil";
		} else {
			return "redirect:afficheAjout";
		}
	}

}
