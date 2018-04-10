package com.tus.algo.BinaryTree;

import java.util.Random;

public class BinaryTreeUtils {
	TreeNode root;

	public TreeNode createTree(int n) {
		if (n < 1)
			return null;
		else {
			TreeNode root = null;
			Random r = new Random(20);
			for (int i = 0; i < n; ++i) {
				root = createNode(root, r.nextInt(n) + 1);
			}
			return root;
		}
	}

	private TreeNode createNode(TreeNode root, int data) {
		TreeNode current = root;
		Random r = new Random();
		if (root == null) {
			return new TreeNode(data);

		}

		while (true) {
			if (r.nextInt(2) == 0) {
				if (current.left == null) {
					current.left = new TreeNode(data);
					break;
				} else {
					current = current.left;
				}
			} else {
				if (current.right == null) {
					current.right = new TreeNode(data);
					break;
				} else {
					current = current.right;
				}
			}

		}
		return root;
	}

	public void display(TreeNode root) {
		auxdisplay(root, 0, "root");
	}

	private void auxdisplay(TreeNode root, int spaces, String type) {
		if (root == null)
			return;
		for (int i = 0; i < spaces; ++i) {
			System.out.print(" ");
		}
		System.out.println(root.value + "(" + type + ")");

		auxdisplay(root.left, spaces + 2, "L");
		auxdisplay(root.right, spaces + 2, "R");
	}

	public void displayInOrderBinaryTree(TreeNode root) {
		if (root == null)
			return;
		displayInOrderBinaryTree(root.left);
		System.out.print(root.value + " ");
		displayInOrderBinaryTree(root.right);

	}

	public void displayPreOrderBinaryTree(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.value + " ");
		displayInOrderBinaryTree(root.left);
		displayInOrderBinaryTree(root.right);

	}

	public void displayPostOrderBinaryTree(TreeNode root) {
		if (root == null)
			return;
		displayInOrderBinaryTree(root.left);
		displayInOrderBinaryTree(root.right);
		System.out.print(root.value + " ");

	}

}
