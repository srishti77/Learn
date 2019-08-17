package oop;

public class Spot {
	private int x;
	private int y;
	private Piece piece;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	Spot(int x, int y, Piece p){
		this.x = x;
		this.y = y;
		this.piece = piece;
		
	}
}
