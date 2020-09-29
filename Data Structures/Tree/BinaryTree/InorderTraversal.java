import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

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

	public List<Integer> inorderTraversalRecursion(TreeNode root) {

		List<Integer> list = new ArrayList<>();
		helperInorder(root, list);

		return list;
	}

	private void helperInorder(TreeNode root, List<Integer> list) {

		if (root == null)
			return;
		helperInorder(root.left, list);
		list.add(root.data);
		helperInorder(root.right, list);
	}

	public List<Integer> inorderTraversalIterative(TreeNode root) {

		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;

		while (current != null || stack.size() > 0) {

			while (current != null) {

				stack.push(current);
				current = current.left;

			}

			current = stack.pop();

			list.add(current.data);

			current = current.right;

		}

		return list;
	}

	public static void main(String[] args) {

		InorderTraversal inorder = new InorderTraversal();

		TreeNode root = inorder.new TreeNode(1);

		root.left = inorder.new TreeNode(2);
		root.right = inorder.new TreeNode(3);

		root.left.left = inorder.new TreeNode(4);
		root.left.right = inorder.new TreeNode(5);

		root.right.left = inorder.new TreeNode(6);
		root.right.right = inorder.new TreeNode(7);

		List<Integer> resultRecursion = inorder.inorderTraversalRecursion(root);
		List<Integer> resultIterative = inorder.inorderTraversalIterative(root);

		System.out.println(resultRecursion);
		System.out.println(resultIterative);

	}

}
