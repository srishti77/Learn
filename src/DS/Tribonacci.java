package DS;

public class Tribonacci {
	static int [] memo;
	public static void main(String s[]) {
		memo = new int[26];
		System.out.println(fibonacci(25));
		
	}
	
	static public int fibonacci(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else if(memo[n] != 0)
			return memo[n];
		else {
			memo[n] = fibonacci(n-3) + fibonacci(n-2) + fibonacci(n-1);
			return memo[n];
		}
			
	}
}
