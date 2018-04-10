package com.tus.LinkedList;

public class TestCases {

	public static void main(String[] args) {
		SllNode head = new SllNode(1);
		head.next = new SllNode(2);
		head.next.next = new SllNode(3);
		head.next.next.next = new SllNode(4);
		head.next.next.next.next = new SllNode(5);
		head.next.next.next.next.next=null;
		
		for(SllNode current = head; current!=null ; current = current.next){
			System.out.print(current.value + "  ");
		}
		System.out.println();
		
		KthNode kth =new KthNode();
		
		SllNode result = kth.removekthNode(head, 1);
		for(SllNode current = result; current!=null ; current = current.next){
			System.out.print(current.value + "  ");
		}
		
		//System.out.println(kth.kthNode(head, 5).value);
		//RandomNode rnd = new RandomNode();
		//int vlue = rnd.randomNode(head).value;
		//System.out.println(vlue);
	}

}
