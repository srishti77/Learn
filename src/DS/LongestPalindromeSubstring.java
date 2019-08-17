package DS;

public class LongestPalindromeSubstring {
	public static void main(String s[]) {
		
		String str = "abbbcdcbbbp";
		LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
		System.out.println(lps.getLongestPalindrome(str));
		
		
	}
	
	public String getLongestPalindrome(String s) {
		int len = s.length();
		boolean dp[][] = new boolean[len][len];
		
		for(int i=0; i<len; i++) {
			for(int j =0; j<i; j++) {
				dp[i][j] = true;
			}
		}
		
		int maxStart =0;
		int maxEnd =0;
		int maxLength =0;
		
		for(int i= len-1; i>=0; i--) {
			dp[i][i] = true;
			
			for(int j=i+1; j<len; j++) {
				if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
					dp[i][j] = true;
					if(maxLength < (j-i)) {
						maxLength = j-i;
						maxStart = i;
						maxEnd = j;
					}
				}
			}
		}
		return s.substring(maxStart, maxEnd+1);
	}
}
