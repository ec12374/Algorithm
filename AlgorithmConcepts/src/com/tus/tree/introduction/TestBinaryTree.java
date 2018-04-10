package com.tus.tree.introduction;

public class TestBinaryTree {

	public static void main(String[] args) {

         BinaryTree tree = new BinaryTree();
         tree.root = new Node(1);
         tree.root.left = new Node(2);
         tree.root.right =new Node(3);
         tree.root.left.left =new Node(4);
         tree.root.left.right=new Node(5);
         tree.root.right.left =new Node(6);
         tree.root.right.right =new Node(7);
        // System.out.println("Pre-Order of tree is:");
        // tree.printPreorder();
        // System.out.println("In-Order of tree is: ");
        // tree.printInorder();
         System.out.println("Post-Order of tree is: ");
         tree.printPostorder();

	}

}
