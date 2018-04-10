package com.tus.LinkedListOperations;

public class ReverseLinkedList {

	public SingleLL reverseList(SingleLL head) {

		if (head == null) {
			return null;
		} else if (head.next != null) {
			SingleLL current = head;
			SingleLL forward = head.next;
			SingleLL prev = null;

			while (current != null) {
				current.next = prev;
				prev = current;
				current = forward;
				if (forward != null)
					forward = forward.next;
			}
			if (current == null)
				head = prev;

		} else {
			return head;
		}
		return head;
	}

	/*
	 * Reverse a linked list from position m to n. Do it in-place and in
	 * one-pass.
	 * 
	 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	 * 
	 * return 1->4->3->2->5->NULL.
	 * 
	 * Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of
	 * list.
	 */

	public SingleLL reverseBetween(SingleLL head, int m, int n) {
		SingleLL current = head;
		SingleLL start = null;
		SingleLL last = null;
		SingleLL BWstart = null;
		SingleLL BWlast = null;

		while (current != null) {
			m = m - 1;
			n = n - 1;
			if (m == 0) {
				BWstart = current;
			}
			if (n == 0)
				BWlast = current;
		}

		return head;
	}

	/*
	 * Given a linked list, reverse the nodes of a linked list k at a time and
	 * return its modified list.
	 * 
	 * k is a positive integer and is less than or equal to the length of the
	 * linked list. If the number of nodes is not a multiple of k then left-out
	 * nodes in the end should remain as it is.
	 * 
	 * You may not alter the values in the nodes, only nodes itself may be
	 * changed.
	 * 
	 * Only constant memory is allowed.
	 * 
	 * For example, Given this linked list: 1->2->3->4->5
	 * 
	 * For k = 2, you should return: 2->1->4->3->5
	 * 
	 * For k = 3, you should return: 3->2->1->4->5
	 */

	public SingleLL reverseKgroup(SingleLL head, int k) {
		if (k <= 1 || (head.next == null) || head == null) {
			return head;
		}

		else {
			SingleLL current = head;
			int n = k;
			SingleLL BWtail = head;
			SingleLL prev = null;
			SingleLL forward = head.next;

			while (current != null && (n != 0)) {
				n = n - 1;
				current.next = prev;
				prev = current;
				current = forward;
				if (forward != null)
					forward = forward.next;
			}
			if (n == 0) {
				head = prev;
				BWtail.next = current;
			}
			

			return head;

		}
	}

	public static void main(String[] args) {

		ListCreation lst = new ListCreation();

		SingleLL head1 = new SingleLL(1);
		head1.next = new SingleLL(2);
		head1.next.next = new SingleLL(3);
		head1.next.next.next = new SingleLL(4);
		head1.next.next.next.next = new SingleLL(5);
		head1.next.next.next.next.next = new SingleLL(6);
		head1.next.next.next.next.next.next = new SingleLL(7);
		lst.display(head1);
		System.out.println("After reversal of K group");

		ReverseLinkedList rvl = new ReverseLinkedList();
		SingleLL head = rvl.reverseKgroup(head1, 9);
		lst.display(head);

	}

}
