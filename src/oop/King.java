package oop;

public class King extends Piece{
	private boolean castlingDone = false; 
	
	
	
	public boolean isCastlingDone() {
		return castlingDone;
	}

	public void setCastlingDone(boolean castlingDone) {
		this.castlingDone = castlingDone;
	}

	public King(boolean white) {
		super(white);
	}
	
	@Override
	public boolean canMove(Grid grid, Spot start, Spot end) {
		
		return false;
	}

}
