package com.tus.LinkedListOperations;

public class AddTwoNumbers {

	public SingleLL addTwoNumbers(SingleLL l1, SingleLL l2) {
		SingleLL head = new SingleLL();
		SingleLL current = head;
		int sum = 0;
		int remainder = 0;
		int quotient = 0;

		while (l1 != null && l2 != null) {
			sum = l1.data + l2.data + quotient;
			quotient = sum / 10;
			remainder = sum % 10;
			if (sum <= 9) {
				current.next = new SingleLL(sum);
			} else {
				current.next = new SingleLL(remainder);
			}
			l1 = l1.next;
			l2 = l2.next;
			current = current.next;
		}
		if (l1 == null && l2 == null && quotient != 0) {
			current.next = new SingleLL(quotient);
		}
		if (l1 == null && l2 != null) {
			while (l2 != null) {
				sum = l2.data + quotient;
				quotient = sum / 10;
				remainder = sum % 10;
				if (sum <= 9) {
					current.next = new SingleLL(sum);
				} else {
					current.next = new SingleLL(remainder);
				}
				l2 = l2.next;
				current = current.next;
			}

		}

		else {
			while (l1 != null) {
				sum = l1.data + quotient;
				quotient = sum / 10;
				remainder = sum % 10;
				if (sum <= 9) {
					current.next = new SingleLL(sum);
				} else {
					current.next = new SingleLL(remainder);
				}
				l1 = l1.next;
				current = current.next;
			}

		}
		return head.next;

	}

	public static void main(String[] args) {

		ListCreation lst = new ListCreation();

		// first list
		SingleLL head1 = new SingleLL(2);
		 head1.next = new SingleLL(6);
		 head1.next.next = new SingleLL(3);
		// head1.next.next.next = new SingleLL(4);
		// head1.next.next.next.next = new SingleLL(5);

		// second list
		SingleLL head2 = new SingleLL(1);
		head2.next = new SingleLL(8);
		//head2.next.next = new SingleLL(8);
		// head2.next.next.next = new SingleLL(4);
		// head2.next.next.next.next = new SingleLL(5);

		AddTwoNumbers add = new AddTwoNumbers();
		SingleLL head = add.addTwoNumbers(head1, head2);
		lst.display(head);

	}

}
