package com.tus.algorithmica.datastructures;

public class DListNode {
	DListNode prev, next;
	String key;
	Integer value;

	public DListNode() {
		this.prev = this;
		this.next = this;
	}

	public DListNode(String key, Integer value) {

		this.prev = this;
		this.next = this;
		this.key = key;
		this.value = value;
	}

}
