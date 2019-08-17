package oop;

public class Move {
	private Player player;
	private Spot start;
	private Spot end;
	private Piece killedPiece;
	public Piece getKilledPiece() {
		return killedPiece;
	}

	public void setKilledPiece(Piece killedPiece) {
		this.killedPiece = killedPiece;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Spot getStart() {
		return start;
	}

	public void setStart(Spot start) {
		this.start = start;
	}

	public Spot getEnd() {
		return end;
	}

	public void setEnd(Spot end) {
		this.end = end;
	}

	public Piece getPieceMoved() {
		return pieceMoved;
	}

	public void setPieceMoved(Piece pieceMoved) {
		this.pieceMoved = pieceMoved;
	}

	private Piece pieceMoved;
	//private Piece pieceKilled;
	private boolean castlingMove = false;
	
	public Move(Player player, Spot start, Spot end) {
		super();
		this.player = player;
		this.start = start;
		this.end = end;
		pieceMoved = start.getPiece();
	}

	public boolean isCastlingMove() {
		return castlingMove;
	}

	public void setCastlingMove(boolean castlingMove) {
		this.castlingMove = castlingMove;
	}
	
	
			
			
			
}
