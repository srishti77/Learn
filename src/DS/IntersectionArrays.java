package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.google.common.primitives.Ints;

public class IntersectionArrays {

	public static void main(String s[]) {

		IntersectionArrays intersection = new IntersectionArrays();
		int array1[] = { 4, 9, 5 };
		int array2[] = { 9, 4, 9, 8, 4 };

		int array[] = intersection.findIntersection(array1, array2);
		intersection.print(array);
	}

	public void print(int array[]) {

		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public int[] findIntersection(int[] array1, int array2[]) {
		Set<Integer> list = new HashSet<Integer>();
		Arrays.sort(array1);
		Arrays.sort(array2);

		int i = 0, j = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] == array2[j]) {
				list.add(array1[i]);
				i++;
				j++;
			}

			else if (array1[i] > array2[j])
				j++;
			else
				i++;
		}
		int size = list.size();
		int[] inArray = new int[size];
		int l = 0;
		for (Integer p : list) {
			inArray[l] = p;
			l++;
		}

		return inArray;

	}
}
