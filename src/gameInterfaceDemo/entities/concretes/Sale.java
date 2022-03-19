package gameInterfaceDemo.entities.concretes;

import gameInterfaceDemo.entities.abstracts.BaseEntity;

public class Sale implements BaseEntity {
	
	private int id;
	private int memberId;
	private int gameId;
	private int offerId;
	
	public Sale() {
	}

	public Sale(int id, int memberId, int gameId, int offerId) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.gameId = gameId;
		this.offerId = offerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getOfferId() {
		return offerId;
	}

	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	
	
	
	
	

}
