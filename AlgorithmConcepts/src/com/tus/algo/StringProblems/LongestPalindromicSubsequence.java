package com.tus.algo.StringProblems;

import java.util.Arrays;

public class LongestPalindromicSubsequence {

	public int palsubsequence(String str) {
		return auxpalsbq(str, 0, str.length() - 1);
	}

	private int auxpalsbq(String str, int i, int j) {

		if (i == j)
			return 1;
		if (i > j)
			return 0;

		if (str.charAt(i) == str.charAt(j)) {// first and last element are
												// matched
			return auxpalsbq(str, i + 1, j - 1) + 2;
		} else {
			int incr = auxpalsbq(str, i + 1, j);
			int decr = auxpalsbq(str, i, j - 1);
			return Math.max(incr, decr);
		}
	}

	public int palsubsequence1(String str) {
		int[][] mem = new int[str.length() + 1][str.length() + 1];
		return auxpalsbq1(str, 0, str.length() - 1, mem);
	}

	private int auxpalsbq1(String str, int i, int j, int[][] mem) {

		if (i == j)
			return 1;
		if (i > j)
			return 0;
		if (mem[i][j] != 0)
			return mem[i][j];

		if (str.charAt(i) == str.charAt(j)) {// first and last element are
												// matched
			return mem[i][j] = auxpalsbq1(str, i + 1, j - 1, mem) + 2;
		} else {
			int incr = auxpalsbq1(str, i + 1, j, mem);
			int decr = auxpalsbq1(str, i, j - 1, mem);
			return mem[i][j] = Math.max(incr, decr);
		}
	}

	// Dynamic Programming
	// TC: O(n^2)
	// SC: O(n^2)
	public int palsubsequence2(String str) {
		int m = str.length();
		int[][] mem = new int[m + 1][m + 1];

		for (int i = 1; i <= m; ++i) {
			mem[i][i] = 1;
		}
		// Bottom-up row-wise filling
		for (int i = m - 1; i >= 1; --i) {
			for (int j = i + 1; j <= m; ++j) {

				if (str.charAt(i - 1) == str.charAt(j - 1))
					mem[i][j] = mem[i + 1][j - 1] + 2;
				else {
					int incr = mem[i + 1][j];
					int decr = mem[i][j - 1];
					mem[i][j] = Math.max(incr, decr);
				}
			}
		}
		printMemory(mem);
		// printSequence(mem, 1, m, str);
		System.out.println();
		return mem[1][m];

	}

	private void printMemory(int[][] mem) {
		for (int[] tmp : mem)
			System.out.println(Arrays.toString(tmp));
	}

	/*
	 * private static void printSequence(int[][] mem, int i, int j, String s) {
	 * if (i > j) return; if (s.charAt(i - 1) == s.charAt(j - 1)) { //
	 * System.out.print(s.charAt(i-1)); printSequence(mem, i + 1, j - 1, s);
	 * System.out.print(s.charAt(i - 1)); } else { if (mem[i + 1][j] > mem[i][j
	 * - 1]) printSequence(mem, i + 1, j, s); else printSequence(mem, i, j - 1,
	 * s); } }
	 */

	public static void main(String[] args) {
		LongestPalindromicSubsequence lsq = new LongestPalindromicSubsequence();
		String str = "abdcba";
		System.out.println(lsq.palsubsequence(str));
		System.out.println(lsq.palsubsequence1(str));
		System.out.println(lsq.palsubsequence2(str));
	}

}
