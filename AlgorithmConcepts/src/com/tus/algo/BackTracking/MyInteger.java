package com.tus.algo.BackTracking;

//this will use a heap object that anyone can share this object according to requirement
// if we create any static variable then it will cause an error in thread concepts.
public class MyInteger {
	int value;

	public MyInteger(int value) {
		this.value = value;
	}

	
	public int get() {
		return value;
	}

	public void set(int value) {
		this.value = value;
	}
}
