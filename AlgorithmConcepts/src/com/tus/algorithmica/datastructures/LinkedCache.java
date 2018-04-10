package com.tus.algorithmica.datastructures;

import java.util.HashMap;

public class LinkedCache implements ICache {
	private HashMap<String, DListNode> index;
	 DoublyLinkedList list;
	private int capacity;

	public LinkedCache(int capacity) {
		index = new HashMap<String, DListNode>();
		list = new DoublyLinkedList();
		this.capacity = capacity;
	}

	public Integer get(String key) {
		DListNode node = index.get(key);// get value from Hash and store in node
		if (node == null)
			return null;
		list.removeAddLast(node);
		return node.value;
	}

	public void add(String key, Integer value) {
		DListNode node = index.get(key);
        if(node!=null){
        	node.value = value;
            list.removeAddLast(node);
        }
		// is size full??
		if (capacity == list.size()) {
			DListNode first= list.removeFirst();
			index.remove(first.key);
		}
		// if cache is not full then it will add at the last of list
		DListNode temp = list.addlast(key, value);
		index.put(key, temp);

	}

	public void display() {
		
     list.display();
	}

}
