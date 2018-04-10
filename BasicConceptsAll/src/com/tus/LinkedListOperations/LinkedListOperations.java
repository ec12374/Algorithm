package com.tus.LinkedListOperations;

public class LinkedListOperations {

	public void addLast(SingleLL head, int value) {
		SingleLL current = head;
		while (true) {
			if (current.next == null) {
				current.next = new SingleLL(value);
				break;
			} else
				current = current.next;
		}
	}

	public SingleLL addFirst(SingleLL head, int value) {
		SingleLL first = new SingleLL(value);
		first.next = head;
		head = first;
		return head;
	}

	public void addAfterKthposition(SingleLL head, int n, int value) {
		SingleLL current = head;
		SingleLL temp = null;
		int i = 1;
		while (i != n) {
			current = current.next;
			++i;
		}
		if (current.next != null) {
			temp = current.next;
		}
		SingleLL kthNode = new SingleLL(value);
		kthNode.next = temp;
		current.next = kthNode;
	}

	public void removeLast(SingleLL head) {
		SingleLL current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	public SingleLL removeFirst(SingleLL head) {
		if (head == null)
			return null;
		SingleLL current = head;
		if (current.next != null) {
			head = head.next;
			current.next = null;
		}
		return head;
	}

	public void removeKthNode(SingleLL head, int n) {
		if (head == null || n <= 0)
			System.out.println("Either enter some node or enter valid value");
		else {
			int i = 1;
			SingleLL current = head;
			while (current.next != null) {
				current = current.next;
				++i;
			}
			if (i >= n) {
				i = 1;
				current = head;
				SingleLL prev = null;
				SingleLL forward = null;
				while (i != n - 1) {
					if (current.next != null) {
						current = current.next;
						++i;
					}
				}
				// given name to particular nodes
				prev = current;
				if (current.next != null)
					current = current.next;// we have to remove
				if (current.next != null)
					forward = current.next;
				// Removal of KthNode
				prev.next = forward;
				current.next = null;
			} else {
				System.out.println("Enter less value than available number of nodes");
			}
		}
	}

	public static void main(String[] args) {
		LinkedListOperations ops = new LinkedListOperations();
		ListCreation crt = new ListCreation();
		SingleLL head = crt.createList(5);
		crt.display(head);
		ops.addLast(head, 100);
		crt.display(head);
		ops.addLast(head, 200);
		crt.display(head);
		ops.addLast(head, 300);
		crt.display(head);
		ops.addLast(head, 400);
		crt.display(head);
		// SingleLL head1 = ops.addFirst(head, 0);
		// crt.display(head1);
		ops.addAfterKthposition(head, 3, 500);
		crt.display(head);
		ops.removeLast(head);
		crt.display(head);
		/*
		 * SingleLL head1 = ops.removeFirst(head); crt.display(head1); SingleLL
		 * head2 = ops.removeFirst(head1); crt.display(head2);
		 */
		ops.removeKthNode(head, 9);
		crt.display(head);
		ops.removeKthNode(head, 0);
		crt.display(head);

	}

}
