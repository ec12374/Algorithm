package com.tus.algo.BinaryTree;


import java.util.LinkedList;
import java.util.List;

public class hasPathSum {

	// LeetCode
	//112- Path Sum   
	
	public boolean hasPathSum1(TreeNode root, int sum) {

		return auxhaspathsum1(root, 0, sum, false);
	}

	public boolean auxhaspathsum1(TreeNode root, int sum, int givenSum,
			boolean isSum) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null
				&& ((sum + root.value) == givenSum)) {
			return true;
		} else {
			boolean a1 = auxhaspathsum1(root.left, sum + root.value, givenSum,
					isSum);
			boolean a2 = auxhaspathsum1(root.right, sum + root.value, givenSum,
					isSum);
			return a1 || a2;
		}
	}
	
	/*
	 * 113. Path Sum II
	 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
	 */
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<Integer> listin = new LinkedList<Integer>();
		List<List<Integer>> listmain = new LinkedList<List<Integer>>();
		auxpathsum(root,sum,listin,listmain);
			return listmain;
				
	}
	private void auxpathsum(TreeNode root, int givenSum,List<Integer> listin, List<List<Integer>> listmain) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null&& (root.value-givenSum==0)) {
				listin.add(root.value);
				listmain.add(new LinkedList<Integer>(listin));
				listin.remove(listin.size() - 1);
				return ;
        } 
		listin.add(root.value);
	    auxpathsum(root.left, givenSum - root.value,listin,listmain);
	    auxpathsum(root.right, givenSum - root.value,listin,listmain);
		listin.remove(listin.size() - 1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
