package com.tus.LinkedList3nodes;

public class TestCases {

	public static void main(String[] args) {

   /*LinkedListComplete ll = new LinkedListComplete();
   ll.push(1);
   ll.push(2);
   ll.push(3);
   ll.push(4);
   ll.push(5);
  // System.out.println(ll.head.next.data);
   ll.printList();*/
		
		DoublyLL list = new DoublyLL();
		list.push(10);
		list.push(20);
		list.addLast(0);
		list.push(30);
		list.push(40);
		list.push(50);
	  // list.addAfter(list.head.next, 100);
	  list.remove(list.head);
	  list.push(50);
		list.removeLast();
		list.printList();

	}

}
