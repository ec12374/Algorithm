package com.tus.algo.DynamicProgramming;

public class UniquePaths {

	public int uniquePaths(int m, int n) {
		MyInteger count = new MyInteger(0);
		auxuniquePaths(0, 0, m, n, count);
		return count.get();

	}

	private void auxuniquePaths(int i, int j, int m, int n, MyInteger count) {

		if (i >= m || j >= n)
			return;
		if (i == m - 1 && j == n - 1) {
			count.set(count.get() + 1);
			return;
		}
		auxuniquePaths(i, j + 1, m, n, count);
		auxuniquePaths(i + 1, j, m, n, count);
	}

	// Recursion
	public int uniquePathsRec(int m, int n) {
		return auxuniquePathsRec(m - 1, n - 1);

	}

	private int auxuniquePathsRec(int i, int j) {

		if (i < 0 || j < 0)
			return 0;
		if (i == 0 && j == 0) {
			return 1;
		}
		int up = auxuniquePathsRec(i - 1, j);
		int left = auxuniquePathsRec(i, j - 1);
		return up + left;
	}

	// Recursion + memory
	public int uniquePathsRecMem(int m, int n) {
		if (m <= 0 || n <= 0)
			return 0;
		if (m == 1 || n == 1)
			return 1;
		int[][] mem = new int[m + 1][n + 1];
		return auxuniquePathsRecMem(m, n, mem);

	}

	private int auxuniquePathsRecMem(int i, int j, int[][] mem) {

		if (i < 1 || j < 1)
			return 0;
		if (i == 1 && j == 1) {
			return 1;
		}
		if (mem[i][j] != 0)
			return mem[i][j];
		int up = auxuniquePathsRecMem(i - 1, j, mem);
		int left = auxuniquePathsRecMem(i, j - 1, mem);
		return mem[i][j] = up + left;
	}

	public int uniquePaths1(int m, int n) {
		if (m <= 0 || n <= 0)
			return 0;
		if (m == 1 || n == 1)
			return 1;
		int[][] mem = new int[m + 1][n + 1];
		mem[1][1] = 1;
		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (i == 1 && j == 1)
					continue;
				int up = mem[i][j - 1];
				int left = mem[i - 1][j];
				mem[i][j] = up + left;
			}
		}

		return mem[m][n];
	}

	public static void main(String[] args) {
		UniquePaths unq = new UniquePaths();
		System.out.println(unq.uniquePathsRecMem(0, 5));
		System.out.println(unq.uniquePaths1(0, 5));
		System.out.println(unq.uniquePaths(5, 5));
		System.out.println(unq.uniquePathsRec(5, 5));

	}

}
