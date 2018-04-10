package com.tus.LinkedList;

public class ReverseList {

	public SllNode reverseList(SllNode head) {

		SllNode prev = null;
		SllNode current = head;

		while (current != null) {
			SllNode NextNode = current.next;
			current.next = prev;
			prev = current;
			current = NextNode;
		}

		return prev;
	}
	public SllNode reverseList1(SllNode head) {

		SllNode prev = null;
		//SllNode current = head;

		while (head != null) {
			SllNode NextNode = head.next;
			head.next = prev;
			prev = head;
			head = NextNode;
		}

		return prev;
	}

}
