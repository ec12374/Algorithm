public class ConnectNodesAtSameLevel {

	class TreeNode {

		TreeNode left;
		TreeNode right;
		TreeNode nextRight;
		int data;

		TreeNode(int data) {

			this.data = data;
			this.left = null;
			this.right = null;
			this.nextRight = null;
		}

	}
	
	/*
	 * Write a function to connect all the adjacent nodes at the same level in a binary tree. Structure of the given Binary Tree node
	 * is like following.
	 * 
	 * Input Tree
       A
      / \
     B   C
    / \   \
   D   E   F


Output Tree
       A--->NULL
      / \
     B-->C-->NULL
    / \   \
   D-->E-->F-->NULL
	 * 
	 * 
	 * 
	 */

	public void connectNodes(TreeNode root) {

		if(root==null)return; 
		root.nextRight = null;

		connect(root);

	}

	private void connect(TreeNode root) {

		if (root.left == null || root.right == null)
			return;

		root.left.nextRight = root.right;

		if (root.nextRight == null) {
			root.right.nextRight = null;
		} else {
			root.right.nextRight = root.nextRight.left;
		}

		connect(root.left);
		connect(root.right);

	}

	public void printTree(TreeNode root) {

		if (root == null)
			return;

		printTree(root.left);
		System.out.print(root.data);
		if(root.nextRight!=null)
		System.out.print(" --> "+root.nextRight.data);
		else System.out.print(" --> "+root.nextRight);
		System.out.println();
		printTree(root.right);

	}

	public static void main(String[] args) {

		ConnectNodesAtSameLevel connectTree = new ConnectNodesAtSameLevel();

		TreeNode root = connectTree.new TreeNode(1);

		root.left = connectTree.new TreeNode(2);
		root.right = connectTree.new TreeNode(3);

		root.left.left = connectTree.new TreeNode(4);
		root.left.right = connectTree.new TreeNode(5);

		root.right.left = connectTree.new TreeNode(6);
		root.right.right = connectTree.new TreeNode(7);

		connectTree.connectNodes(root);
		connectTree.printTree(root);
	}

}
