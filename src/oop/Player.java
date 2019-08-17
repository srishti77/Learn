package oop;

public class Player {
	private boolean whiteSide;

	public Player(boolean whiteSide) {
		this.whiteSide = whiteSide;
	}
	public boolean isWhiteSide() {
		return whiteSide;
	}

	public void setWhiteSide(boolean isWhiteSide) {
		this.whiteSide = isWhiteSide;
	}
	
}
