package DS;

public class AlphabetBoardPath {
	
	static char board[][] = {
			{
				'a', 'b', 'c', 'd', 'e'
			},
			{
				'f', 'g', 'h', 'i', 'j'
			},
			{
				 'k', 'l', 'm', 'n', 'o',
			},
			{
				'p', 'q', 'r', 's', 't'
			},
			{
				'u', 'v', 'w', 'x', 'y'
			},
			{
				'z', ' ' , ' ', ' ', ' '
			}
			
	};
	static int row = board.length;
	static int col = board[0].length;
	static boolean visited[][] = new boolean[row][col];
	
	
	
	public static void main(String s[]) {
		alphabetBoardPath("leet", "", 0, 0, 0 );
	}
	
	 public static  void alphabetBoardPath(String target,  String currentString, int index, int x, int y) {
		 
		 if(x >= row || x < 0 || y >= col || y < 0 || visited[x][y])
			 return;
		
		 visited[x][y] = true;
		 if(index ==  target.length()-1 && board[x][y] == target.charAt(target.length()-1)) {
			 currentString = currentString + "!";
		 }
		 
		 else if(board[x][y] == target.charAt(target.length()-1)) {
			 System.out.println("Element: "+ board[x][y]);
			 currentString += '!';
			 index++;
		 }
		 else {
			 alphabetBoardPath(target, currentString+'U', index, x-1, y);
			 alphabetBoardPath(target, currentString+'D', index, x+1, y);
			 alphabetBoardPath(target, currentString+'L', index, x, y-1);
			 alphabetBoardPath(target, currentString+'R', index, x, y+1);
		 }
		 
		 System.out.println("Current: "+currentString);
		 return;
	        
	 }
}
