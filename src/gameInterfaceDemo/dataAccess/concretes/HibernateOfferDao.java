package gameInterfaceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameInterfaceDemo.dataAccess.abstracts.OfferDao;
import gameInterfaceDemo.entities.concretes.Offer;

public class HibernateOfferDao implements OfferDao {
	ArrayList<Offer>offers;
	

	public HibernateOfferDao(ArrayList<Offer> offers) {
		this.offers = offers;
	}

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getName() + " adlı teklif hibernate ile eklendi ");
	}

	@Override
	public void delete(Offer offer) {
       System.out.println(offer.getName() + " adlı teklif hibernate ile silindi ");		
	}

	@Override
	public void update(Offer offer) {
        System.out.println(offer.getName() + " adlı teklif hibernate ile güncellendi ");		
	}

	@Override
	public List<Offer> getAll() {
		return offers;
	}

}
