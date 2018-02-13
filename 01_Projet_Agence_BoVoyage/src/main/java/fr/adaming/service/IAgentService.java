package fr.adaming.service;

import fr.adaming.model.Agent;

/**
 * Interface recensant les methodes liées à un Agent. Ces methodes effectuent
 * des traitements metiers.
 * @author intiformation
 *
 */
public interface IAgentService {
	
	/**
	 * Methode permettant de recuperer un agent via son mail.
	 * 
	 * @param mail
	 * @return
	 */
	public Agent getAgentByMail(String mail);
}
