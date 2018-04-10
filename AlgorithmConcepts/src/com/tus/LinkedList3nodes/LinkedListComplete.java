package com.tus.LinkedList3nodes;

public class LinkedListComplete {
	
	 Node head;
	 public LinkedListComplete() {
		head = new Node();
	}
	
	public void printList(){
		
		for(Node temp = head.next; temp!=null;temp = temp.next){
			//System.out.println("m here");
			System.out.print(temp.data+ "  ");
		}
		
	}
	
	public void push(int data){
		
		Node new_node = new Node(data);
		//System.out.println(new_node.data);
		
		new_node.next = head.next;
		head.next = new_node;
	}
	

}
