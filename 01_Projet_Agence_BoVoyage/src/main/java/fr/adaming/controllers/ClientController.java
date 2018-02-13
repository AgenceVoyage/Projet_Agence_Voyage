package fr.adaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public ModelAndView afficheListe() {
		List<Client> liste = clientService.getAllClients();
		return new ModelAndView("listeClients", "clientsListe", liste);
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
}
