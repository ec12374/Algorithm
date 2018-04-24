package com.tus.BinaryTreeRevision;

import java.util.Stack;

public class TraversalWithoutRecursion {

	public void iterativeInOrderApproach(TreeNode root) {

		Stack<TreeNode> stck = new Stack<TreeNode>();
		TreeNode current = root;
		while (true) {

			if (current != null) {
				stck.push(current);
				current = current.left;
			} else {
				if (!stck.isEmpty()) {
					TreeNode temp = stck.pop();
					System.out.print(temp.value + " ");
					current = temp.right;

				} else
					break;

			}
		}

	}

	public void iterativePreOrderApproach(TreeNode root) {

		Stack<TreeNode> stck = new Stack<TreeNode>();
		TreeNode current = root;
		while (true) {

			if (current != null) {
				System.out.print(current.value + " ");
				stck.push(current);
				current = current.left;
			} else {
				if (!stck.isEmpty()) {
					TreeNode temp = stck.pop();
					current = temp.right;
				} else
					break;

			}
		}
	}

	public void iterativePostOrderApproach(TreeNode root) {

		Stack<TreeNode> stck = new Stack<TreeNode>();
		TreeNode current = root;
		while (true) {

			if (current != null) {
				stck.push(current);
				current = current.left;
			} else {
				if (!stck.isEmpty()) {
					TreeNode temp = stck.peek().right;
					if (temp == null) {
						temp = stck.pop();
						System.out.print(temp.value + " ");
						// whether it's right child has already checked so we
						// have to print it
						while (!stck.isEmpty() && temp == stck.peek().right) {
							temp = stck.pop();
							System.out.print(temp.value + " ");
						}
					} else {
						current = temp;
					}
				} else
					break;
			}
		}

	}

	public static void main(String[] args) {

		BinaryTreeUtils brt = new BinaryTreeUtils();
		TreeNode root = brt.createTree(50);
		brt.display(root);

		TraversalWithoutRecursion twrs = new TraversalWithoutRecursion();
		twrs.iterativeInOrderApproach(root);
		System.out.println();
		brt.displayInOrderBinaryTree(root);
		System.out.println();
		twrs.iterativePreOrderApproach(root);
		System.out.println();
		twrs.iterativePostOrderApproach(root);

	}

}
