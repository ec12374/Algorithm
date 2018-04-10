package com.tus.algo.TrieStructure;

//import java.util.List;

public class TrieMethods {

	TrieNode root; // combination of array object for box and
					// flag(isWord true or not)

	TrieMethods() {
		root = new TrieNode();
	}

	public boolean addWord(String word) {
		TrieNode current = root;

		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';// find the index where new node
												// will be attached
			if (current.box[index] == null) {
				current.box[index] = new TrieNode();
			}
			current = current.box[index];
		}
		if (current.isWord == true)
			return false;
		current.isWord = true;

		return true;
	}
	public boolean contains(String word){
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';

			if (current.box[index] == null) {
				return false;
			}
			current = current.box[index];
		}
		return current.isWord;
	} 
	
	public boolean delete(String word){
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';

			if (current.box[index] == null) {
				return false;
			}
			current = current.box[index];
		}
		if(current.isWord==true);
		
		return false;
	}
	public void dipslayAll(){
		TrieNode current = root;
		
	}

	/*
	 * public static void main(String[] args) { TrieMethods trie = new
	 * TrieMethods(); System.out.println(trie.addWord("abc"));
	 * System.out.println(trie.addWord("abd"));
	 * 
	 * }
	 */

}
