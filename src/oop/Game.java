package oop;

import java.util.List;

public class Game {
	private Player[] players;
	private Grid grid;
	private Player currentTurn;
	private GameState gameState;
	private List<Move> movesPlayed;
	
	
	
	private void initialized(Player p1, Player p2) {
		players[0] = p1;
		players[1] = p1;
		
		grid.initializeGrid();
		
		if(p1.isWhiteSide()) {
			this.currentTurn = p1;
		}
		else {
			this.currentTurn = p2;
		}
	}
	
	public boolean isEnd() 
    { 
        return this.getStatus() != GameState.ACTIVE; 
    } 
	
	public GameState getStatus() 
    { 
        return this.gameState; 
    } 
	
	public void setStatus(GameState status) 
    { 
        this.gameState = status; 
    } 
	
	public boolean playerMove(Player player, int startX, int startY, int endX, int endY) {
		
		Spot start = grid.getSpot(startX, startY);
		Spot end = grid.getSpot(endX, endY);
		
		Move move = new Move(player, start, end);
		
		return this.makeMove(move, player);
		
	}

	private boolean makeMove(Move move, Player player) {
		// TODO Auto-generated method stub
		Piece piece = move.getStart().getPiece();
		
		if(piece == null)
			return false;
		
		if (player != currentTurn) { 
            return false; 
        } 
		
		if (piece.isWhite() != player.isWhiteSide()) { 
            return false; 
        } 
		
		if (!piece.canMove(grid, move.getStart(),  
                move.getEnd())) { 
			return false; 
		} 
		
		Piece destPiece = move.getStart().getPiece(); 
        if (destPiece != null) { 
            destPiece.setKilled(true); 
            move.setKilledPiece(destPiece); 
        }
        
        /*// castling? 
        if (piece != null && piece instanceof King 
            && piece.isCastlingDone()) { 
            move.setCastlingMove(true); 
        }*/
        
        movesPlayed.add(move); 
        
        move.getEnd().setPiece(move.getStart().getPiece()); 
        move.getStart().setPiece(null); 
        
        if (destPiece != null && destPiece instanceof King) { 
            if (player.isWhiteSide()) { 
                this.setStatus(GameState.WHITE_WIN); 
            } 
            else { 
                this.setStatus(GameState.BLACK_WIN); 
            } 
        }
        
     // set the current turn to the other player 
        if (this.currentTurn == players[0]) { 
            this.currentTurn = players[1]; 
        } 
        else { 
            this.currentTurn = players[0]; 
        } 
  
        return true;
        
	}
	
}
