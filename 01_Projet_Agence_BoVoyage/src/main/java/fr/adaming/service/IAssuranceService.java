package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Assurance;

public interface IAssuranceService {

	public List<Assurance> getAllAssurances();

	public Assurance addAssurance(Assurance a);

	public Assurance getAssuranceById(int id);

	public Assurance updateAssurance(Assurance a);

	public int deleteAssurance(int id);

}
