package fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.IPhotoDao;
import fr.adaming.model.Photo;
import fr.adaming.model.Voyage;

@Service
public class PhotoServiceImpl implements IPhotoService {

	@Autowired
	private IPhotoDao photoDao;
	
	public void setPhotoDao(IPhotoDao photoDao) {
		this.photoDao = photoDao;
	}

	@Override
	public Photo addPhoto(Photo p, Voyage v) {
		p.setVoyage(v);
		return photoDao.addPhoto(p);
	}

	@Override
	public Photo updatePhoto(Photo p, Voyage v) {
		p.setVoyage(v);
		return photoDao.updatePhoto(p);
	}

	@Override
	public int deletePhoto(Voyage v) {
		return photoDao.deletePhoto(v.getId());
	}

}
