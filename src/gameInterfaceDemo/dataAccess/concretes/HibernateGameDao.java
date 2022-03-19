package gameInterfaceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameInterfaceDemo.dataAccess.abstracts.GameDao;
import gameInterfaceDemo.entities.concretes.Game;

public class HibernateGameDao implements GameDao{
	
	ArrayList<Game>games;
	

	public HibernateGameDao(ArrayList<Game> games) {
		this.games = games;
	}

	@Override
	public void add(Game game) {
 		System.out.println(game.getName() + " adlı oyun hibernate eklendi ");
	}

	@Override
	public void delete(Game game) {
        System.out.println(game.getName() + " adlı oyun hibernate silindi ");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adlı oyun hibernate güncellendi ");
	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
