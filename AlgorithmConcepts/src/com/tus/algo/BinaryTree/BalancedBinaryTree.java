package com.tus.algo.BinaryTree;

public class BalancedBinaryTree {

	public boolean isbalanced(TreeNode root) {
		if (auxheight(root) <= 1)
			return true;
		return false;
	}

	public int auxheight(TreeNode root) {
		if (root == null)
			return 0;
		int left = auxheight(root.left);
		int right = auxheight(root.right);
		System.out.print(left+" ");
        System.out.println(right+" ");
 return Math.abs(left - right) + 1;
	}

}
