package DS;

import java.util.ArrayList;

public class MoveZeros {

	public static void main(String s[]) {

		MoveZeros moveZeros = new MoveZeros();

		int array[] = { 0, 1, 0, 3, 12 };
		array = moveZeros.shiftArray(array);
		moveZeros.print(array);
	}

	public void print(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public int[] shiftArray(int array[]) {
		int j = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0 && j == -1) {
				j = i;
			} else if (array[i] != 0 && j != -1) {
				array[j] = array[i];
				array[i] = 0;
				j++;
			}
		}
		return array;

	}

}
