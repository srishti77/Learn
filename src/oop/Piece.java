package oop;

public abstract class Piece {
	private boolean white;
	private boolean killed;
	//private boolean 
	
	 public Piece(boolean white) 
    { 
        this.setWhite(white);
    } 
	
	public boolean isWhite() {
		return white;
	}
	public void setWhite(boolean white) {
		this.white = white;
	}
	public boolean isKilled() {
		return killed;
	}
	public void setKilled(boolean killed) {
		this.killed = killed;
	}
	
	public abstract boolean canMove(Grid grid, Spot start, Spot end) ;
}
