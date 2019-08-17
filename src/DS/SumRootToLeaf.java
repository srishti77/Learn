package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumRootToLeaf {
	Set<Integer> list = new HashSet<Integer>();

	public static void main(String s[]) {

		SumRootToLeaf root = new SumRootToLeaf();
		int array[] = {4, 9, 0, 5, 1};
		root.findNumbers(array, 0, "");
		
		root.findSum(root.list);

	}

	public void findSum(Set<Integer> list) {
		int sum = 0;
		for(int i: list)
			sum += i;
		System.out.println("Sum: " + sum);
	}

	public void findNumbers(int array[], int index, String s) {

		if (index >= array.length) {
			if (!s.isEmpty())
				list.add(Integer.parseInt(s));
			return;
		}

		s = s + array[index];

		findNumbers(array, 2 * index + 1, s);

		findNumbers(array, 2 * index + 2, s);

	}

}
