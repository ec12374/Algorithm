package com.tus.algo.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxValueOfRow {

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> rows = new LinkedList<Integer>();
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		int max = Integer.MIN_VALUE;
		que.add(root);
		que.add(null);
		while (!que.isEmpty()) {
			TreeNode tmp = que.remove();
			while (tmp != null) {
				max = Math.max(max, tmp.value);
				if (tmp.left != null)
					que.add(tmp.left);
				if (tmp.right != null)
					que.add(tmp.right);
				tmp = que.remove();
			}
			rows.add(max);
			if (que.isEmpty())
				break;
			if (tmp == null) {
				max = 0;
				que.add(null);
			}

		}

		return rows;
	}

}
