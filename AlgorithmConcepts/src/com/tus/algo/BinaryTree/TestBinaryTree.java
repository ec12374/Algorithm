package com.tus.algo.BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTreeUtils bt = new BinaryTreeUtils();
		int n = Integer.parseInt(args[0]);
		TreeNode root = bt.createTree(n);
		System.out.println(root.value);
		bt.display(root);

		/*
		 * TreeNode root = new TreeNode(9);
		 * 
		 * root.left = new TreeNode(7); root.right = new TreeNode(6);
		 * root.left.left = new TreeNode(5); root.left.right = new TreeNode(4);
		 * root.right.left = new TreeNode(3); root.right.right = new
		 * TreeNode(2); root.right.right.left = new TreeNode(1);
		 * root.right.right.right = new TreeNode(3);
		 * System.out.println(root.value); Size sz = new Size();
		 * System.out.println("Size of tree is: " + sz.sizetree(root));
		 */

		/*
		 * Traversal tvs = new Traversal(); tvs.breadthfirst1(root);
		 * System.out.println(); tvs.breadthfirst2(root); System.out.println();
		 * System.out.println(tvs.levelOrder(root));
		 */

		/*
		 * FullBinarytTee fbt = new FullBinarytTee();
		 * System.out.println(fbt.isfullBT(root));
		 */
		// long start = System.currentTimeMillis();
		// long end = System.currentTimeMillis();
		// System.out.println("Total time taken: " + (end - start) / 1000.0
		// + "seconds");
		RootToLeafPath path = new RootToLeafPath();
		System.out.println(path.roottoleaf(root));
		// path.roottoleaf(root);
		// System.out.println(path.maxroottoleaf(root));
		// path.maxroottoleaf1(root);
		// System.out.println(path.hasPathSum(root, 19));
		// System.out.println(path.minroottoleaf(root));

		/*
		 * Diameter dm = new Diameter();
		 * System.out.println(dm.diameterOfBinaryTree(root));
		 * 
		 * BalancedBinaryTree bbt = new BalancedBinaryTree();
		 * System.out.println(bbt.isbalanced(root));
		 * 
		 * SumRootToLeaf sum = new SumRootToLeaf();
		 * System.out.println(sum.sumNumbers(root));
		 */
		// Invert in = new Invert();
		// TreeNode Nroot = in.invertTree(root);
		bt.display(root);
		hasPathSum sum = new hasPathSum();
		System.out.println(sum.pathSum(root, 20));
		MaxValueOfRow max = new MaxValueOfRow();
		System.out.println(max.largestValues(root));

		VerticalOrder vt = new VerticalOrder();
		vt.verticalTree(root);
	}

}
