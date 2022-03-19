package gameInterfaceDemo.dataAccess.concretes;

import gameInterfaceDemo.dataAccess.abstracts.SaleDao;
import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Member;
import gameInterfaceDemo.entities.concretes.Offer;

public class HibernateSaleDao implements SaleDao{

	@Override
	public void sell(Member member, Game game, Offer offer) {
       System.out.println( " teklif adı: " + offer.getName() + " olan " + game.getId() + " id'li oyun " + member.getFirstName() + " isimli müşteri tarafından hibernate ile satın alınmıştır. " );
	}

}
