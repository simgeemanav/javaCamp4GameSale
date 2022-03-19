package gameInterfaceDemo.business.abstracts;

import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Member;
import gameInterfaceDemo.entities.concretes.Offer;

public interface SaleService {
	void sell (Member member, Offer offer, Game game);

}
