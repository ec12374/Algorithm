package com.tus.algo.TrieStructure;

import java.util.List;

public interface ITrie {

	boolean add(String word);

	boolean remove(String word);

	boolean contains(String word);

	List<String> autocomplete(String prefix);

	void displayAll();

	void print();
}
