package com.tus.LinkedListOperations;

public class MergeTwoList {

	public SingleLL mergetwoLists(SingleLL l1, SingleLL l2) {
		SingleLL head = new SingleLL();
		SingleLL current = head;

		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				current.next = new SingleLL(l1.data);
				l1 = l1.next;
				current = current.next;
			} else {
				current.next = new SingleLL(l2.data);
				l2 = l2.next;
				current = current.next;

			}
		}
		if (l1 == null && l2 != null) {
			while (l2 != null) {
				current.next = new SingleLL(l2.data);
				l2 = l2.next;
				current = current.next;
				if (l2 == null)
					break;
			}

		}
		if (l1 != null && l2 == null) {
			while (l1 != null) {
				current.next = new SingleLL(l1.data);
				l1 = l1.next;
				current = current.next;
				if (l1 == null)
					break;
			}

		}
		return head.next;
	}

	public static void main(String[] args) {
		ListCreation lst = new ListCreation();

		// first list
		SingleLL head1 = new SingleLL(1);
		head1.next = new SingleLL(1);
		head1.next.next = new SingleLL(2);
		head1.next.next.next = new SingleLL(4);
		head1.next.next.next.next = new SingleLL(5);

		// second list
		SingleLL head2 = new SingleLL(1);
		head2.next = new SingleLL(2);
		head2.next.next = new SingleLL(3);
		head2.next.next.next = new SingleLL(4);
		head2.next.next.next.next = new SingleLL(5);

		MergeTwoList twoList = new MergeTwoList();
		SingleLL head = twoList.mergetwoLists(head1, head2);
		lst.display(head);

	}

}
