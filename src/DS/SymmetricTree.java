package DS;

class TreeNode {
	int val;

	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class SymmetricTree {
	
	public static void main(String s[]) {
		TreeNode root = new TreeNode(1);
		
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		SymmetricTree tree = new SymmetricTree();
		
		System.out.println(tree.printElement(root, root));
	}

	public boolean printElement(TreeNode root1, TreeNode root2) {
		
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null)
			return false;
		
		System.out.println(root1.val + " "+ root2.val);
		return (root1.val == root2.val) && printElement(root1.right, root2.left) && printElement(root1.left, root2.right);
		
	}
}
