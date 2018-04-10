package com.tus.algo.TrieStructure;

public class TrieNode {

	TrieNode[] box;// array object created
	boolean isWord;
	//private static final int APLBHABET_SIZE=26;

	public TrieNode() {
        isWord =false;
		box = new TrieNode[26];
		/*for (int i = 0; i < 26; i++)
            box[i] = null;*/
		// size assigned
		//box: a pointer to array that has a size equal to the size of alphabet
		//element 0 is a
		//element 1 is b
		//element 25 is z
		//all elements are null until a node gets placed into that element
		//isWord = false;

	}
}

	

