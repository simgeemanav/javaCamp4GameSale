package gameInterfaceDemo.business.concretes;

import java.util.List;

import gameInterfaceDemo.dataAccess.abstracts.GameDao;
import gameInterfaceDemo.entities.concretes.Game;

public class GameManager{
    	
    	private GameDao gameDao;

		public GameManager(GameDao gameDao) {
			this.gameDao = gameDao;
		}
		
		public void add (Game game) {
			gameDao.add(game);
		}
		public void delete(Game game) {
			gameDao.delete(game);
		}
    	
		public void update(Game game) {
			gameDao.update(game);
			
		}
		
		public List<Game>getAll(){
			return gameDao.getAll();
		}
    	
    	

	
    

	
	

}
