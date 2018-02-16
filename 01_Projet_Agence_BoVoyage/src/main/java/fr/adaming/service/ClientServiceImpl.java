package fr.adaming.service;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;
import fr.adaming.model.Role;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {

	@Autowired
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public Client isExist(Client client) {
		return clientDao.isExist(client);
	}

	@Override
	public List<Client> getAllClients() {
		return clientDao.getAllClients();
	}

	@Override
	public Client addClient(Client c) {
		c.setClientResa(true);
		c.setActive(true);
		c.setRole(new Role(2, "ROLE_CL"));
		return clientDao.addClient(c);
	}

	@Override
	public Client updateClient(Client c) {
		return clientDao.updateClient(c);
	}

	@Override
	public int deleteClient(int id) {
		return clientDao.deleteClient(id);
	}

	@Override
	public Client getClientById(int id) {
		return clientDao.getClientById(id);
	}

	@Override
	public Client getClientByMail(String mail) {
		return clientDao.getClientByMail(mail);
	}

	@Override
	public Client getClientByDossier(Dossier d) {
		List<Client> listOut = clientDao.getListVoyageursByDossier(d);
		Client c = new Client();
		
		for (Client element : listOut) {
			if (element.isClientResa()) {
				c=element;
			}
		}
		
		return c
				;
	}
	
	public void confirmAddClient(Client client, String mail) throws Exception {
		String smtpHost = "smtp.gmail.com";
		String from = "adaming444@gmail.com";
		String to = mail;
		String username = "adaming444@gmail.com";
		String password = "adaming44";

		Properties props = new Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", "587");

		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		//message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail));
		message.setSubject("Confirmation creation du compte BoVoyage");
		// message.setText("Vous avez bien ajouter le produit
		// :"+p.getDesignation());
		// message.setText("La quantité du produit ajouté est de :
		// :"+p.getQuantite());
		// message.setText(" Descriptif du produit :"+p.getDescription());
		message.setText("Vous avez bien creez votre compte, au nom de  :"+client.getNom() +" "+client.getPrenom()+ '\n'+"Votre date de naissance est "+ client.getDateNaissance() + '\n'+ "En cas de reservation, la confirmation sera envoyé au telephone : "+client.getTel()+ '\n'+"Nous vous invitons à poursuivre la navigation sur notre site :"+"http://localhost:8080/01_Projet_Agence_BoVoyage/utilisateur/accueil" );

		Transport tr = session.getTransport("smtp");
		tr.connect(smtpHost, username, password);
		message.saveChanges();

		// tr.send(message);
		/**
		 * Genere l'erreur. Avec l authentification, oblige d utiliser
		 * sendMessage meme pour une seule adresse...
		 */

		tr.sendMessage(message, message.getAllRecipients());
		tr.close();

	}
}
