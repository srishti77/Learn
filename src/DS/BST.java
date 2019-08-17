package DS;

public class BST {
	static Node root=null;
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public void insert(int data) {
		
		insert(data, root);
	}
	public Node insert(int data, Node root) {
		
		if(root == null) {
			root=new Node(data);
			return root;
		}
			
		
		if(root.data > data)
			root.left= insert(data, root.left);
		else if(root.data < data)
			root.right= insert(data, root.right);
		
		return root;
	}
	public void inOrder() {
		print(root);
	}
	public void print(Node root) {
		System.out.print("bdhf");
		if(root!=null) {
			System.out.print("bdhf");
			print(root.left);
			System.out.print(root.data);
			print(root.right);
		}
		
	}
	
	public static void main(String s[]) {
		BST bst= new BST();
		bst.insert(6);
		bst.insert(5);
		bst.insert(7);
		
		bst.inOrder();
	}
	
}
