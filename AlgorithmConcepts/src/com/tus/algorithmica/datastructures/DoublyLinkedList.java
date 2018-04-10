package com.tus.algorithmica.datastructures;

public class DoublyLinkedList {
	private DListNode head;
	private int size;

	public DoublyLinkedList() {
		super();
		this.head = new DListNode();
		this.size = 1;
	}

	public int size() {
		System.out.println("size "+size );
		return size;
	}

	public void removeAddLast(DListNode node) {
		// unlink the node
		node.next.prev = node.prev;
		node.prev.next = node.next;
		// Now add at the last
		node.next = head;
		node.prev = head.prev;
		head.prev.next = node;
		head.prev = node;

	}

	public DListNode addlast(String key, Integer value) {
		// Integer is wrapper class for collection
		DListNode node = new DListNode(key, value);
		// Now add at the last
	    node.prev = head.prev;
		node.next = head;
		head.prev.next = node;
		head.prev = node;
		++size;
		return node;

	}

	public DListNode removeFirst() {
		DListNode node = head.next;
		head.next= head.next.next;
		head.next.prev = head;
		--size;
		return node;
	}
	public void display(){
		//Circular DLL thats why current!=head if DLL then current!=null 
		for(DListNode current = head.next; current != head; current = current.next) {
			System.out.print("(" + current.key + "," + current.value + ")");
			
		}
		System.out.println();
	}
}
