package com.tus.algorithmica.datastructures;

public interface ICache {

	Integer get(String key);// if i know key i can find the value
	void add(String key, Integer value);
	void display();
	
}
