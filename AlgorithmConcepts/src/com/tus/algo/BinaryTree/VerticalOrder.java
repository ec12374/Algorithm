package com.tus.algo.BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a binary tree, print it vertically. The following example illustrates vertical order traversal.

        1
      /  \
     2     3
    / \   / \
   4   5 6   7
    \         \
     8         9 


 The output of print this tree vertically will be:
 4
 2 8
 1 5 6
 3 
 7
 9 
 *
 * The idea is to traverse the tree once and get the minimum and maximum horizontal 
 * distance with respect to root. For the tree shown above, 
 * minimum distance is -2 (for node with value 4) and 
 * maximum distance is 3 (For node with value 9).
 Once we have maximum and minimum distances from root, 
 we iterate for each vertical line at distance minimum to maximum from root,
 and for each vertical line traverse the tree and print the nodes which lie on that vertical line.
 * 
 */
public class VerticalOrder {

	public int verticalTree(TreeNode root) {
		Queue<TreeNode> que = new LinkedList<TreeNode>();
		HashMap<Integer, TreeNode> table = new HashMap<Integer, TreeNode>();
		int hd = 0;// Horizontal distance from root
		int min = 0, max = 0;// Min and max distance from root
		MyInteger maximum = new MyInteger(Integer.MIN_VALUE);  
		MyInteger minimum = new MyInteger(Integer.MAX_VALUE); 
		que.add(root);
        table.put(hd, root);
		while (true) {
			TreeNode tmp = que.remove();
			
			if (tmp.left != null) {
				System.out.println(hd);
				table.put(hd - 1, tmp.left);
				que.add(tmp.left);
			}
			if (tmp.right != null) {
				System.out.println(hd);
				table.put(hd + 1, tmp.right);
				que.add(tmp.right);
			}
			if (que.isEmpty())
				break;

		}
		//System.out.println(table.values());
		/*for(int i = -5; i < 5; ++i)
			if(table.get(i)!= null)
			System.out.println(table.get(i).value);
			else 
				System.out.println("null");
		*/
		return 1;
	}

	
	//
	public void verticalOrder(TreeNode root){
		int[] min =new int[1];
		int[] max = new int[1];
		findminmax(root,0,min,max);
	}
	public void findminmax(TreeNode root, int hd, int[] min, int[] max){
		if(root==null)return;
		if(hd<min[0]){
			min[0]=hd;
		}
		else{
			max[0]=hd;
		}
		findminmax(root.left, hd-1, min, max);
		findminmax(root.right, hd+1, min, max);
	}
}
