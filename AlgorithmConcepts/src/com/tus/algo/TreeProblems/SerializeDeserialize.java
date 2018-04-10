package com.tus.algo.TreeProblems;

import java.util.LinkedList;
import java.util.List;

import com.tus.algo.tree.TreeNode;

public class SerializeDeserialize {

	public static void preOrder(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		list.add(root.data);
		preOrder(root.left, list);
		preOrder(root.right, list);
	}

	public static void inOrder(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		inOrder(root.left, list);
		list.add(root.data);
		inOrder(root.right, list);
	}

	public static void serialize(TreeNode root, int[] pre, int[] in) {
		List<Integer> list = new LinkedList<Integer>();
		preOrder(root, list);
		for (int i = 0; i < list.size(); i++) {
			pre[i] = list.get(i);
		}
		list.clear();
		inOrder(root, list);
		for (int i = 0; i < list.size(); i++) {
			pre[i] = list.get(i);
		}
	}

	public static TreeNode deSerialize(int[] pre, int[] in) {

		if (pre.length != in.length)
			return null;
		return helper(pre, in, 0, 0, pre.length - 1);
	}

	public static TreeNode helper(int[] pre, int[] in, int pre_start,
			int in_start, int in_end) {

		TreeNode root = new TreeNode(pre[pre_start]);
		if (in_start == in_end)
			return root;

		while (in_start < in_end) {
			if (root.data == in[in_start])
				break;
			++in_start;
		}
		root.left = helper(pre, in, pre_start + 1, 0, in_start - 1);
		root.right = helper(pre, in, pre_start + 1, in_start + 1, in_end);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
