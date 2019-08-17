package DS;

public class PalindromPartitionOptimized {
	public static void main(String s[]) {

		String str = "ababbbabbababa";
		PalindromPartitionOptimized pal = new PalindromPartitionOptimized();
		System.out.println("Min cuts needed for " + 
		"Palindrome Partitioning" + " is " + pal.minPartition(str));

	}

	public int minPartition(String s) {

		int n = s.length();
		int[] c = new int[n];
		boolean[][] p = new boolean[n][n];

		int i, j, k, l;
		for (i = 0; i < n; i++) {
			p[i][i] = true;
		}

		for (l = 2; l <= n; l++) {
			for (i = 0; i < n - l + 1; i++) {
				j = i + l - 1;

				if (l == 2)
					p[i][j] = (s.charAt(i) == s.charAt(j));

				else
					p[i][j] = (s.charAt(i) == s.charAt(j) && p[i + 1][j - 1]);
			}
		}

		for (i = 0; i < n; i++) {
			if (p[0][i])
				c[i] = 0;
			else {
				c[i] = Integer.MAX_VALUE;

				for (j = 0; j < i; j++) {
					if (p[j + 1][i] == true && (1 + c[j]) < c[i]) {
						c[i] = 1 + c[j];
					}
				}
			}
		}

		return c[n - 1];

	}
}
