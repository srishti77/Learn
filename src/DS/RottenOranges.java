package DS;

public class RottenOranges {
	static boolean visited[][];
	int minutes = 0;

	public static void main(String s[]) {

		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		visited = new boolean[grid.length][grid[0].length];
		RottenOranges rotten = new RottenOranges();
		rotten.orangesRotting(grid);
	}

	public int orangesRotting(int[][] grid) {
		int n = grid.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 2 && !visited[i][j]) {
					
					countMinutes(grid, i, j, minutes);
				}
			}
		}
		System.out.println("Minutes:"+ minutes);
		return minutes;
	}

	private int countMinutes(int[][] grid, int i, int j, int min) {
		// TODO Auto-generated method stub

		if (i < 0 || j < 0 || i >= grid.length || j >= grid.length 
				 ||grid[i][j] == 0 || visited[i][j]) {
			return 0;
		}
			
		visited[i][j] = true;
		grid[i][j] = 2;
		minutes++;
		countMinutes(grid, i+1, j, min+1 );
		countMinutes(grid, i-1, j,  min+1 );
		countMinutes(grid, i, j-1,  min+1 );
		countMinutes(grid, i, j+1, min+1);
		
		return min;
	}
}
