package com.tus.algo.TreeProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.tus.algo.tree.BinaryTreeUtils;
import com.tus.algo.tree.TreeNode;

public class TreeSize {

	// TC= O(n)
	// SC =O(n)
	public static int treeSize1(TreeNode root) {

		if (root == null)
			return 0;
		int left = treeSize1(root.left);
		int right = treeSize1(root.right);

		return left + right + 1;
	}

	// TC= O(n)
	// SC =O(n)
	public static int treeSize2(TreeNode root) {
		int size = 0;
		Stack<TreeNode> st = new Stack<TreeNode>();

		while (true) {
			while (root != null) {
				++size;
				st.push(root);
				root = root.left;
			}
			if (st.isEmpty())
				break;
			root = st.pop().right;
		}
		return size;
	}

	// TC= O(n)
	// SC =O(n)
	public static int treeSize3(TreeNode root) {

		Queue<TreeNode> que = new LinkedList<TreeNode>();
		int size = 0;
		if (root == null)
			return 0;
		que.add(root);
		while (true) {
			if (que.isEmpty())
				break;
			TreeNode current = que.remove();
			++size;
			if (current.left != null)
				que.add(current.left);
			if (current.right != null)
				que.add(current.right);

		}

		return size;
	}

	// TC= O(n)
	// SC =O(1)

	public static int treeSize4(TreeNode root) {
		// In-order predecessor traversal and counting the size
		int size = 0;
		if (root == null)
			return 0;
		TreeNode current = root;
		while (current != null) {
			// no left tree
			if (current.left == null) {
				current = current.right;
				++size;
			} else {
				TreeNode preDecessor = current.left;
				while (preDecessor.right != null
						&& preDecessor.right != current)
					preDecessor = preDecessor.right;

				if (preDecessor.right == null) {
					preDecessor.right = current;
					current = current.left;
				} else {// link is already made, we are visiting second time.
						// Hence, remove the link
					preDecessor.right = null;
					++size;
					current = current.right;
				}
			}
		}

		return size;
	}

	public static void main(String args[]) {

		/*
		 * TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
		 * root.right= new TreeNode(3); root.left.left=new TreeNode(4);
		 * root.left.right=new TreeNode(5); root.right.left=new TreeNode(6);
		 * root.right.right=new TreeNode(7);
		 */
		// int n= Integer.parseInt(args[0]);
		TreeNode root = BinaryTreeUtils.createTree2(9);

		BinaryTreeUtils.display1(root);
		int size = treeSize4(root);
		System.out.println("Size of tree is: " + size);
		// BinaryTreeUtils.display1(root);

	}
}
