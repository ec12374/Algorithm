package com.tus.algo.Comninational;

import java.util.Arrays;

public class AllSequences {
	// TC= (n^k) --- for a given n length array of symbols/characters--->
	// k- generate k length sequences
	// SC=O(k)
	public void AllSequencesRecursive(char[] in, int n) {

		MyInteger count = new MyInteger(0);
		char[] out = new char[n];
		auxAllSequences(0, n, in, out, count);
		System.out.println("Total sequences: " + count.get());
	}

	private void auxAllSequences(int d, int n, char[] in, char[] out,
			MyInteger count) {
		if (d == n) {
			System.out.println(Arrays.toString(out));
			count.set(count.get() + 1);
			return;
		}

		for (int i = 0; i < in.length; i++) {
			out[d] = in[i];
			auxAllSequences(d + 1, n, in, out, count);
		}
	}

	public static void main(String[] args) {
		AllSequences allsq = new AllSequences();
		int n = Integer.parseInt(args[0]);
		char[] in = args[1].toCharArray();
		allsq.AllSequencesRecursive(in, n);

	}

}
