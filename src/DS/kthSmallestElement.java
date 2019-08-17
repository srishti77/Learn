package DS;

public class kthSmallestElement {

	public static void main(String s[]) {

		int matrix[][] = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		int k = 8;
		kthSmallestElement kSmall  = new kthSmallestElement();
		System.out.println("Element"+ kSmall.kthSmallest(matrix, k));
	}

	public int kthSmallest(int[][] matrix, int k) {

		
		int i=0, p=0, q=0, j=0;
		int ans =0;
		int r = matrix.length;
		if(r == 0)
			return 0;
		int c = matrix[0].length;
		
		while( i < c && q <r  && k >=0) {
			if(matrix[p][i]  < matrix[q][j] ) {
				ans = matrix[p][i];
				i++;
			}
			else {
				 ans =matrix[q][j];
				q++;
			}
			
			if(i == c) {
				p++;
				i= p;
				
			}
			if(q ==r) {
				j++;
				q=j;
			}
			k--;
		}
		
		return ans;
		
	}
}
