package com.tus.algo.BinarySearchTree;

public class MinAndMaxElement {

	public int minElement(BSTNode root) {
		BSTNode current = null;
		if (root == null)
			return -1;
		while (root != null) {
			current = root;
			root = root.left;

		}
		return current.value;
	}

	public int maxElement(BSTNode root) {
		BSTNode current = null;
		if (root == null)
			return -1;
		while (root != null) {
			current = root;
			root = root.right;

		}
		return current.value;
	}

}
