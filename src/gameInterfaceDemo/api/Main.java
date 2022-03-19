package gameInterfaceDemo.api;

import gameInterfaceDemo.adapter.MernisDaoAdapter;
import gameInterfaceDemo.business.concretes.GameManager;
import gameInterfaceDemo.business.concretes.MemberManager;
import gameInterfaceDemo.business.concretes.OfferManager;
import gameInterfaceDemo.business.concretes.SaleManager;
import gameInterfaceDemo.dataAccess.concretes.HibernateGameDao;
import gameInterfaceDemo.dataAccess.concretes.HibernateOfferDao;
import gameInterfaceDemo.entities.concretes.Game;
import gameInterfaceDemo.entities.concretes.Member;
import gameInterfaceDemo.entities.concretes.Offer;

public class Main {

	public static void main(String[] args) {
		
		Member member=new Member(1,"Simge","Manav","12345678912",1995);
		MemberManager memberManager=new MemberManager(new MernisDaoAdapter());
		memberManager.add(member);
		
		Offer offer=new Offer (1,"birthday",10);
		OfferManager offerManager=new OfferManager(new HibernateOfferDao(null));
		offerManager.add(offer);
		
		Game game=new Game(1,"Age of Empires",50);
		GameManager gameManager=new GameManager(new HibernateGameDao(null));
		gameManager.add(game);
		
		SaleManager saleManager= new SaleManager();
		saleManager.sell(member,offer,game);

		
	}

}
