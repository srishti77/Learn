package DS;

import java.util.ArrayList;

public class BinarySearchTree {
	BinaryST head;
	int count =0;
	int ways=0;
	ArrayList<BinaryST> arrayListBST = new ArrayList<BinaryST>();
	
	public static void main(String s[]) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(12);
		tree.insert(4);
		tree.insert(6);
		tree.insert(13);
		tree.insert(11);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(tree.countUniqueBST(null, 0, arr));
		//tree.print();
		
		System.out.println("Count: "+tree.arrayListBST.size());
		
		for(BinaryST bst: tree.arrayListBST) {
			
			tree.printInorder(bst);
			System.out.println("---------");
		}
	}
	public void print() {
		printInorder(head);
	}
	public void printInorder(BinaryST head) {
		if(head!= null) {
			printInorder(head.left);
			System.out.println(head.value);
			printInorder(head.right);
		}
	}
	public BinaryST insert(int value){
		return head = insert(value, head);
	}
	
	
	private BinaryST insert(int value, BinaryST head2) {
		// TODO Auto-generated method stub
		
		
		if(head2 == null) {
			head = new 	BinaryST(value);
			return head;
		}
		
		if(value > head2.value)
			head2.right = insert(value, head2.right);
		
		else 
			head2.left = insert(value, head2.left);
		
		return head2;
	}

	class BinaryST{
		int value;
		BinaryST left;
		
		BinaryST right;
		
		BinaryST(int value){
			this.value = value;
		}
	
	}
	
	public BinaryST insert(BinaryST root, int currentValue) {
		if(currentValue != 0)
			root = insert(currentValue, root);
		return root;
	}
	
	public int countUniqueBST(BinaryST root, int currentValue, ArrayList<Integer> array) {
		
		if(array.isEmpty()) {
			arrayListBST.add(root);
			count++;
			return 1;
		}
		
		root = insert(root, currentValue);
		
		for(int i=0; i<array.size(); i++) {
			ArrayList<Integer> newArray= new ArrayList<Integer>();
			newArray.addAll(array);
			newArray.remove(i);
			ways += countUniqueBST(root, array.get(i), newArray);
			
				
		}
		
		return ways;	
	}
}
