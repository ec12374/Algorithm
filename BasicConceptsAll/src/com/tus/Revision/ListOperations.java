package com.tus.Revision;

import java.util.Random;

public class ListOperations {

	// create list on the basis of given length
	public ListNode createList(int len) {
		ListNode head = null;
		Random r = new Random(10);
		for (int i = 0; i < len; ++i) {

			head = createNode(head, r.nextInt(20) + 1);
		}

		return head;
	}

	public ListNode createNode(ListNode head, int value) {
		if (head == null)
			return new ListNode(value);
		else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
		return head;
	}

	public void display(ListNode head) {
		if (head == null) {
			System.out.println("Please enter some node");
		} else if (head.next == null) {
			System.out.println("Value of head node: " + head.value);
		} else {
			ListNode current = head;
			System.out.print("LinkedList is: ");
			while (current != null) {
				System.out.print(current.value + " ");
				current = current.next;
			}
		}
	}

	public ListNode addLast(ListNode head, int value) {
		if (head == null)
			return new ListNode(value);
		else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}

		return head;
	}

	public ListNode addAfterKthNode(ListNode head, int value, int positionKth) {
		if (head == null)
			return new ListNode(value);
		else {
			ListNode current = head;
			while (current.next != null && positionKth != 1) {
				current = current.next;
				--positionKth;
			}
			if (current.next == null && positionKth > 1) {
				System.out
						.println("Ooops! given length exceeds the present list ");
			} else if (current.next != null && positionKth == 1) {
				ListNode temp = new ListNode(value);
				temp.next = current.next;
				current.next = temp;
			}
		}

		return head;
	}
	
	public ListNode deleteKthNode(ListNode head, int positionKth){
		
		return head;
	}
}
