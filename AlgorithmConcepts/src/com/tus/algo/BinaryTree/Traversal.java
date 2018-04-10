package com.tus.algo.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// important point to understand
/*List<Integer> w = new ArrayList<Integer>();
 List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();//Use Arraylist inside
 for(int i=1;i<10; i++){
 w.add(i);
 a.add(new ArrayList(w));
 }

 System.out.println(w);
 System.out.println(a);
 */

public class Traversal {

	public void depthFirst() {
	}

	// Level order traversal
	// 1- Print in one line
	public void breadthfirst1(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		que.add(root);
		while (!que.isEmpty()) {
			TreeNode tmp = que.remove();
			System.out.print(tmp.value + " ");
			if (tmp.left != null)
				que.add(tmp.left);
			if (tmp.right != null)
				que.add(tmp.right);

		}

	}

	// Level order traversal
	// 1- Print level by level
	// TC: O(n)
	// SC: O(n)
	public void breadthfirst2(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<TreeNode>();// Queue is interface
		que.add(root);
		que.add(null);

		while (!que.isEmpty()) {
			TreeNode tmp = que.remove();
			if (que.isEmpty())
				break;
			if (tmp != null) {
				System.out.print(tmp.value + " ");
				if (tmp.left != null)
					que.add(tmp.left);
				if (tmp.right != null)
					que.add(tmp.right);
			} else {
				System.out.println();
				que.add(null);
			}

		}

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<Integer> listin = new LinkedList<Integer>();
		List<List<Integer>> listmain = new LinkedList<List<Integer>>();
		Queue<TreeNode> que = new LinkedList<TreeNode>();// Queue is interface
		que.add(root);
		que.add(null);

		while (!que.isEmpty()) {
			TreeNode tmp = que.remove();
			if (que.isEmpty()) {
				listmain.add(new LinkedList<Integer>(listin));
				break;
			}
			if (tmp != null) {
				listin.add(tmp.value);
				if (tmp.left != null)
					que.add(tmp.left);
				if (tmp.right != null)
					que.add(tmp.right);
			} else {
				que.add(null);
				listmain.add(new LinkedList<Integer>(listin));
				listin.clear();
			}

		}
		return listmain;
	}
}
