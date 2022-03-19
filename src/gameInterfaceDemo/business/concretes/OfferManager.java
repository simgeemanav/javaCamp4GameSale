package gameInterfaceDemo.business.concretes;

import java.util.List;
import gameInterfaceDemo.dataAccess.abstracts.OfferDao;
import gameInterfaceDemo.entities.concretes.Offer;

public class OfferManager {
	

	private OfferDao offerDao;

	public OfferManager(OfferDao offerDao) {
		this.offerDao = offerDao;
	}
	
	public void add (Offer offer) {
		offerDao.add(offer);
	}
	public void delete(Offer offer) {
		offerDao.delete(offer);
	}
	
	public void update(Offer offer) {
		offerDao.update(offer);
		
	}
	
	public List<Offer>getAll(){
		return offerDao.getAll();
	}

}
