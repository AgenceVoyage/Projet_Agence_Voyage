package fr.adaming.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.adaming.model.Voyage;
import fr.adaming.service.IVoyageService;

@Controller
public class VoyageController {
	
	@Autowired
	IVoyageService voyageService;

	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	} 
	
	@RequestMapping(value = "/accueil")
	public String affichageAccueil(Model model) {
		System.out.println("Accueil");

		return "accueil";
	}
	

	// ***********************************************************************************************************************
	// ******************** AJOUTER UN VOYAGE
	// *****************************************************************************

	@RequestMapping(value = "/voyage/ajouter")
	public String afficheForm(Model model){
		Voyage v = new Voyage();
		v.setCompagnieVoyage("TEST");
		model.addAttribute("vForm", v); // ajouter model Voyage
		return "ajoutVoyage";
	}

		//@RequestParam("from") Date fromDate
	@RequestMapping(value = "/voyage/soumettreAjoutVoyage", method = RequestMethod.POST)
	
	public String soumettreAjouterVoyage(@ModelAttribute("vForm") Voyage v) {
		System.out.println("Ajout Voyage:"+v.getCompagnieVoyage());
		//System.out.println(fromDate);
		
		voyageService.addVoyage(v);
		return "accueil";
	}
	

	// ***********************************************************************************************************************

}