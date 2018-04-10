package com.tus.LinkedList;

public class SllNode {
	SllNode next;
	int value;

	public SllNode(int value) {
		super();
		this.value = value;
		this.next = this;
	}
	public SllNode(){
		next = this;
		
	}

}
