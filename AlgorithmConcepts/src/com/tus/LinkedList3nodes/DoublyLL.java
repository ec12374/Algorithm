package com.tus.LinkedList3nodes;

public class DoublyLL {

	Node head;

	public DoublyLL() {

		head = new Node();
	}

	public void printList() {

		for (Node temp = head.next; temp != null; temp = temp.next) {
			System.out.print(temp.data + " ");
		}
	}

	public void push(int data) {

		Node ndw = new Node(data);
		ndw.next = head.next;
		ndw.prev = head;
		if (ndw.next != null)
			head.next.prev = ndw;// if no value on next node
		head.next = ndw;

	}

	public void addLast(int data) {
		Node ndw = new Node(data);
		// i am using as a pointer ...copy of head...without disturbing head
		Node last = head;
		// new node will be the last node hence, it next always will be null
		ndw.next = null;
		if (head == null) {
			ndw.prev = null;
			ndw = head;
		}
		// if next node is present then traverse up to end
		while (last.next != null)
			last = last.next;
		last.next = ndw;
		ndw.prev = last;

	}

	public void addAfter(Node prevNode, int data) {
		Node ndw = new Node(data);

		if (prevNode == null) {
			System.out.println("No any previous Node is present");
		}
		ndw.next = prevNode.next;
		ndw.prev = prevNode;
		prevNode.next = ndw;
		if (ndw.next.prev != null)
			ndw.next.prev = ndw;
	}

	public void remove(Node prevNode) {
		prevNode.next = prevNode.next.next;
		prevNode.next.prev = prevNode;

	}

	public void removeLast() {
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.prev.next = null;

	}

}
