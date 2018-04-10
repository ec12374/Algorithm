package com.tus.algo.BinaryTree;

/*
 * 226. Invert Binary Tree
 * Invert a binary tree.

      4
    /   \
   2     7
  / \   / \
 1   3 6   9
 to
      4
    /   \
   7     2
  / \   / \
 9   6 3   1
 */
public class Invert {

	public TreeNode invertTree(TreeNode root) {
      if(root==null)return null;
		TreeNode leftN = invertTree(root.left);
		TreeNode rightN = invertTree(root.right);
		//swap(root, leftN, rightN);
		TreeNode temp = leftN;
		root.left = rightN;
		root.right = temp;
		return root;

	}

	/*private void swap(TreeNode root, TreeNode leftN, TreeNode rightN) {
		TreeNode temp = leftN;
		root.left = rightN;
		root.right = temp;
	}*/
}
