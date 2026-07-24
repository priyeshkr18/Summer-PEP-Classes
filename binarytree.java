class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class binarytree {

	public static void main(String[] args) {

		// Creating the tree
		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		// Printing values
		System.out.println("Root = " + root.data);
		System.out.println("Left Child = " + root.left.data);
		System.out.println("Right Child = " + root.right.data);
		System.out.println("Left Left Child = " + root.left.left.data);
		System.out.println("Left Right Child = " + root.left.right.data);
		System.out.println("Right Left Child = " + root.right.left.data);
		System.out.println("Right Right Child = " + root.right.right.data);
	}
}