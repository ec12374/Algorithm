package com.tus.algo.DynamicProgramming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Triangle {

	public int miniTotal(List<List<Integer>> triangle) {
		// List<Integer> inner = new LinkedList<Integer>();
		// List<List<Integer>> outer = new LinkedList<List<Integer>>();
		// outer = triangle;
		int depth = triangle.size();
		int min = Integer.MAX_VALUE;
		int[] sum= new int[depth];
		sum[0]=triangle.get(0).get(0);
		System.out.println(sum[0]);
		for (int i = 1; i < depth; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(triangle.get(i).get(j)+" ");

			}
			System.out.println();
		}

		// System.out.println(triangle.get(0).get(0));

		/*
		 * Iterator<List<Integer>> itr1 = outer.iterator(); while
		 * (itr1.hasNext()) { int i = 0;// System.out.println(itr1.next());
		 * Iterator<Integer> itr2 = itr1.next().iterator(); while
		 * (itr2.hasNext()) { System.out.println(itr2.next() + " " + i); ++i; }
		 * }
		 */

		return 1;
	}

	private void auxminiTotal(int d, int depth, int sum, int min,
			List<List<Integer>> outer) {
		if (d == depth) {
			min = Math.min(sum, min);
		}
		Iterator<List<Integer>> itr1 = outer.iterator();
		while (itr1.hasNext()) {
			int i = 0;// System.out.println(itr1.next());
			Iterator<Integer> itr2 = itr1.next().iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next() + " " + i);
				auxminiTotal(d + 1, depth, sum + itr2.next(), min, outer);
				++i;
			}
		}

	}

	public static void main(String[] args) {
		List<Integer> inside = new LinkedList<Integer>();
		List<List<Integer>> mainList = new LinkedList<List<Integer>>();

		inside.add(2);
		mainList.add(new LinkedList(inside));
		inside.clear();
		inside.add(3);
		inside.add(4);
		mainList.add(new LinkedList(inside));
		inside.clear();
		inside.add(6);
		inside.add(5);
		inside.add(7);
		mainList.add(new LinkedList(inside));
		inside.clear();
		inside.add(4);
		inside.add(1);
		inside.add(8);
		inside.add(3);
		mainList.add(new LinkedList(inside));
		inside.clear();

		Triangle tr = new Triangle();
		tr.miniTotal(mainList);

	}

}
