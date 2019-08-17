package DS;

import java.util.ArrayList;
import java.util.List;

class BT {
	int val;
	BT left;
	BT right;

	BT(int val) {
		this.val = val;
	}
}

public class PrintPathsBT {

	List<Integer> list = new ArrayList<Integer>();

	public static void main(String s[]) {
		BT root = new BT(1);
		BT node1 = new BT(8);
		BT node2 = new BT(2);

		BT node3 = new BT(3);
		BT node4 = new BT(5);

		BT node5 = new BT(4);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;

		PrintPathsBT path = new PrintPathsBT();
		path.printPaths(root);

	}

	public void printPaths(BT tree) {

		if (tree == null) {
			return;
		}
		list.add(tree.val);
		printPaths(tree.left);
		printPaths(tree.right);
		if(tree.left == null && tree.right == null)
			System.out.println(list);
		list.remove(list.size() - 1);

	}
}
