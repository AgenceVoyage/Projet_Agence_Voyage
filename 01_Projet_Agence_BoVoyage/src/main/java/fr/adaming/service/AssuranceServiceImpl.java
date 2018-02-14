package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IAssuranceDao;
import fr.adaming.model.Assurance;

@Service
@Transactional
public class AssuranceServiceImpl implements IAssuranceService {

	@Autowired
	IAssuranceDao assuDao;

	public void setAssuDao(IAssuranceDao assuDao) {
		this.assuDao = assuDao;
	}

	@Override
	public List<Assurance> getAllAssurances() {
		return assuDao.getAllAssurances();
	}

	@Override
	public Assurance addAssurance(Assurance a) {
		return assuDao.addAssurance(a);
	}

	@Override
	public Assurance getAssuranceById(int id) {
		return assuDao.getAssuranceById(id);
	}

	@Override
	public Assurance updateAssurance(Assurance a) {
		return assuDao.updateAssurance(a);
	}

	@Override
	public int deleteAssurance(int id) {
		return assuDao.deleteAssurance(id);
	}

}
