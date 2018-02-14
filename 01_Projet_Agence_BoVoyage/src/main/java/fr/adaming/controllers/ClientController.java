package fr.adaming.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.model.Client;
import fr.adaming.service.IClientService;

@Controller
@Scope("request")
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private IClientService clientService;

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public ModelAndView afficheListe() {
		List<Client> liste = clientService.getAllClients();
		return new ModelAndView("listeClients", "clientsListe", liste);
	}

	@RequestMapping(value = "/afficheRecherche", method = RequestMethod.GET)
	public String afficheRechercher(Model modele) {
		modele.addAttribute("clientRecherche", new Client());
		modele.addAttribute("indice", false);
		return "rechercheClient";
	}

	@RequestMapping(value = "/soumettreRecherche", method = RequestMethod.POST)
	public String soumettreRechercher(Model model, @ModelAttribute("clientRecherche") Client c) {
		Client cOut = clientService.getClientById(c.getId());
		if (cOut != null) {
			model.addAttribute("client", cOut);
			model.addAttribute("indice", true);
			return "rechercheClient";
		} else {
			return "redirect:afficheRecherche";
		}
	}

	@RequestMapping(value = "/afficheAjout", method = RequestMethod.GET)
	public ModelAndView afficheAjouter() {
		return new ModelAndView("ajoutClient", "clientAjout", new Client());
	}

	@RequestMapping(value = "/soumettreAjout", method = RequestMethod.POST)
	public String soumettreAjouter(@ModelAttribute("clientAjout") Client c) {
		Client cOut = clientService.addClient(c);
		if (cOut.getId() != 0) {
			return "redirect:liste";
		} else {
			return "redirect:afficheAjout";
		}
	}

	@RequestMapping(value = "/afficheModif", method = RequestMethod.GET)
	public String afficheModifier(ModelMap model, @RequestParam("pId") int id) {
		Client c = clientService.getClientById(id);
		model.addAttribute("modifClientC", c);
		return "clientModifClient";
	}

	@RequestMapping(value = "/soumettreModifClient", method = RequestMethod.POST)
	public String soumettreModifier(@ModelAttribute("modifClientC") Client c) {
		System.out.println(c);
		clientService.updateClient(c);
		return "redirect:liste";
	}

	@RequestMapping(value = "/modiflien", method = RequestMethod.GET)
	public String updateLien(ModelMap model, @RequestParam("pId") int id) {
		Client c = clientService.getClientById(id);
		model.addAttribute("modifClientA", c);
		return "clientModifAgent";
	}

	@RequestMapping(value = "/soumettreModifAgent", method = RequestMethod.POST)
	public String soumettreModifierAgent(@ModelAttribute("modifClientA") Client c) {
		System.out.println(c);
		clientService.updateClient(c);
		return "redirect:liste";
	}

	@RequestMapping(value = "/suprimlien/{pId}", method = RequestMethod.GET)
	public String deletLien(Model model, @PathVariable("pId") int id) {
		clientService.deleteClient(id);
		List<Client> liste = clientService.getAllClients();
		model.addAttribute("clientsListe", liste);
		return "listeClients";
	}
}
