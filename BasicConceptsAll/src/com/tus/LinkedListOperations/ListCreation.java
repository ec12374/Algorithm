package com.tus.LinkedListOperations;

import java.util.Random;

public class ListCreation {

	public SingleLL createList(int n) {
		SingleLL head = null;
		Random r = new Random();
		for (int i = 0; i < n; ++i) {
			head = createNode(head, r.nextInt(50) + 1);
		}
		return head;
	}

	private SingleLL createNode(SingleLL head, int value) {
		if (head == null)
			return new SingleLL(value);
		else {
			SingleLL current = head;
			while (true) {
				if (current.next == null) {
					current.next = new SingleLL(value);
					break;
				} else {
					current = current.next;
				}
			}
		}
		return head;
	}

	public void display(SingleLL head) {
		if (head == null)
			System.out.println("Please enter some node");
		else {
			SingleLL current = head;
			while (current.next != null) {
				System.out.print(current.data + " ");
				current = current.next;
				if (current.next == null) {
					System.out.print(current.data);
					break;
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ListCreation link = new ListCreation();
		SingleLL head = link.createList(10);
		link.display(head);

	}

}
