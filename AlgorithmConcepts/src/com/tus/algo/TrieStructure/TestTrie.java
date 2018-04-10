package com.tus.algo.TrieStructure;

public class TestTrie {

	public static void main(String[] args) {

        TrieMethods trie = new TrieMethods();
        System.out.println(trie.addWord("pqr"));
        System.out.println(trie.addWord("abc"));
        System.out.println(trie.addWord("xyz"));
        System.out.println(trie.addWord("abm"));
        System.out.println(trie.addWord("pqm"));
        System.out.println("------");
        System.out.println(trie.contains("abst"));

	}

}
