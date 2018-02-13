package fr.adaming.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IAgentDao;
import fr.adaming.model.Agent;

@Service
@Transactional
public class AgentServiceImpl implements IAgentService {

	private IAgentDao agentDao;

	public void setAgentDao(IAgentDao agentDao) {
		this.agentDao = agentDao;
	}

	@Override
	public Agent getAgentByMail(String mail) {

		return agentDao.getAgentByMail(mail);
	}
}
