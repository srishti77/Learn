package recursion;

public class DavisStaircase {
	int totalSteps = 0;
	public static void main(String s[]) {
		DavisStaircase stairs = new DavisStaircase();
		System.out.print(stairs.steps(35));
	}
	
	public int steps(int remaining) {
		if(remaining == 1 || remaining == 0) {
			return 1;
		}
		else if(remaining > 0 ) {
			return steps(remaining - 1 ) + steps(remaining - 2 ) + steps(remaining - 3);
		
		}
		return 0;
	}
}
