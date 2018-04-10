package com.tus.algo.BinaryTree;

public class Size {

	//TC: O(n)
	//SC: O(n)
	public int sizetree(TreeNode root) {
		MyInteger count = new MyInteger(0);

		return auxsizetree(root, count);
	}
	private int auxsizetree(TreeNode root, MyInteger count) {
		if (root == null)
			return 0;
		int leftTree = auxsizetree(root.left, count);
		int rightTree = auxsizetree(root.right, count);
		return leftTree + rightTree + 1;
	}
	//TO-DO-----. in place memory "Morris Traversal"
	//TC: O(n)
	//SC: O(1)
}
