package com.tus.algo.TreeProblems;

import com.tus.algo.tree.BinaryTreeUtils;
import com.tus.algo.tree.MyInteger;
import com.tus.algo.tree.TreeNode;

public class DepthofaTree {

	public static int longestRootToLeafPath1(TreeNode root) {
		MyInteger depth = new MyInteger(Integer.MIN_VALUE);

		if (root == null)
			return 0;
		else {
			findRootToLeafPath(root, 0, depth);
			return depth.get();
		}
	}

	private static void findRootToLeafPath(TreeNode root, int n, MyInteger depth) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			depth.set(Math.max(depth.get(), n + 1));
			return;
		}

		findRootToLeafPath(root.left, n + 1, depth);
		findRootToLeafPath(root.right, n + 1, depth);

	}

	public static int longestRootToLeafPath2(TreeNode root) {

		if (root == null)
			return 0;
		else {
			int lst = longestRootToLeafPath2(root.left);
			int rst = longestRootToLeafPath2(root.right);

			return Math.max(lst, rst) + 1;
		}

	}

	// TO-DO using queue DS

	public static void main(String[] args) {
		// int n = Integer.parseInt(args[0]);
		TreeNode root = BinaryTreeUtils.createTree2(1);
		BinaryTreeUtils.display1(root);
		int depth = longestRootToLeafPath1(root);
		System.out.println(depth);

	}

}
