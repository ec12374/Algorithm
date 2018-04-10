package com.tus.LinkedList3nodes;

public class Linkedlist {

	static Node head;

	public void push(int data) {
		// 1 & 2 step:- create node & put data
		Node new_node = new Node(data);

		// 3- make next of new node as head;
		new_node.next = head;

		// 4- make new node to head;
		new_node = head;

	}

	public void printlist(){
		
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {

		Linkedlist lnw = new Linkedlist();
		lnw.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

	
		lnw.head.next = second;
		second.next = third;

		lnw.printlist();

	}
}
