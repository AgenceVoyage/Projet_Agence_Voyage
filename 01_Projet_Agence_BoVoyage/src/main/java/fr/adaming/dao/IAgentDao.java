package fr.adaming.dao;

import fr.adaming.model.Agent;

/**
 * Interface recensant les methodes liées à un Agent. Ces methodes effectuent
 * des traitements metiers.
 * 
 * @author intiformation
 *
 */
public interface IAgentDao {

	/**
	 * Methode permettant de recuperer un agent via son mail.
	 * 
	 * @param mail
	 * @return Agent
	 */
	public Agent getAgentByMail(String mail);

}
