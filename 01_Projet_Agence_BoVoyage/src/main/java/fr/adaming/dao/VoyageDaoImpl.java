package fr.adaming.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Voyage;

@Repository
public class VoyageDaoImpl implements IVoyageDao {

	@Override
	public Voyage getVoyageById(int idVoyage) {
		return null;
	}

	@Override
	public List<Voyage> getAllVoyages() {
		return null;
	}

	@Override
	public Voyage addVoyage(Voyage voy) {
		return null;
	}

	@Override
	public Voyage updateVoyage(Voyage voy) {
		return null;
	}

	@Override
	public int deleteVoyage(int idVoyage) {
		return 0;
	}

}
