package com.tus.SuperQueue;

public class TestCasesSuperQueue {

	public static void main(String[] args) {


		SuperQueue sq = new SuperQueue();
		System.out.println("Min value is: "+ sq.findMin());
		sq.enQueue(6);
		//sq.display();
		sq.enQueue(8);
		sq.enQueue(3);
		sq.enQueue(4);
		sq.display();
		System.out.println("Min value is: "+ sq.findMin());

	}

}
