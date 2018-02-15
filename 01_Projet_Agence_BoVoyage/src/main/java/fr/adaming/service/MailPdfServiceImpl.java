package fr.adaming.service;

import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Assurance;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;
import fr.adaming.model.Voyageur;


//Ligne 76 à decommenter quand la BD sera complete
@Service
@Transactional
public class MailPdfServiceImpl implements IMailPdfService {

	@Autowired
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public int creerPdf(Dossier dossier) {
		// Création d'un document de taille A4 avec une marge de 36 sur
		// chaque bord
		// Document document = new Document(PageSize.A4, 36, 36, 36, 36);
		Document document = new Document();
		document.newPage();
		try {
			// Définir le type de document souhaité ainsi que son nom
			PdfWriter.getInstance(document, new FileOutputStream(
					"C:/Users/inti0294/Desktop/PDFTp/reservation" + dossier.getNumDossier() + ".pdf"));
			// Ouverture du document
			document.open();
			// Definition des polices
			Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 16);

			Phrase p1 = new Phrase("Recapitulatif de votre commande : \n");

			Phrase p11 = new Phrase("Liste des participants : \n\n");

			PdfPTable table = new PdfPTable(2);
			table.addCell("Nom");
			table.addCell("Prenom");

			int idClientResa=0;
			for (Voyageur voyageur : dossier.getListeClients()) {
				table.addCell(voyageur.getNom());
				table.addCell(voyageur.getPrenom());
				if(voyageur.isClientResa()){
					idClientResa=voyageur.getId();
				}	
			}
			 DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			 
		    //Client client = clientDao.getClientById(idClientResa);
			 String titre = "Reçu pour la réservation n° " + dossier.getNumDossier() +" de "+ clientDao.getClientById(idClientResa).getNom()+ " " + clientDao.getClientById(idClientResa).getPrenom() +" à destination de "
						+ dossier.getVoyage().getVille() + ", " + dossier.getVoyage().getPays() + " du "
						+ formatter.format(dossier.getVoyage().getDateArrivee()) + " au " + formatter.format(dossier.getVoyage().getDateDepart()) + "\n";

//			// Création des elements à ajouter dans le document
//			String titre = "Reçu pour la réservation n° " + dossier.getNumDossier() +" à destination de "
//					+ dossier.getVoyage().getVille() + ", " + dossier.getVoyage().getPays() + " du "
//					+ formatter.format(dossier.getVoyage().getDateArrivee()) + " au " + formatter.format(dossier.getVoyage().getDateDepart()) + "\n";
			Chunk c1 = new Chunk(titre, chapterFont);

			Phrase p12;
			double prixAssurance = 0;
			if (dossier.getListeAssurances().size() == 1) {

				p12 = new Phrase("Vous avez souscrit à l'assurance :");
				p12.add(dossier.getListeAssurances().get(0).getType());
				p12.add(" ");
				p12.add(Double.toString(dossier.getListeAssurances().get(0).getPrix()));
				p12.add("€\n");
				prixAssurance = dossier.getListeAssurances().get(0).getPrix();

			} else if (dossier.getListeAssurances().size() > 1) {
				p12 = new Phrase("Vous avez souscrit aux assurances suivantes : \n ");
				for (Assurance assurance : dossier.getListeAssurances()) {
					p12.add(assurance.getType());
					p12.add(" ");
					p12.add(Double.toString(assurance.getPrix()));
					p12.add("€\n");
					prixAssurance = assurance.getPrix() + prixAssurance;
				}
			} else {
				p12 = new Phrase("Vous n'avez souscrit à aucune assurance : \n ");
			}

			Phrase p13;
			if (dossier.getVoyage().getVoiture() == null) {
				p13 = new Phrase("Vous n'avez pas loué de voiture \n");
			} else {
				p13 = new Phrase("Vous avez loué une voiture ");
				p13.add(dossier.getVoyage().getVoiture().getCategorie() + "  au prix de : ");
				p13.add(Double.toString(dossier.getVoyage().getVoiture().getPrix()));
				p13.add(" € avec le loueur :");
				p13.add(dossier.getVoyage().getVoiture().getLoueur() +"\n\n");
			}

			PdfPTable table2 = new PdfPTable(5);
			table2.addCell("Prix Voyage Public");
			table2.addCell("Prix Voyage Remisé");
			table2.addCell("Prix Hebergement");
			table2.addCell("Prix Voiture");
			table2.addCell("Prix Assurance");

			table2.addCell(Double.toString(dossier.getVoyage().getPrixPublic()));
			table2.addCell(Double.toString(dossier.getVoyage().getPrixRemise()));
			table2.addCell(Double.toString(dossier.getVoyage().getHotel().getPrix()));
			table2.addCell(Double.toString(dossier.getVoyage().getVoiture().getPrix()));
			table2.addCell(Double.toString(prixAssurance));

			Phrase p2 = new Phrase("Total de la commande : " + dossier.getPrixTotal() + "€");

			// Ajout des elements dans le documents
			document.add(new Paragraph(c1));

			document.add(new Paragraph(p1));

			document.add(new Paragraph(p11));

			document.add(table);

			document.add(new Paragraph(p12));

			document.add(new Paragraph(p13));

			document.add(table2);

			document.add(new Paragraph(p2));

		} catch (Exception e) {
			// F
			System.out.println("Echec création pdf");
			e.printStackTrace();
		}
		// Fermeture du document
		document.close();

		return 1;
	}

	@Override
	public int envoyerMail(Dossier dossier) {
		//Récuperer le client qui a fait la resa
		int idClientResa=0;
		for (Voyageur voyageur : dossier.getListeClients()) {
			if(voyageur.isClientResa()){
				idClientResa=voyageur.getId();
			}	
		}
		String mail=clientDao.getClientById(idClientResa).getMail();
		System.out.println("##################"+mail);
		
		try {
			// Creation de la piece jointe
			EmailAttachment attachment = new EmailAttachment();
			attachment.setPath("C:/Users/inti0294/Desktop/PDFTp/reservation" + dossier.getNumDossier() + ".pdf");
			attachment.setDisposition(EmailAttachment.ATTACHMENT);

			// Creation du mail avec piece jointe
			MultiPartEmail email = new MultiPartEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			// Parametrage du compte
			//email.setAuthenticator(new DefaultAuthenticator("lacemevoyage@gmail.com", "adaming44"));
			email.setAuthenticator(new DefaultAuthenticator("manulg13@gmail.com", "wanadoo8"));
			email.setSSLOnConnect(true);
			// Adresse de l'envoyeur
			email.setFrom("manulg13@gmail.com");
			// Objet du mail
			email.setSubject("Votre voyage avec Laceme Voyage ");
			// Corps du mail
			email.setMsg("Bonjour, \n \n Merci pour votre commande, veuillez trouver ci-joint le recapitulatif \n");
			// destinataire du mail
			email.addTo(mail);

			// Ajouter la pièce jointe
			email.attach(attachment);
			// envoyer le mail
			email.send();
		} catch (EmailException em) {
			em.printStackTrace();
		}
		return 1;
	}

	
	
	public int envoyerMail2(Dossier dossier){
		
		
		return 1;
	}
}
