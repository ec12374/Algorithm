package com.tus.SuperQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SuperQueue {

	private Queue<Integer> queue;
	private Deque<Integer> dqueue;

	public SuperQueue() {
		queue = new LinkedList<Integer>();
		dqueue = new LinkedList<Integer>();
	}

	public void enQueue(Integer element) {
		queue.add(element);
		if (dqueue.isEmpty())
			dqueue.addFirst(element);
		else if (element >= dqueue.peekLast()) {
			dqueue.addLast(element);
		} else {
			while (element < dqueue.peekLast()) {
				dqueue.removeLast();
				if (dqueue.peekLast() == null)
					break;
			}
			dqueue.addLast(element);
		}
	}

	public Integer deQueue() {
		if (queue.isEmpty()) {
			System.out.println("Please eneter some value to display");
			return null;
		}
		int temp = queue.remove();
		if (dqueue.isEmpty())
			return null;
		else if (temp == dqueue.peekFirst()) {
			dqueue.removeFirst();
		}
		return temp;
	}

	public Integer findMin() {
        if(dqueue.isEmpty())return null;
		return dqueue.peekFirst();
	}

	public void display() {
		System.out.println("Queue: " + queue.toString());
		System.out.println("Dequeue: " + dqueue.toString());
	}
}
