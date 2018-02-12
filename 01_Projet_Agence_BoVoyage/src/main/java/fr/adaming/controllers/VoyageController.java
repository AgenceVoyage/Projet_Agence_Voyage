package fr.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VoyageController {

	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		System.out.println("Accueil");

		return "accueil";
	}

}
