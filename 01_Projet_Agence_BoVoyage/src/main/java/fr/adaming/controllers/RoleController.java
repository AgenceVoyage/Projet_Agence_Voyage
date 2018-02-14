package fr.adaming.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.adaming.model.Voyage;
import fr.adaming.service.IVoyageService;

/**
 * Controller permettant de naviguer sur les pages Clients et Agents apres leurs
 * connection
 * 
 * @author intiformation
 *
 */
@Controller
public class RoleController {

	/**
	 * Methode permettant l'acces à la page d'accueil Agent.
	 * 
	 * @param model
	 * @return la page accueilAgent.jsp
	 */

	@Autowired
	IVoyageService voyageService;

	@InitBinder
	public void dataBinding(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/agent/accueilAgent", method = RequestMethod.GET)
	public String afficheAgent(Model model) {
		// Recuperer le context de spring security
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// Recuperer l'identifiant de l'utilisateur connecté
		String mail = auth.getName();
		model.addAttribute("msg", "Bonjour M.Agent " + mail + "!" + " Vous etes dans votre espace agent.");

		// récupération de la liste de voyages de la BD
		List<Voyage> listVoyages = voyageService.getAllVoyages();

		// ajout de la liste dans le modele
		model.addAttribute("voyageList2", listVoyages);
		return "accueilAgentPage";
	}

	/**
	 * Methode permettant l'acces à la page d'accueil Agent.
	 * 
	 * @param model
	 * @return la page accueilClient.jsp
	 */
	@RequestMapping(value = "/client/accueilClient", method = RequestMethod.GET)
	public String afficheClient(Model model) {
		// Recuperer le context de spring security
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// Recuperer l'identifiant de l'utilisateur connecté
		String mail = auth.getName();
		model.addAttribute("msg", "Bonjour M.Client " + mail + "!" + " Vous etes dans votre espace client.");
		return "accueilClient";
	}
	
	

	// -----------------Méthode pour supprimer un voyage via un lien dans
	// l'accueil agent
	@RequestMapping(value = "/agent/supprimeLienVoyage", method = RequestMethod.GET)
	public String supprVoyageByLien(@RequestParam("pId") int idVoyage) {
		//appel de la méthode service
		voyageService.deleteVoyage(idVoyage);
		return "redirect:accueilAgent";
	}

}
