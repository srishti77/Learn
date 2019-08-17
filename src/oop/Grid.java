package oop;

public class Grid {
	
	private Spot[][] spots;
	
	public Grid(){
		spots = new Spot[8][8];
	}
	
	public Spot getSpot(int x, int y) {
		
		if(x >7 || x <0 || y > 7 || y <0)
			throw new IllegalArgumentException();
		
		return spots[x][y];
	}
	
	public void initializeGrid() {
		
		//spots[0][0] = new Spot(0, 0, new Rook(true)); 
        //spots[0][1] = new Spot(0, 1, new Knight(true)); 
        //spots[0][2] = new Spot(0, 2, new Bishop(true)); 
        //... 
		//spots[1][0] = new Spot(1, 0, new Pawn(true)); 
       // spots[1][1] = new Spot(1, 1, new Pawn(true)); 
        //... 
  
        // initialize black pieces 
        //spots[7][0] = new Spot(7, 0, new Rook(false)); 
        //spots[7][1] = new Spot(7, 1, new Knight(false)); 
        //spots[7][2] = new Spot(7, 2, new Bishop(false)); 
        //... 
        //spots[6][0] = new Spot(6, 0, new Pawn(false)); 
        //spots[6][1] = new Spot(6, 1, new Pawn(false));
		
		for (int i = 2; i < 6; i++) { 
            for (int j = 0; j < 8; j++) { 
                spots[i][j] = new Spot(i, j, null); 
            } 
        } 
		
	}
	
}
