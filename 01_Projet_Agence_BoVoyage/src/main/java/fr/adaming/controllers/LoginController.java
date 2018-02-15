package fr.adaming.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.adaming.service.IVoyageService;

/**
 * Classe permettant d'effectuer la connexion d'un agent � l'application.
 * 
 * @author intiformation
 *
 */
@Controller
public class LoginController {


	/**
	 * Methode permettant d'afficher le login.
	 * 
	 * @return la page login.jsp
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String afficheLogin() {
		return "login";
	}

	/**
	 * Methode permettant � un agent de se deconnecter.
	 * 
	 * @return la page login.jsp
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String seDeconnecter() {
		return "accueil";
	}

	/**
	 * Methode permettant de rediriger l'agent si il n'est pas autoris� �
	 * acceder � l'application
	 * 
	 * @return la page pageDenied.jsp
	 */
	@RequestMapping(value = "/refus", method = RequestMethod.GET)
	public String accesRefuse() {
		return "pageDenied";
	}

	/**
	 * Methode permettant de rediriger si l'authentification de l'agent �
	 * �chou�. Le message d'erreur informe l'agent que son mail ou mdp sont
	 * incorrect.
	 * 
	 * @param modele
	 * @return la page login.jsp
	 */
	@RequestMapping(value = "/loginEchec", method = RequestMethod.GET)
	public String echecLogin(Model modele) {
		modele.addAttribute("msg", true);
		return "login";
	}

}
