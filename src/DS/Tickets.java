package DS;

import java.util.HashSet;
import java.util.Set;

public class Tickets {
	
	int[] costs;
	Integer[] memo;
	Set<Integer> dayset;
	
	public static void main(String s[]) {
		Tickets ticket = new Tickets();
		int days[] = {1,2,3};
		int costs[] = {2, 7, 15};
		System.out.println("cost: "+ticket.mincostTickets(days, costs));
	}
	
	public int mincostTickets(int days[], int costs[]) {
		this.costs =costs;
		memo = new Integer[365];
		
		dayset = new HashSet();
		
		for(int day: days) {
			dayset.add(day);
		}
		
		return dp(1);	
	}
	
	public int dp(int i) {
		System.out.println("i is: "+ i);
		if(i >=365)
			return 0;
		
		if(memo[i] != null)
			return memo[i];
		
		int ans;
		
		if(dayset.contains(i)) {
			System.out.println("i inside: "+ i);
			System.out.println();
			ans = Math.min(dp(i+1) +costs[0],  dp(i+7) + costs[1]);
			ans = Math.min(ans, dp(i+30) +costs[2]);
		}
		else {
			
			ans = dp(i+1);
			System.out.println("Here: "+ i+" "+ ans);
		}
		
		memo[i] = ans;
		return ans;
	}
}
