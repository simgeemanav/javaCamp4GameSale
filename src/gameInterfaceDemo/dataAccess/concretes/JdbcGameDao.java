package gameInterfaceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameInterfaceDemo.dataAccess.abstracts.GameDao;
import gameInterfaceDemo.entities.concretes.Game;

public class JdbcGameDao implements GameDao {
	
	ArrayList<Game>games;
	

	public JdbcGameDao(ArrayList<Game> games) {
		this.games = games;
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adlı oyun jdbc ile eklendi ");		
	}

	@Override
	public void delete(Game game) {
        System.out.println(game.getName() + " adlı oyun jdbc ile silindi ");		
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adlı oyun jdbc ile güncellendi ");
		
	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
