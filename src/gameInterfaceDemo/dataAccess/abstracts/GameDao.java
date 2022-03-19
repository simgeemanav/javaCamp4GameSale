package gameInterfaceDemo.dataAccess.abstracts;

import java.util.List;

import gameInterfaceDemo.entities.concretes.Game;


public interface GameDao {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	List<Game> getAll();
}
