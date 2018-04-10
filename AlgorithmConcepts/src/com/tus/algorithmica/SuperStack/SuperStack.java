package com.tus.algorithmica.SuperStack;

// Design a data structure called Super stack using following API
// push() pop() findMin() top() display()
// Time Complexity== O(1);

import java.util.Stack;

public class SuperStack {

	Stack<Integer> dataStack;
	Stack<Integer> minStack;

	public SuperStack() {
		dataStack = new Stack<Integer>();
		minStack = new Stack<Integer>();

	}

	public void push(Integer element) {
		dataStack.push(element);
		if (minStack.isEmpty() || element <= minStack.peek()) {
			minStack.push(element);
		}

	}

	public Integer pop() {
		if (dataStack.isEmpty()){
			System.out.println("Please eneter some value to display");
		 return null;
		}
		else if (dataStack.peek() == minStack.peek()) {
			dataStack.pop();
			return minStack.pop();
		} else
			return dataStack.pop();
	}

	public Integer top() {
		if(dataStack.isEmpty())return null;
		return dataStack.peek();
	}

	public Integer findMin() {
		if (minStack.isEmpty())
			return null;
		return minStack.peek();
	}

	public void display() {
		System.out.println(dataStack.toString());
		System.out.println(minStack.toString());
	}

}
