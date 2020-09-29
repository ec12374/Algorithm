import java.util.LinkedList;
import java.util.Queue;

import com.tus.InterviewAskedQuestions.ConnectNodesAtSameLevel.TreeNode;

public class CreateSumTree {

	/*
	 * Every Parent node data is sum of its child nodes data
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	class TreeNode {

		TreeNode left;
		TreeNode right;
		int data;

		TreeNode(int data) {

			this.data = data;
			left = null;
			right = null;
		}

	}

	public int createSumTree(TreeNode root) {

		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return root.data;

		int sumLeft = createSumTree(root.left);
		int sumRight = createSumTree(root.right);
		root.data = sumLeft + sumRight;
		return root.data;

	}

	public boolean isSumTree(TreeNode root) {

		if (root == null)
			return false;

		boolean isSumNode = true;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);

		int leftNode;
		int rightNode;

		while (!queue.isEmpty()) {
			leftNode = 0;
			rightNode = 0;

			TreeNode currentNode = queue.remove();

			// If no left and right child then skip the node
			if (currentNode.left == null && currentNode.right == null)
				continue;

			if (currentNode.left != null) {
				leftNode = currentNode.left.data;
				queue.add(currentNode.left);
			}

			if (currentNode.right != null) {
				rightNode = currentNode.right.data;
				queue.add(currentNode.right);
			}

			// check sum of left and right node equals or not, if any node in tree does not follwing sum node property then whole tree can't be sum tree
			if (currentNode.data != leftNode + rightNode) {
				isSumNode = false;
				break;
			}

		}

		return isSumNode;
	}

	public void printTree(TreeNode root) {

		helperPrint(root, 0, "root");

	}

	private void helperPrint(TreeNode root, int spaces, String type) {

		if (root == null)
			return;

		for (int i = 1; i <= spaces; ++i)
			System.out.print(" ");

		System.out.println(root.data + "(" + type + ")");
		helperPrint(root.left, spaces + 4, "L");
		helperPrint(root.right, spaces + 4, "R");

	}

	public static void main(String[] args) {

		CreateSumTree tree = new CreateSumTree();

		TreeNode root = tree.new TreeNode(1);

		root.left = tree.new TreeNode(2);
		root.right = tree.new TreeNode(3);

		root.left.left = tree.new TreeNode(4);
		root.left.right = tree.new TreeNode(5);

		root.right.left = tree.new TreeNode(6);
		root.right.right = tree.new TreeNode(7);

		tree.printTree(root);

		tree.createSumTree(root);

		tree.printTree(root);
		
		System.out.println("Given tree is sum tree: " + tree.isSumTree(root));

	}

}
