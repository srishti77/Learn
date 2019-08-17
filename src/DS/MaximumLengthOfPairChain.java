package DS;

import java.util.Arrays;

public class MaximumLengthOfPairChain {

	public static void main(String s[]) {

		int pairs[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		MaximumLengthOfPairChain chain = new MaximumLengthOfPairChain();
		System.out.println(chain.findLongestChain(pairs));

	}

	public int findLongestChain(int[][] pairs) {

		Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
		int N = pairs.length;
		int dp[] = new int[N];

		Arrays.fill(dp, 1);

		for (int j = 1; j < N; j++) {
			for (int i = 0; i < j; i++) {
				if (pairs[i][1] < pairs[j][0])
					dp[j] = Math.max(dp[j], dp[i] + 1);
			}
		}
		
		int ans = 0;
		for (int x : dp) {
			if (ans < x)
				ans = x;
		}

		return ans;
	}
}
