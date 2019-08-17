package DS;

public class SolvePixida {
	
	public static void main(String s[]) {
		SolvePixida solve = new SolvePixida();
		System.out.println(solve.solution(0));
	}
	
	 public int solution(int x) {
	        // write your code in Java SE 8
	        int i = 1;
	        int maxOnes = 0;
	        int mybit = x;
	        while(mybit != 0) {
	            int currentBit = x & i;
	            if(currentBit == 0) {
	                int flipBit = x | i;
	                maxOnes = Math.max(maxOnes, getCountOfOnesAfterFlip(flipBit));
	            }
	            i = i << 1;
	            mybit = mybit >> 1;
	        }
	        return maxOnes;
	    }
	 
	
	 public int getCountOfOnesAfterFlip( int flippedNumber) {
	        int count = 0;
	        System.out.println(flippedNumber);
	        while(flippedNumber != 0){
	            flippedNumber = (flippedNumber << 1) & flippedNumber;
	            count++;
	        }
	        
	        return count;
	    }
}
