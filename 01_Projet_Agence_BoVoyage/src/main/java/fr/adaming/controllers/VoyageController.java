package fr.adaming.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.adaming.model.Person;
import fr.adaming.model.Voyage;
import fr.adaming.model.VoyageAngular;
import fr.adaming.service.IVoyageService;

@Controller
@Scope("session")
public class VoyageController {

	@Autowired
	IVoyageService voyageService;
	
	private Voyage voyage;

	@InitBinder
	public void dataBinding(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	// ***********************************************************************************************************************
	// ******************** AJOUTER UN VOYAGE
	// *****************************************************************************

	@RequestMapping(value = "/voyage/ajouter")
	public String afficheForm(Model model) {
		Voyage v = new Voyage();
		v.setCompagnieVoyage("TEST");
		model.addAttribute("vForm", v); // ajouter model Voyage
		return "ajoutVoyage";
	}

	// @RequestParam("from") Date fromDate
	@RequestMapping(value = "/voyage/soumettreAjoutVoyage", method = RequestMethod.POST)
	public String soumettreAjouterVoyage(@ModelAttribute("vForm") Voyage v) {
		System.out.println("Ajout Voyage:" + v.getCompagnieVoyage());
		
		voyage=v;
		return "ajoutPhotoVoyage";
	}
	
	@RequestMapping(value = "/voyage/recupPhoto", method = RequestMethod.POST)
	public  @ResponseBody String ajouterPhoto(@RequestBody Person person) {
		System.out.println("Test angular:");
			
		return "accueil";
	}
	
	
	
	// ***********************************************************************************************************************
		// ******************** AJOUTER PHOTO


	// ***********************************************************************************************************************

	@RequestMapping(value="/agent/accueilAgent")
	public String afficheListeVoyages(Model model) {
		// récupération de la liste de voyages de la BD
		List<Voyage> listVoyages = voyageService.getAllVoyages();

		// ajout de la liste dans le modele
		model.addAttribute("voyageList2", listVoyages);

		return "accueilAgent";

	}

}