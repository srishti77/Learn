package DS;

import java.util.HashSet;
import java.util.Set;

public class NumberDifference {
	Set<String> set = new HashSet<>();
	int[][] memo = new int[10][2];
	public static void main(String s[]) {
		
		
		NumberDifference num = new NumberDifference();
		
		for(int i=1; i< 10; i++) {
			num.makeNumber(i+"", 2, 1, 0);
			
		}
		
		System.out.println(num.set);
		
	}
	
	
	public int  makeNumber(String s, int N, int k, int i) {
		if(s.length() > N)
			return 0;
		
		if(s.length() == N) {
			set.add(s);
			return 0;
		}
		char end = s.charAt(s.length()-1);
		if(memo[Integer.parseInt(end+"")][i] != 0)
			return memo[Integer.parseInt(end+"")][i];
		
		if(Integer.parseInt(end+"")+ k < 10) {
			memo[Integer.parseInt(end+"")+ k][0] = makeNumber(s+(Integer.parseInt(end+"")+ k), N, k, 0);
			
		}
		
		if(Integer.parseInt(end+"")- k >=0) {
			memo[Integer.parseInt(end+"")- k][1] = makeNumber(s+(Integer.parseInt(end+"")- k), N, k, 1);
			
		}
			
		return 0;
		
	}
}
