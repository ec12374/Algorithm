package com.tus.algo.DynamicProgramming;

import java.util.Arrays;
import java.util.Random;

public class FindMaxSum {

	// Adhoc: brute force
	// all possible cases
	// TC= O(2^2n)
	// SC = O(2n)_~O(n)
	public int findMaxSum1(int[][] in) {
		MyInteger maxSum = new MyInteger(0);
		auxMaxSum1(in, 0, 0, 0, maxSum);
		return maxSum.get();
	}

	private void auxMaxSum1(int[][] in, int i, int j, int sum, MyInteger maxSum) {
		if (i == in.length - 1 && j == in.length - 1) {
			maxSum.set(Math.max(maxSum.get(), sum + in[i][j]));
			return;
		}
		if (i >= in.length || j >= in.length)
			return;
		auxMaxSum1(in, i, j + 1, sum + in[i][j], maxSum);
		auxMaxSum1(in, i + 1, j, sum + in[i][j], maxSum);

	}

	// Recursion: find max of leftSum and rightSum and add to the last index
	// TC= O(2^2n)
	// SC = O(2n)_~O(n)
	public int findMaxSum2(int[][] in) {
		int n = in.length - 1;
		return auxMaxSum2(in, n, n);

	}

	private int auxMaxSum2(int[][] in, int i, int j) {
		if (i < 0 || j < 0)
			return 0;

		int topSum = auxMaxSum2(in, i - 1, j);
		int leftSum = auxMaxSum2(in, i, j - 1);

		return Math.max(topSum, leftSum) + in[i][j];
	}

	
	// Recursion with memory===memorization
	// TC=O(n^2)
	//SC=O(n^2+2n)~=O(n^2)
	public int findMaxSum3(int[][] in) {
		int n = in.length;
		int[][] mem = new int[n + 1][n + 1];
		return auxMaxSum3(in, n, n, mem);

	}

	private int auxMaxSum3(int[][] in, int i, int j, int[][] mem) {
		if (i <= 0 || j <= 0)
			return 0;
		if (mem[i][j] != 0)
			return mem[i][j];
		int topSum = auxMaxSum3(in, i - 1, j, mem);
		int leftSum = auxMaxSum3(in, i, j - 1, mem);
		mem[i][j] = Math.max(topSum, leftSum) + in[i - 1][j - 1];
		return mem[i][j];
	}

	// TC= O(n)
	// SC = o(n)
	public int findMaxSum4(int[][] in) {
		int n = in.length;
		int[][] mem = new int[n + 1][n + 1];
		// int maxSum=0;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				mem[i][j] = Math.max(mem[i - 1][j], mem[i][j - 1])
						+ in[i - 1][j - 1];
			}
		}
		return mem[n][n];
	}

	public static void main(String[] args) {
		FindMaxSum sum = new FindMaxSum();
		int n = Integer.parseInt(args[0]);
		Random r = new Random(100);
		int[][] in = new int[n][n];
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in.length; j++) {
				in[i][j] = r.nextInt(n) + 1;
			}
		}
		System.out.println(Arrays.deepToString(in));

		System.out.println(sum.findMaxSum1(in));
		System.out.println(sum.findMaxSum2(in));
		System.out.println(sum.findMaxSum3(in));
		System.out.println(sum.findMaxSum4(in));

	}

}
