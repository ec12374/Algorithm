package com.tus.algo.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class RootToLeafPath {

	// Find an efficient algorithm that return all root to leaf path
	public List<String> roottoleaf(TreeNode root) {
		List<String> list = new LinkedList<String>();
		auxroottoleaf(root, String.valueOf('"'), list);
		return list;
	}

	public void auxroottoleaf(TreeNode root, String path, List<String> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			list.add(path + root.value+ String.valueOf('"'));
			return;

		}

		auxroottoleaf(root.left, path + root.value + "->", list);
		auxroottoleaf(root.right, path + root.value + "->", list);
	}

	// Find an efficient algorithm that return longest length of root- leaf
	// value
	public int maxroottoleaf(TreeNode root) {
		MyInteger count = new MyInteger(Integer.MIN_VALUE);
		auxmaxroottoleaf(root, 0, count);
		return count.get();
	}

	public void auxmaxroottoleaf(TreeNode root, int node, MyInteger maximum) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			maximum.set(Math.max(node + 1, maximum.get()));
			return;

		}

		auxmaxroottoleaf(root.left, node + 1, maximum);
		auxmaxroottoleaf(root.right, node + 1, maximum);
	}

	// Find an efficient algorithm that return longest root- leaf path and print
	// it.

	public void maxroottoleaf1(TreeNode root) {
		List<String> list = new LinkedList<String>();
		MyInteger count = new MyInteger(Integer.MIN_VALUE);
		auxmaxroottoleaf1(root, 0, count, "", list);
		System.out.println(list);
	}

	public void auxmaxroottoleaf1(TreeNode root, int node, MyInteger maximum,
			String path, List<String> list) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			if (node + 1 > maximum.get()) {
				list.clear();
				list.add(path + root.value);
				maximum.set(Math.max(node + 1, maximum.get()));
			}
			return;

		}

		auxmaxroottoleaf1(root.left, node + 1, maximum, path + root.value
				+ "->", list);
		auxmaxroottoleaf1(root.right, node + 1, maximum, path + root.value
				+ "->", list);
	}

	// Find an efficient algorithm that
	/*
	 * Given a binary tree and a sum, determine if the tree has a root-to-leaf
	 * path such that adding up all the values along the path equals the given
	 * sum.
	 * 
	 * For example: Given the below binary tree and sum = 22, 5 / \ 4 8 / / \ 11
	 * 13 4 / \ \ 7 2 1 return true, as there exist a root-to-leaf path
	 * 5->4->11->2 which sum is 22.
	 */
	public boolean hasPathSum(TreeNode root, int sum) {

		return auxhaspathsum(root, 0, sum, false);
	}

	public boolean auxhaspathsum(TreeNode root, int sum, int givenSum,
			boolean isSum) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null
				&& ((sum + root.value) == givenSum)) {
			return true;
		} else {
			boolean a1 = auxhaspathsum(root.left, sum + root.value, givenSum,
					isSum);
			boolean a2 = auxhaspathsum(root.right, sum + root.value, givenSum,
					isSum);
			return a1 || a2;
		}
	}

	/*
	 * Given a binary tree, find its minimum depth.
	 * 
	 * The minimum depth is the number of nodes along the shortest path from the
	 * root node down to the nearest leaf node.
	 */
	public int minroottoleaf(TreeNode root) {
		MyInteger count = new MyInteger(Integer.MAX_VALUE);
		auxminroottoleaf(root, 0, count);
		return count.get();
	}

	public void auxminroottoleaf(TreeNode root, int node, MyInteger minimum) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			minimum.set(Math.min(node + 1, minimum.get()));
			return;

		}

		auxminroottoleaf(root.left, node + 1, minimum);
		auxminroottoleaf(root.right, node + 1, minimum);
	}
}
