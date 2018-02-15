package fr.adaming.service;

import fr.adaming.model.Dossier;

public interface IMailPdfService {

	public int creerPdf(Dossier dossier);
	
	public int envoyerMail(Dossier dossier);
	public int envoyerMail2(Dossier dossier);
}
