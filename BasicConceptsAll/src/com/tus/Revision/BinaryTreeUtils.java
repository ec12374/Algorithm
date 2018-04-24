package com.tus.Revision;

import java.util.Random;

public class BinaryTreeUtils {

	public TreeNode createTree(int n) {
		TreeNode head = null;
		for (int i = 0; i < n; ++i) {

			head = createNode(head, i + 2);
		}
		return head;
	}

	public TreeNode createNode(TreeNode head, int value) {
		if (head == null)
			return new TreeNode(value);
		else {
			Random r = new Random();
			TreeNode current = head;

			while (true) {
				if (r.nextInt(2) == 0) {
					if (current.left == null){
						current.left = new TreeNode(value);
					break;
					}
					else current=current.left;

				} else {
					if (current.right == null){
						current.right = new TreeNode(value);
						break;
					}
					else current=current.right;
				}

			}

		}

		return head;
	}
}
