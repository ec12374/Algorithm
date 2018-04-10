package com.tus.algo.BinarySearchTree;

import java.util.Random;

public class BinarySearchTree {
	BSTNode root;

	public BSTNode addNode(int value) {
		BSTNode current = root, parent = null;

		while (current != null) {
			parent = current;
			if (current.value > value) {
				current = current.left;
			} else if (current.value < value) {
				current = current.right;
			} else
				break;

		}
		// if(parent.value==value)return null;
		BSTNode tmp = new BSTNode(value);
		BSTNode start = tmp;
		// check that any node is present or not
		if (parent != null) {
			if (parent.value > value) {
				parent.left = tmp;
			} else if (parent.value < value) {
				parent.right = tmp;
			} else {
				tmp = null;
			}

		} else {
			root = start;
		}
		return root;
	}

	public BSTNode createBST(int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			addNode(r.nextInt(20) + 1);
		}
		return root;
	}

	public boolean search(int inputValue) {

		BSTNode current = root; // parent = null;
		if (current == null)
			return false;
		while (current != null) {
			// parent = current;
			if (current.value == inputValue)
				return true;
			if (current.value > inputValue) {

				current = current.left;

			} else {

				current = current.right;

			}

		}

		return false;
	}

	public boolean delete(BSTNode root, int data) {

		// first find the node of data
		BSTNode current = root, parent = null;
		if (current == null)
			return false;

		// find parent of child
		while (current == null && (current.left != null|| current.right != null)) {
				
			parent = current;

			if (current.value > data) {

				current = current.left;

			} else if (current.value < data) {

				current = current.right;

			}

		}
		// Neither right nor left child is present at current node
		if (current.value != data)
			return false;
		else {
			if (parent.left == current) {
				if (current.left == null && current.right == null)
					parent.left = null;

			} else if (parent.right == current) {
				if (current.left == null && current.right == null)
					parent.right = null;
			}

		}
		return true;

		// return true;

	}

	public void displayInOrder() {

		auxDisplayIn(root);

	}

	public void auxDisplayIn(BSTNode current) {
		if (current == null)
			return;
		auxDisplayIn(current.left);
		System.out.print(" " + current.value);
		auxDisplayIn(current.right);
	}

	/*
	 * public int minElement(){ BSTNode current = null; if(root==null) return
	 * -1; while(root!=null){ current=root; root = root.left;
	 * 
	 * } return current.value; }
	 */

}
