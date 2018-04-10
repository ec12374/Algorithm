package com.tus.LinkedList;

public class KthNode {

	public SllNode kthNode(SllNode head, int kth) {
		if (head == null && kth > 0)
			return null;
		SllNode current = head;
		int length = 0;

		while (current != null) {
			++length;
			current = current.next;
		}
		if (length < kth)
			return null;
		current = head;
		int m = length - kth;
		while (m > 0 && current != null) {
			--m;
			current = current.next;
		}

		return current;
	}

	public SllNode removekthNode(SllNode head, int kth) {
		if (head == null && kth > 0)
			return null;
		else if (head.next == null)
			return null;
		SllNode current = head;
		int length = 0;
		SllNode previous = null;
		SllNode nextNode = null;

		while (current != null) {
			++length;
			current = current.next;
		}
		if (length < kth)
			return head;
		current = head;
		int m = length - kth;
		if (m == 0 && current != null) {
			head = current.next;
			//current = null;
			return head;
		}
		else {
		while (m > 0 && current != null) {
			--m;
			previous = current;
			current = current.next;

		}
			if (current.next != null) {
				nextNode = current.next;
				previous.next = nextNode;

			} else {
			previous.next=null;
		}
		//current = null;
		return head;
		}
	}

}
