package com.tus.algo.DynamicProgramming;

public class GridCountPath {

	// Dynamic Programming
	// TC=O(n)
	// SC=O(n)
	public int countPath(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		int[][] mem = new int[2][n + 1];
		mem[1][1] = 1;
		for (int i = 1; i <= 1; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (i == 1 && j == 1)
					continue;
				mem[i][j] = mem[i - 1][j] + mem[i][j - 1];
			}
		}
		return mem[1][n];
	}

	public static void main(String[] args) {
		GridCountPath paths = new GridCountPath();

		System.out.println(paths.countPath(5));

	}

}
