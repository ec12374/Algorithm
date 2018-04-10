package com.tus.algo.BinarySearchTree;

public class TestBST {

	public static void main(String[] args) {
		
		int n= Integer.parseInt(args[0]);
		
		BinarySearchTree bst =new BinarySearchTree();
		//BSTNode root = bst.createBST(n);
		BSTNode root = new BSTNode(10);
		 root.left = new BSTNode(7);
		 root.right = new BSTNode(15);
		 root.left.left = new BSTNode(3);
		 root.left.right = new BSTNode(8);
		 root.right.left = new BSTNode(13);
		 root.right.left.right = new BSTNode(14);
		 root.right.right = new BSTNode(18);
		//MinAndMaxElement minMax = new MinAndMaxElement();
		
		
		System.out.println("root data is: "+root.value);
		//System.out.println("Minimum element is: "+minMax.minElement(root));
		//System.out.println("Maximum element is: "+minMax.maxElement(root));
		System.out.println("=====");
		bst.auxDisplayIn(root);
		System.out.println();
		System.out.println("1-"+bst.delete(root,3));
		bst.auxDisplayIn(root);
		System.out.println();
		System.out.println("2-"+bst.delete(root,18));
		bst.auxDisplayIn(root);
		System.out.println();
		System.out.println("3-"+bst.delete(root,3));
		bst.auxDisplayIn(root);System.out.println();
		System.out.println("4-"+bst.delete(root,18));
		bst.auxDisplayIn(root);
		/*System.out.println();
		System.out.println("2-"+bst.delete(root,3));
		bst.auxDisplayIn(root);
		System.out.println();
		System.out.println("3-"+bst.delete(root,14));
		bst.auxDisplayIn(root);
		System.out.println();
		System.out.println("4-"+bst.delete(root,13));
		bst.auxDisplayIn(root);
		System.out.println();
		System.out.println("5-"+bst.delete(root,18));
		bst.auxDisplayIn(root);*/
		//System.out.println(minMax.minElement(root));
		//System.out.println(minMax.maxElement(root));
		//System.out.println(bst.minElement());
		//System.out.println(bst.search(1));
		//System.out.println(bst.search(9));
		

	}

}
