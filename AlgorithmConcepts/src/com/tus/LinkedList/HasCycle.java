package com.tus.LinkedList;

import java.util.HashSet;

public class HasCycle {

	// TC--> O(n)
	// SC--> O(n)
	public static boolean hasCycle1(SllNode head) {

		SllNode current = head;
		HashSet<SllNode> hst = new HashSet<SllNode>();
		while (current != null) {
			if (hst.contains(current)) {
				return true;
			} else {
				hst.add(current);
				current = current.next;
			}
		}

		return false;
	}

	// TC--> 3n ~O(n)
	// SC--> O(1)
	public static boolean hasCycle2(SllNode head) {
		if(head==null)return false;
		SllNode slow = head;
		SllNode fast = head;
		while ((fast != null) && (fast.next != null)) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;

		}

		return false;

	}

}
