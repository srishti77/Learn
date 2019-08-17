package DS;

/*
 * Given an array A[] consisting 0s, 1s and 2s. 
 * The task is to write a function that sorts the given array. 
 * The functions should put all 0s first, then all 1s and all 2s in last.
 */
public class SortColors {
	int array[] = {0, 1, 2, 0, 1, 2};
	public static void main(String s[]) {
		SortColors sort = new SortColors();
		sort.sortArray();
		
		sort.print();
	}
	
	private void print() {
		for(int i: array) {
			System.out.println(i);
		}
		
	}

	public void sortArray() {
		int low = 0;
		int mid = 0, temp;
		int high = array.length - 1;
		
		while(mid <= high) {
			
			switch(array[mid]) {
			case 0:
				temp = array[low];
				array[low] = array[mid];
				array[mid] = temp;
				low ++;
				mid ++;
				break;
				
			case 1:
				mid++;
				break;
			case 2:
				temp = array[high];
				array[high] = array[mid];
				array[mid] = temp;
				high --;
				break;
			}
		}
		
	}
}
