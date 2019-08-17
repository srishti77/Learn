package DS;

public class PalindromPartitioning {
	public static void main(String s[]) {

		PalindromPartitioning pal = new PalindromPartitioning();
		String str = "ababbbabbabab"; 
	       System.out.println("Min cuts needed for "+ 
	                       "Palindrome Partitioning is "+ 
	                          pal.minPalindrome(str)); 
	}

	int minPalindrome(String s) {
		int n = s.length();
		
		int[][] c = new int[n][n];
		boolean[][] p = new boolean[n][n];
		
		int i, j , k,l;
		
		for( i=0; i<n; i++) {
			p[i][i] = true;
			c[i][i] = 0;
		}
		
		for(l =2; l<=n; l++) {
			for(i=0; i< n-l+1; i++) {
				j = i+l-1;
				
				if(l == 2)
					p[i][j] = (s.charAt(i) == s.charAt(j));
				else
					p[i][j] = (s.charAt(i) == s.charAt(j) && p[i+1][j-1]);
				
				if(p[i][j])
					c[i][j] =0;
				
				else {
					c[i][j] = Integer.MAX_VALUE;
					for(k=i; k<= j-1; k++) {
						c[i][j] = Integer.min(c[i][j], c[i][k]+ c[k+1][j]+1);
					}
				}
				
			}
		}
		
		return c[0][n-1];
	}
}
