package com.tus.algo.TrieStructure;
//Ternary Search tree 
public class TSTNode {

	TSTNode left;
	TSTNode right;
	TSTNode middle;
	boolean isWord;
	char value;

	public TSTNode(char value) {
		// super();
		this.value = value;
		left = null;
		right = null;
		middle = null;
		isWord = false;
	}

}
