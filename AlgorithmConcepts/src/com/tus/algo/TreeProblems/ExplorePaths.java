package com.tus.algo.TreeProblems;

import java.util.LinkedList;
import java.util.List;

import com.tus.algo.tree.BinaryTreeUtils;
import com.tus.algo.tree.TreeNode;

public class ExplorePaths {

	public static List<String> explorePaths(TreeNode root) {
		List<String> rlPath = new LinkedList<String>();
		addLeafNode(root, "", rlPath);

		return rlPath;
	}

	private static void addLeafNode(TreeNode root, String space,
			List<String> rlPath) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			rlPath.add(space + root.data);
			return;

		}

		addLeafNode(root.left, space + root.data + "->", rlPath);
		addLeafNode(root.right, space + root.data + "->", rlPath);

	}
	//TO-DO using queue and linked-list

	public static void main(String[] args) {

		int n= Integer.parseInt(args[0]);
       TreeNode root = BinaryTreeUtils.createTree2(n);
      BinaryTreeUtils.display1(root);
       System.out.println(explorePaths(root));

	}

}
