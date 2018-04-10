package com.tus.LinkedList;

import java.util.Random;

public class RandomNode {

	public SllNode randomNode(SllNode head) {
		SllNode rnode = head;
		Random r = new Random();
		int n = 1;
		System.out.println("head = " + head.value);
		for (SllNode current = rnode.next; current != null; current = current.next) {
			++n;
			
			if (r.nextInt(n) == 0) {
				rnode = current;
			}
		}
		return rnode;

	}

}
