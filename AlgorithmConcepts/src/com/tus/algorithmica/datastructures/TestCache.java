package com.tus.algorithmica.datastructures;

public class TestCache {
	public static void testCase1(ICache cache) {
		//cache.add("k1", 10);
		//cache.display();
		/*cache.add("k2", 20);
		cache.display();
		cache.add("k3", 30);
		cache.display();
		System.out.println(cache.get("k4"));
		System.out.println(cache.get("k2"));
		cache.display();
		cache.add("k4", 40);
		cache.display();*/		
	}
	public static void main(String[] args) {
		LinkedCache cache = new LinkedCache(3);
		//DoublyLinkedList list = new DoublyLinkedList();
		cache.add("k1", 10);
		cache.display();
		cache.add("k2", 20);
		cache.display();
		cache.add("k3", 30);
		cache.display();
		cache.add("k4", 40);
		cache.display();
		cache.add("k4", 80);
		cache.display();
		cache.list.size();
		//System.out.println(list.size());
		System.out.println(cache.get("k3"));
		System.out.println(cache.get("k5"));

	}

}
