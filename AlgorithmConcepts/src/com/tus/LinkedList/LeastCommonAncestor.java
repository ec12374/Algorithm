package com.tus.LinkedList;

import java.util.HashSet;

public class LeastCommonAncestor {
	// TC=O(nm)
	// SC=O(1)
	public static SllNode findLCA1(SllNode head1, SllNode head2) {

		SllNode current = head2;
		for (SllNode temp = head1; temp != null; temp = temp.next) {
			while (current != null) {
				if (current == temp)
					return temp;
				else
					current = current.next;
			}
		}

		return null;
	}

	// TC=O(n+m)
	// SC=O(n or m)
	public static SllNode findLCA2(SllNode head1, SllNode head2) {

		HashSet<SllNode> set = new HashSet<SllNode>();

		for (SllNode temp = head1; temp != null; temp = temp.next) {
			set.add(temp);
		}
		for (SllNode current = head2; current != null; current = current.next) {
			if (set.contains(current)) {
				return current;
			}
		}
		return null;
	}
//TC--> O(m+n)
	//SC--> O(1)
	public static SllNode findLCA3(SllNode head1, SllNode head2) {
		int firstList = size(head1);
		int secondList = size(head2);
		SllNode current1 = head1;
		SllNode current2 = head2;

		while (firstList > secondList) {
			current1 = current1.next;
			--firstList;
		}
		while (firstList < secondList) {
			current2 = current2.next;
			--secondList;
		}
		while ((current1 != null) && (current2 != null)) {
			if (current1 == current2)
				return current1;
			else {
				current1 = current1.next;
				current2 = current2.next;
			}
		}
		return null;
	}

	public static int size(SllNode list) {
		int length = 0;
		for (SllNode head = list; head != null; head = head.next) {
			++length;
		}
		return length;
	}

}
