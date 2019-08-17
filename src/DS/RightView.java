package DS;

class Tree{
	
	int val;
	Tree left;
	Tree right;
	
	Tree(int val){
		this.val = val;
	}
}

public class RightView {
	
	public static void main(String s[]) {
		Tree root = new Tree(1);
		Tree node1 = new Tree(2);
		Tree node2 = new Tree(3);
		
		Tree node3 = new Tree(4);
		Tree node4 = new Tree(5);
		Tree node5 = new Tree(6);
		
		Tree node6 = new Tree(7);
		Tree node7 = new Tree(8);
	}
	
	public void printRightView(Tree node) {
		if(node != null) {
			System.out.println(node.val);
			if(node.right!= null) {
				printRightView(node.right);
				
			}
			else {
				printRightView(node.left);
			}
		}
	}
	
}
