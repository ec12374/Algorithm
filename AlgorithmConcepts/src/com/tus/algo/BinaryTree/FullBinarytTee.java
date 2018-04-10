package com.tus.algo.BinaryTree;

public class FullBinarytTee {

	public boolean isfullBT(TreeNode root) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null)
			return true;
		boolean left = isfullBT(root.left);
		boolean right = isfullBT(root.right);
		return (left && right);
	}

}
