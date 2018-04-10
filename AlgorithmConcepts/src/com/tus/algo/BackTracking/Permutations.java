package com.tus.algo.BackTracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

	public void permutation1(char[] in, int n) {
		char[] out = new char[in.length];
		auxpermutation1(0, in, out);
	}

	private void auxpermutation1(int d, char[] in, char[] out) {

		if (d == in.length) {
			if (isValid1(out)) {
				System.out.println(Arrays.toString(out));
			}
			return;
		}
		for (int i = 0; i < in.length; ++i) {
			out[d] = in[i];
			auxpermutation1(d + 1, in, out);

		}
	}

	private boolean isValid1(char[] out) {
		// System.out.println(d);
		for (int i = 0; i < out.length; ++i) {
			for (int j = i + 1; j < out.length; ++j)
				if (out[i] == out[j]) {
					return false;
				}
		}
		return true;
	}

	// Recursion+ BranchPruning====BackTracking
	public List<List<Integer>> permute(int[] nums) {
		List<Integer> listin = new LinkedList<Integer>();
		List<List<Integer>> listmain = new LinkedList<List<Integer>>();
		if (nums.length == 0){
			listmain.add(new LinkedList(listin));
			return listmain;
			}
		int[] out = new int[nums.length];
		auxpermutation2(0, nums, out, listin, listmain);
		return listmain;
	}

	private void auxpermutation2(int d, int[] in, int[] out,
			List<Integer> list, List<List<Integer>> listmain) {

		if (d == in.length) {
			for (int i = 0; i < out.length; ++i) {
				list.add(out[i]);
			}
			listmain.add(new LinkedList(list));
			list.clear();
			// System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < in.length; ++i) {
			if (isValid2(d, out, in[i])) {
				out[d] = in[i];
				auxpermutation2(d + 1, in, out, list, listmain);
			}

		}
	}

	private boolean isValid2(int d, int[] out, int check) {
		// System.out.println(d);
		for (int i = 0; i < d; ++i) {
			if (out[i] == check)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] in = {};
		Permutations pr = new Permutations();
		System.out.println(pr.permute(in));

	}

}
