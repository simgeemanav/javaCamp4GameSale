package gameInterfaceDemo.dataAccess.abstracts;

import java.util.List;

import gameInterfaceDemo.entities.concretes.Offer;

public interface OfferDao {
	void add (Offer offer);
	void delete (Offer offer);
	void update (Offer offer);
	List<Offer> getAll();

}
