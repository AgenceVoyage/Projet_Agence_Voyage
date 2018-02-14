package fr.adaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.adaming.model.Dossier;
import fr.adaming.service.IDossierService;

/**
 * Controller pour gerer les flux frontOffice concernant les dossier de
 * reservation
 * 
 * @author intiformation
 *
 */
@Controller
@RequestMapping("/dossiers")
public class DossierController {

	@Autowired
	private IDossierService dossierService;

	public void setDossierService(IDossierService dossierService) {
		this.dossierService = dossierService;
	}

	/**
	 * Methode permettant d'afficher la liste des dossiers
	 * 
	 * @return la page allDossier.jsp, la page affichant cette liste
	 */
	@RequestMapping(value = "/listeDossier", method = RequestMethod.GET)
	public ModelAndView afficheListeDossier() {
		// Recupereration de la liste de la bd
		List<Dossier> listeDossier = dossierService.getAllDossiers();
		return new ModelAndView("allDossier", "dossierListe", listeDossier);
	}

	/////////// -- Ajout d'un dossier-- /////////////
	/**
	 * Methode pour afficher le formulaire d'ajout d'un dossier
	 * 
	 * @return la page ajoutDossier.jsp ou est pr�sent le formulaire
	 */
	@RequestMapping(value = "/afficheAjoutDossier", method = RequestMethod.GET)
	public ModelAndView afficheAjout() {
		return new ModelAndView("ajoutDossier", "dossierAjout", new Dossier());
	}

	/**
	 * Methode pour soumettre le formulaire d'ajout d'un dossier
	 * 
	 * @param dossier
	 * @return un dossier
	 */
	@RequestMapping(value = "/soumettreAjoutDossier", method = RequestMethod.POST)
	public String soumettreAjout(@ModelAttribute("dossierAjout") Dossier dossier) {
		// Appel de la methode service
		Dossier dOut = dossierService.addDossier(dossier);
		if (dOut.getId() != 0) {
			return "redirect:listeDossier";
		} else {
			return "redirect:afficheAjoutDossier";
		}
	}

	/////////// -- Suppression d'un dossier-- /////////////
	/**
	 * Methode permettant d'afficher le formulaire de suppression
	 * 
	 * @param modele
	 * @return
	 */
	@RequestMapping(value = "/afficheSuppDossier", method = RequestMethod.GET)
	public String afficherSupprimer(Model modele) {
		modele.addAttribute("dossierSupp", new Dossier());
		return "supprimerDossier";
	}

	/**
	 * Methode pour soumettre le formulaire de suppression d'un dossier.
	 * 
	 * @param dossier
	 * @return
	 */
	@RequestMapping(value = "/soumettreSuppDossier", method = RequestMethod.POST)
	public String SoumettreSupprimer(Dossier dossier) {
		// Appel de la methode service
		int verif = dossierService.deleteDossier(dossier);
		if (verif != 0) {
			return "redirect:listeDossier";
		} else {
			return "redirect:afficheSuppDossier";
		}
	}

	/////////// -- Suppression d'un dossier avec un bouton-- /////////////
	/**
	 * Methode pour supprimer un dossier par un bouton dans la liste de dossier
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/suppLien", method = RequestMethod.GET)
	public String suppLien(@RequestParam("pId") int id) {
		Dossier d = new Dossier();
		d.setId(id);
		dossierService.deleteDossier(d);
		return "redirect:listeDossier";
	}

	/////////// -- Modification d'un dossier avec un bouton-- /////////////
	/**
	 * Methode pour modifier un dossier via un bouton dans la liste de dossier
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/modifLien", method = RequestMethod.GET)
	public String modifLien(ModelMap model, @RequestParam("pId") int id) {
		Dossier dIn = new Dossier();
		dIn.setId(id);
		// Recuperation du dossier de la bd
		Dossier dOut = dossierService.getDossierById(dIn.getId());
		model.addAttribute("dossierModif", dOut);
		return "modifierDossier";
	}

	/////////// -- Recherche d'un dossier -- /////////////
	/**
	 * Methode pour afficher le formulaire de recherche
	 * @param modele
	 * @return
	 */
	@RequestMapping(value="/afficheRech", method=RequestMethod.GET)
	public String afficherRecherche(Model modele){
		modele.addAttribute("dossierRech", new Dossier());
		return "rechercheDossier";
	}
	
	/**
	 * Methode permettant de soumettre le formulaire de recherche d'un dossier
	 * @param ra
	 * @param modele
	 * @param dossier
	 * @return
	 */
	
	@RequestMapping(value = "/soumettreRech",method=RequestMethod.POST)
	public String soumettreRecherche(RedirectAttributes ra, Model modele, @ModelAttribute("dossierRech") Dossier dossier){
		Dossier dOut = dossierService.getDossierById(dossier.getId());
		modele.addAttribute("dossierRech", dOut);
		if(dOut!= null){
			modele.addAttribute("dossierRech", dOut);
			return "rechercheDossier";
		}else{
			ra.addFlashAttribute("message", "Le dossier recherche n'existe pas!!");
			return "redirect:afficheRech";
		}
	}
}