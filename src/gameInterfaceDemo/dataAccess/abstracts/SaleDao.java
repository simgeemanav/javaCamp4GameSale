package gameInterfaceDemo.dataAccess.abstracts;

import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Member;
import gameInterfaceDemo.entities.concretes.Offer;


public interface SaleDao {
	void sell(Member member, Game game, Offer offer);
}
