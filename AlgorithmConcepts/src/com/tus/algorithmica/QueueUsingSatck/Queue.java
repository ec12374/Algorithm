package com.tus.algorithmica.QueueUsingSatck;

import java.util.Stack;

public class Queue {

	private Stack<Integer> stck1;
	private Stack<Integer> stck2;

	public Queue() {
		super();
		stck1 = new Stack<Integer>();
		stck2 = new Stack<Integer>();
	}

	// O(1)
	public void push(int x) {
		stck1.push(x);
	}

	// O(1)am-----amortized
	public int pop() {

		if (stck2.isEmpty()) {
			while (!stck1.isEmpty()) {
				stck2.push(stck1.pop());
			}
		}

		return stck2.pop();
	}

	public int peek() {
		if (stck2.isEmpty()) {
			while (!stck1.isEmpty()) {
				stck2.push(stck1.pop());
			}
		}
		return stck2.peek();
	}

	public boolean empty() {
			return stck1.isEmpty() && stck2.isEmpty();

	}

	public void display() {
		if (stck2.isEmpty()) {
			System.out.println(stck1.toString());
		} else
			System.out.println(stck2.toString());
		// System.out.print("After Enqueue,now Queue is : " + stck1.toString());
		// System.out.print("After Dequeue, now Queue is: " + stck2.toString());
	}
}
