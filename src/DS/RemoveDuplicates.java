package DS;

public class RemoveDuplicates {

	public static void main(String s[]) {

		int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		RemoveDuplicates dup = new RemoveDuplicates();
		
		System.out.println(dup.removeDuplicates(nums));

	}

	public int removeDuplicates(int[] nums) {

		int index = -1;
		int value = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != value) {
				index++;
				// swap element
				value = nums[i];
				nums[index] = nums[i];

			}
		}
		return index + 1;
	}
}
