package DS;

public class MaxProduct {
	public static void main(String s[]) {
		MaxProduct product = new MaxProduct();
		int nums[] = {2,3,-2,4};
		System.out.println(product.maxProduct(nums));
	}
	
	 public int maxProduct(int[] nums) {
		 if(nums.length == 0)
			 return 0;
		if(nums.length == 1)
			return nums[0];	 
					 
	     int values[] = new int[nums.length+1];
	     int maxValue = nums[0];
	     values[0] = nums[0];
	     for(int i=1; i< nums.length; i++) {
	    	 values[i] = Math.max(values[i-1]*nums[i],  nums[i]);
	    	 maxValue= Math.max(maxValue, values[i]);
	     }
	     return maxValue; 
	}
}
