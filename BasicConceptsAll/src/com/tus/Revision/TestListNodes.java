package com.tus.Revision;

public class TestListNodes {

	public static void main(String[] ar) {

		int n = Integer.parseInt(ar[0]);
		ListOperations lst = new ListOperations();

		ListNode head = lst.createList(n);
		lst.display(head);

		ListNode head1 = lst.addLast(head, 100);
		System.out.println();
		System.out.print("After addition of nodes ");
		lst.display(head1);
		System.out.println();

		ListNode head2 = lst.addAfterKthNode(head1, 200, 5);
		System.out.println();
		lst.display(head2);

	}

}
