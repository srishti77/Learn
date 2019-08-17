package DS;

public class MaxProductOfThree {
	static int max_prod = 0;
	public static void main(String s[]) {
		
		int array[] = {1,-3, 4, -2, -2, -7};
		multiply(array, 0, 0, 1);
		// MaxProduct =  getting all 3 combination of numbers
		System.out.println(max_prod);
		
	}
	
	
	public static void multiply(int array[], int start, int count, int prod) {
		
		if(count == 3) {
			max_prod = Math.max(max_prod,  prod);
			//prod = 1;
		}
		
		for(int i = start; i< array.length; i++) {
			int current_prod = prod * array[i];
			multiply(array, i+1, count+1, current_prod);
		}
	}
}
