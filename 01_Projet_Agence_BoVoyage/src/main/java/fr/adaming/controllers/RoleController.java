package fr.adaming.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Controller permettant de naviguer sur les pages Clients et Agents apres leurs connection
 * @author intiformation
 *
 */
@Controller
public class RoleController {
	
	/**
	 * Methode permettant l'acces à la page d'accueil Agent.
	 * @param model
	 * @return la page accueilAgent.jsp
	 */
	
	@RequestMapping(value = "/agent/accueilAgent", method = RequestMethod.GET)
	public String afficheAgent(Model model) {
		// Recuperer le context de spring security
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// Recuperer l'identifiant de l'utilisateur connecté
		String mail = auth.getName();
		model.addAttribute("msg", "Bonjour M.Agent " + mail +"!" +" Vous etes dans votre espace agent.");
		return "accueilAgent";
	}
	
	/**
	 * Methode permettant l'acces à la page d'accueil Agent.
	 * @param model
	 * @return la page accueilClient.jsp
	 */
	@RequestMapping(value = "/client/accueilClient", method = RequestMethod.GET)
	public String afficheClient(Model model) {
		// Recuperer le context de spring security
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// Recuperer l'identifiant de l'utilisateur connecté
		String mail = auth.getName();
		model.addAttribute("msg", "Bonjour M.Client "+ mail +"!"+ " Vous etes dans votre espace client.");
		return "accueilClient";
	}

}
