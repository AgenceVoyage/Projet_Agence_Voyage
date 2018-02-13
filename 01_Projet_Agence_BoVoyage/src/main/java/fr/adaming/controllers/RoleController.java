package fr.adaming.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoleController {
	
	@RequestMapping(value = "/agent/accueilAgent", method = RequestMethod.GET)
	public String afficheAdmin(Model model) {
		// Recuperer le context de spring security
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// Recuperer l'identifiant de l'utilisateur connecté
		String mail = auth.getName();
		model.addAttribute("msg", "Bonjour M.Agent " + mail +"!" +" Vous etes dans votre espace agent.");
		return "accueilAgent";
	}
	
	@RequestMapping(value = "/client/accueilClient", method = RequestMethod.GET)
	public String afficheEmp(Model model) {
		// Recuperer le context de spring security
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		// Recuperer l'identifiant de l'utilisateur connecté
		String mail = auth.getName();
		model.addAttribute("msg", "Bonjour M.Client "+ mail +"!"+ " Vous etes dans votre espace client.");
		return "accueilClient";
	}

}
