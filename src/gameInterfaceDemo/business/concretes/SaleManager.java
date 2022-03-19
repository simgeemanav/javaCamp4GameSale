package gameInterfaceDemo.business.concretes;

import gameInterfaceDemo.business.abstracts.SaleService;
import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Member;
import gameInterfaceDemo.entities.concretes.Offer;

public class SaleManager  implements SaleService{
	
	@Override
	public void sell(Member member, Offer offer, Game game) {
    double lastPrice = game.getPrice()-(game.getPrice()*offer.getDiscount()/100);
		
		System.out.println(member.getFirstName() + " adındaki üyeye " + game.getPrice() + " tutarındaki " + game.getName() + " oyun " + offer.getDiscount() + " indirimle " + lastPrice + " fiyatına satıldı. ");		
	}

	

}
