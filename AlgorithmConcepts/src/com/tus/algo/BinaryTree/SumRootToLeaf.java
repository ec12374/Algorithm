package com.tus.algo.BinaryTree;

/*
 * LeetCode --129
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.


 */
public class SumRootToLeaf {
	public int sumNumbers(TreeNode root) {
		int[] sum = { 0 };
		auxRLSum(root, "", sum);
		return sum[0];
	}

	private void auxRLSum(TreeNode root, String path, int[] sum) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			sum[0] = sum[0] + Integer.parseInt(path + root.value);
			return;
		}
		auxRLSum(root.left, path + root.value, sum);
		auxRLSum(root.right, path + root.value, sum);
	}
}
