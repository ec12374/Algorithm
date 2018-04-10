package com.tus.tree.introduction;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	// Wrappers over below recursive functions
	public void printPostorder() {
		printPostOrder(root);
	}

	public void printInorder() {
		printInOrder(root);
	}

	public void printPreorder() {
		printPreOrder(root);
	}

	public void printInOrder(Node root) {
		Node current = root;
		if (current == null)
			return;
		printInOrder(current.left);
		System.out.print(current.data+" ");
		printInOrder(current.right);

	}

	public void printPreOrder(Node root) {
		Node current = root;
		if (current == null)
			return;
		System.out.print(current.data+" ");
		printPreOrder(current.left);
		printPreOrder(current.right);
	}

	public void printPostOrder(Node root) {
		Node current = root;
		if (current == null)
			return;
		printPostOrder(current.left);
		printPostOrder(current.right);
		System.out.print(current.data+" ");
		
	}
}
