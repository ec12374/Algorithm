package com.tus.algo.TrieStructure;

import java.util.LinkedList;
import java.util.List;

//TO-DO on leet code 
public class TSTmethods {
	private static TSTNode root;

	// TC:O(m)
	// SC:O(1)
	public static boolean addWord(String word) {
		TSTNode current = root, parent = null;
		int i = 0;

		// check where to assign left, right or middle
		while (current != null && i < word.length()) {
			parent = current;
			if (current.value > word.charAt(i)) {
				current = current.left;
			} else if (current.value == word.charAt(i)) {
				current = current.middle;
				i++;
			} else
				current = current.right;
		}

		// word already exist then return true
		if (i == word.length()) {
			parent.isWord = true;
			return true;
		}

		// word does not exist
		TSTNode node = new TSTNode(word.charAt(i++));
		TSTNode start = node;
		// root=start;
		while (i < word.length()) {
			node.middle = new TSTNode(word.charAt(i++));
			node = node.middle;
		}
		node.isWord = true;

		// for first node and link other words to root node
		if (parent != null) {
			if (parent.value > start.value) {
				parent.left = start;
			} else if (parent.value < start.value) {
				parent.right = start;
			}
		} else {
			root = start;
		}

		return true;
	}

	public static boolean contains(String word) {

		TSTNode current = root;
		if (current == null)
			return false;
		int i = 0;
		while (current != null && i < word.length()) {

			if (current.value > word.charAt(i)) {
				if (current.isWord == true)
					return true;
				current = current.left;
			}

			else if (current.value == word.charAt(i)) {
				if (current.isWord == true)
					return true;
				current = current.middle;
				++i;

			} else {
				if (current.isWord == true)
					return true;
				current = current.right;
			}

		}

		return false;
	}

	// TC: O()
	public static List<String> autoComplete(String prefix) {

		List<String> words = new LinkedList<String>();
		if (prefix.length() == 0)
			return words;
		TSTNode tmp = findLastNodePrefix(root, prefix, words);
		if (tmp == null)
			return words;
		findOtherNodes(tmp.middle, prefix, words);
		return words;
	}

	private static TSTNode findLastNodePrefix(TSTNode root, String prefix,
			List<String> words) {

		TSTNode current = root;
		int i = 0;
		while (current != null && i < prefix.length()) {

			if (current.value > prefix.charAt(i)) {
				current = current.left;
			} else if (current.value == prefix.charAt(i)) {
				if (i == prefix.length() - 1)
					return current;
				current = current.middle;
				i++;
			} else {
				current = current.right;
			}
		}
		if (current == null)
			return null;

		return current;
	}

	private static void findOtherNodes(TSTNode tmp, String prefix,
			List<String> words) {
		if (tmp == null)
			return;
		findOtherNodes(tmp.left, prefix, words);
		if (tmp.isWord == true) {
			words.add(prefix + tmp.value);
		}
		findOtherNodes(tmp.middle, prefix + tmp.value, words);
		findOtherNodes(tmp.right, prefix, words);

	}

	public boolean remove(String word) {

		return false;
	}

	public static void traverse(TSTNode root) {
		List<String> words = new LinkedList<String>();
		TSTNode current = root;
		helper(current, "", words);
		System.out.println(words);
	}

	private static void helper(TSTNode current, String space, List<String> words) {

		// String word ="";
		if (current == null)
			return;

		if (current.left == null && current.right == null
				&& current.middle == null) {
			words.add(space + current.value);
		}
		helper(current.left, space + current.value, words);

		helper(current.middle, space + current.value, words);

		helper(current.right, space + current.value, words);

	}

	
	public static void display(){
		display(root,0, "root");
		
	}
	private static void display(TSTNode root,int nspaces, String type){
		if(root==null)return;
		for(int i=0; i<nspaces;i++){
			System.out.print(" ");
		}
		System.out.println(root.value + "(" + type + "," + root.isWord + ")" );
		display(root.left, nspaces+4, "L");
		display(root.middle, nspaces+4, "M");
		display(root.right, nspaces+4, "R");
		
	}
	public static void main(String[] args) {

		System.out.println(addWord("pqr"));
		System.out.println(addWord("pqm"));
		System.out.println(addWord("pqs"));
		System.out.println(addWord("abc"));
		System.out.println(addWord("rst"));
		System.out.println(addWord("xyz"));
		System.out.println(addWord("xy"));
		System.out.println(addWord("ab"));
		System.out.println(addWord("pra"));
		System.out.println(addWord("prz"));
		System.out.println(addWord("prst"));

		// traverse(root);
		System.out.println("============");
		/*System.out.println(contains("xyz"));
		System.out.println(autoComplete("p"));
		System.out.println(autoComplete("a"));
		System.out.println(autoComplete("r"));
		System.out.println(autoComplete("x"));*/
		display();

	}
}
