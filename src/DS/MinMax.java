package DS;

public class MinMax {
	
	public static void main(String s[]) {
		int scores[] = {3, 5, 2, 9, 12, 5, 23, 23}; 
	    int n = scores.length; 
	    MinMax min = new MinMax();
	    int h = log2(n); 
	    int res = min.minMax(0, 0, true, scores, h); 
	    System.out.println( "The optimal value is : "  +res);  
	          
	}
	 static int log2(int n) 
	 { 
	 return (n==1)? 0 : 1 + log2(n/2); 
	 } 
	
	public int minMax(int depth, int nodeIndex, boolean isMax, int scores[], int h) {
		if(depth == h)
			return scores[nodeIndex];
		
		if(isMax)
			return Math.max(minMax(depth+1, nodeIndex*2, false, scores, h), minMax(depth+1, nodeIndex*2 +1, false, scores, h));
		
		else
			return Math.min(minMax(depth+1, nodeIndex*2, false, scores, h), minMax(depth+1, nodeIndex*2 +1, false, scores, h));
		
	}
}
