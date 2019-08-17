package DS;

public class ImageSmoother {
	
	public static void main(String s[]) {
		
		int matrix[][] = {
				{1,1,1},
				{1,0,1},
				{1,1,1}};
		
		ImageSmoother smooth = new ImageSmoother();
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j< matrix[0].length; j++) {
				System.out.println(smooth.calculateAverage(i, j, matrix));
			}
		}
	}
	
	public int calculateAverage(int i, int j, int[][] matrix) {
		int count =1;
		int sum = matrix[i][j];
		int col1 = matrix[0].length, row1 = matrix.length;
		
		if( i-1 >=0 ) {
			sum += matrix[i-1][j];
			count++;
			if(j-1 >=0) {
				sum += matrix[i-1][j-1];
				count++;
			}
			if(j+1 < col1) {
				sum += matrix[i-1][j+1];
				count++;
			}
		}
		
		if(j-1 >=0) {
			sum += matrix[i][j-1];
			count++;
		}
		
		if(j+1 < col1) {
			sum += matrix[i][j+1];
			count++;
		}
		
		if( i+1 < row1 ) {
			sum += matrix[i+1][j];
			count++;
			if(j-1 >=0) {
				sum += matrix[i+1][j-1];
				count++;
			}
			if(j+1 <col1) {
				sum += matrix[i+1][j+1];
				count++;
			}
		}
		
		
		return (int) Math.floor(sum/count);
		
	}
}
