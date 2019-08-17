package DS;

public class MatrixSpiral {

	public static void main(String[] args) {

		int matrix[][] = { { 1 }};
		
		//MatrixSpiral spiral = new MatrixSpiral();
		int[] array = spiralCopy(matrix);
	}

	public static int[] spiralCopy(int[][] inputMatrix) {
		// your code goes here
		int row = inputMatrix.length, col = inputMatrix[0].length, k = 0, index = 0;
		int array[];

		if (row == 0) {
			return new int[1];// 0
		}

		if (row == 1) {
			array = new int[col];

			for (int i = 0; i < col; i++) {
				array[index] = inputMatrix[0][i];
				System.out.print(inputMatrix[k][i]+" ");
				index++;
			}
			return array;
		}

		if (col == 1) {
			array = new int[row];

			for (int i = 0; i < row; i++) {
				array[index] = inputMatrix[i][0];
				System.out.print(inputMatrix[k][i]+" ");
				index++;
			}
			return array;
		}

		array = new int[row * col];

		for (k = 0; k < row / 2; k++) {

			/*
			 * // K =0 : 1, 2, 3 ,4 5 1... n-1// k = 1 : 7, 8,9.. 2... n-2
			 */
			for (int i = k; i < col - k; i++) {
				System.out.print(inputMatrix[k][i]+" ");
				array[index] = inputMatrix[k][i];
				index++;
			}

			/*
			 * // k=0: matrix[j][m-k] .. 10,15,20 //2 .. 4-1.. 3 // k = 1; matrix[2][2] ..
			 * 14 top-bot (row) = m
			 * 
			 */

			for (int j = k + 1; j < row - k; j++) {
				System.out.print(inputMatrix[j][col - k - 1]+" ");
				array[index] = inputMatrix[j][col - k - 1]; // 1,
				index++;
			}

			/*
			 * bot right- left // n= col(5) m = 4 //k =0; matrix[m-1-k][p] =
			 */

			for (int p = col - k - 2; p >= k; p--) {
				System.out.print(inputMatrix[row - k - 1][p]+" ");
				
				/*[1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]
				                 1 2 3 4 5 10 15 20 19 18 17 16 116 7 8 9 14 13 12*/
				array[index] = inputMatrix[row - k - 1][p]; // 19, 18--..
				index++;
			}

			/*
			 * bot to top
			 * 
			 * // k = 0; matrix[q][k] //k = 1; matrix[2][1] = 12
			 */
			for (int q = row - k - 2; q > k; q--) {
				System.out.print(inputMatrix[q][k]);
				array[index] = inputMatrix[q][k]; // 16., 11, 6
				index++;
			}
			System.out.println();
		}

		return array;
	}

}
