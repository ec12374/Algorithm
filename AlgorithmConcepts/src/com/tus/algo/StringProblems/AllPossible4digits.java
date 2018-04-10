package com.tus.algo.StringProblems;

import java.util.Arrays;

public class AllPossible4digits {

	public void allNdidgits(int n) {
		int[] out = new int[n];
		auxfourdigits(0, n, out);

	}

	private void auxfourdigits(int d, int n, int[] out) {
		if (d == n) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < 2; ++i) {
			out[d] = i;
			auxfourdigits(d + 1, n, out);
		}
	}
	public void allNdidgits1(int n) {
		int[] out = new int[n];
		auxfourdigits1(0, n, out);

	}

	private void auxfourdigits1(int d, int n, int[] out) {
		if (d == n) {
			if(isValid1(out))
			System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < 2; ++i) {
			out[d] = i;
			auxfourdigits1(d + 1, n, out);
		}
	}
	private boolean isValid1(int[] out){
		
		if(out[0]==0)return false;
		return true;
	}

	public static void main(String[] args) {
		AllPossible4digits fourdigit = new AllPossible4digits();
		int n= Integer.parseInt(args[0]);
		fourdigit.allNdidgits1(n);

	}

}
