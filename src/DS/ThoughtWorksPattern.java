package DS;

public class ThoughtWorksPattern {
	
	public static void main(String s[]) {
		int arr[][] = new int[7][7];
		int n = 7;
		for(int k = 0; k < 4; k++) {
			for(int i = k; i < n-k; i++) {
				arr[k][i] =  4-k;
				arr[i][k] =  4-k;
				arr[n-k-1][i] =  4-k;
				arr[i][n-k-1] =  4-k;
			}
		}
		
		
		for(int i=0; i< 7; i++) {
			for(int j = 0; j< 7; j++) {
				System.out.print(arr[i][j]);	
			}
			System.out.println();
		}
	}
}
