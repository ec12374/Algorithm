package com.tus.algo.StringProblems;

public class LongestCommonSubsequence {

	// TC=O(2^(m+n))
	// SC=O(m+n)
	public int lcs1(String s1, String s2) {
		return auxlcs1(s1.length(), s2.length(), s1, s2);
	}

	public int auxlcs1(int i, int j, String s1, String s2) {

		if (i == 0 || j == 0)
			return 0;
		if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
			return auxlcs1(i - 1, j - 1, s1, s2) + 1;
		} else {

			int rmov2 = auxlcs1(i, j - 1, s1, s2);
			int rmov1 = auxlcs1(i - 1, j, s1, s2);
			return Math.max(rmov1, rmov2);
		}

	}

	// TC=O(mn)
	// SC=O(mn)
	// Recursion+memorization
	public int lcs2(String s1, String s2) {
		int[][] mem = new int[s1.length() + 1][s2.length() + 1];
		return auxlcs2(s1.length(), s2.length(), s1, s2, mem);
	}

	public int auxlcs2(int i, int j, String s1, String s2, int[][] mem) {

		if (i == 0 || j == 0)
			return 0;
		if (mem[i][j] != 0)
			return mem[i][j];
		if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
			return mem[i][j] = auxlcs1(i - 1, j - 1, s1, s2) + 1;
		} else {

			int rmov2 = auxlcs1(i, j - 1, s1, s2);
			int rmov1 = auxlcs1(i - 1, j, s1, s2);
			return mem[i][j] = Math.max(rmov1, rmov2);
		}

	}

	// TC=O(mn)
	// SC=O(mn)
	// DP
	public int lcs3(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] mem = new int[m + 1][n + 1];
		for (int i = 0; i <= m; ++i) {
			mem[i][0] = 0;
		}
		for (int j = 1; j <= n; ++j) {
			mem[0][j] = 0;
		}
		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					mem[i][j] = mem[i - 1][j - 1] + 1;
				} else {
					int rmov2 = mem[i][j - 1];
					int rmov1 = mem[i - 1][j];
					mem[i][j] = Math.max(rmov2, rmov1);

				}
			}
		}
		return mem[m][n];
	}

	public static void main(String[] args) {
		LongestCommonSubsequence lsq = new LongestCommonSubsequence();

		System.out.println(lsq.lcs1("nmcqgr", "qmgrl"));
		System.out.println(lsq.lcs2("nmcqgr", "qmgrl"));
		System.out.println(lsq.lcs3("abc","abc"));

	}

}
