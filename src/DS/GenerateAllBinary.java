package DS;

public class GenerateAllBinary {
	
	public static void main(String s[]) {
		generateAllBinary("", 4);
	}
	
	public static void generateAllBinary(String curr, int index) {
		if(index == 0) {
			if(noConsecutiveOnes(curr))
				System.out.println(curr);
			return;
		}
		
		generateAllBinary(curr+'0', index -1);
		generateAllBinary(curr+'1', index -1);
	}

	private static boolean noConsecutiveOnes(String curr) {
		
		for( int i = 0; i < curr.length() -1; i++ ) {
			if(curr.charAt(i) == '1' && curr.charAt(i+1) == '1')
				return false;
		}
		
		return true;
	}
}
