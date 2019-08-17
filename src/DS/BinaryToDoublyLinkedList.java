package DS;

class DoublyLink {
	int val;
	DoublyLink prev;
	DoublyLink next;

	public DoublyLink(int val) {

		this.val = val;
	}
}

public class BinaryToDoublyLinkedList {
	DoublyLink head = null, curr = null;

	public static void main(String s[]) {

		TreeNode root = new TreeNode(10);
		TreeNode node1 = new TreeNode(12);
		TreeNode node2 = new TreeNode(15);
		TreeNode node3 = new TreeNode(25);
		TreeNode node4 = new TreeNode(30);
		TreeNode node5 = new TreeNode(36);

		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		BinaryToDoublyLinkedList bin = new BinaryToDoublyLinkedList();

		bin.convertIntoDoublyLL(root);
		bin.print(bin.head);
	}

	public void print(DoublyLink node) {
		DoublyLink temp = node;

		while (temp != null) {
			System.out.println("Value: " + temp.val);
			temp =temp.next;
		}
	}

	public TreeNode convertIntoDoublyLL(TreeNode root) {

		if (root == null)
			return null;

		root.left = convertIntoDoublyLL(root.left);
		if (curr == null) {
			//System.out.println("Value:"+root.val);
			head = new DoublyLink(root.val);
			curr = head;
		} else {
			//System.out.println(root.val);
			DoublyLink temp = new DoublyLink(root.val);
			curr.next = temp;
			temp.prev = curr;
			curr = temp;
			
		}
		
		root.right = convertIntoDoublyLL(root.right);
		return root;

	}
}
