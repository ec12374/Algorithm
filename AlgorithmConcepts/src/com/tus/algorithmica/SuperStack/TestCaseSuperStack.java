package com.tus.algorithmica.SuperStack;

public class TestCaseSuperStack {

	public static void main(String[] args) {
	 
		SuperStack dStack = new SuperStack();
		System.out.println(dStack.pop());
		dStack.push(10);
		dStack.push(5);
		dStack.push(6);
		dStack.push(4);
		dStack.push(3);
		dStack.push(8);
		dStack.display();
		System.out.println(dStack.pop());
		dStack.display();
		dStack.display();
		System.out.println(dStack.pop());
		dStack.display();
		System.out.println(dStack.pop());
		dStack.display();
		System.out.println(dStack.pop());
		dStack.display();
		System.out.println(dStack.pop());
		dStack.display();
		System.out.println(dStack.pop());
		dStack.display();
		System.out.println(dStack.pop());
		System.out.println(dStack.findMin());
		System.out.println(dStack.top());
		dStack.display();
		

	}

}
