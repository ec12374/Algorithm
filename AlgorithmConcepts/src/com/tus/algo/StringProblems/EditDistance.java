package com.tus.algo.StringProblems;

public class EditDistance {

	// TC= O(3^(m+n))
	// SC= O(m+n)
	public int editdistance1(String s1, String s2) {
		return auxeditdistance1(s1.length(), s2.length(), s1, s2);
	}

	private int auxeditdistance1(int i, int j, String s1, String s2) {
		if (i == 0)
			return j;
		if (j == 0)
			return i;

		if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
			return auxeditdistance1(i - 1, j - 1, s1, s2);
		} else {
			int replace = auxeditdistance1(i - 1, j - 1, s1, s2);
			int insert = auxeditdistance1(i, j - 1, s1, s2);
			int delete = auxeditdistance1(i - 1, j, s1, s2);

			return Math.min(insert, Math.min(replace, delete)) + 1;
		}
	}

	// TC=O(mn)
	// SC=O(mn)
	// Recursion +memory
	public int editdistance2(String word1, String word2) {
		int[][] mem = new int[word1.length() + 1][word2.length() + 1];
		return auxeditdistance2(word1.length(), word2.length(), word1, word2,
				mem);
	}

	private int auxeditdistance2(int i, int j, String s1, String s2, int[][] mem) {
		if (i == 0)
			return j;
		if (j == 0)
			return i;
		if (mem[i][j] != 0)
			return mem[i][j];
		if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
			return mem[i][j] = auxeditdistance2(i - 1, j - 1, s1, s2, mem);
		} else {
			int replace = auxeditdistance2(i - 1, j - 1, s1, s2, mem);
			int insert = auxeditdistance2(i, j - 1, s1, s2, mem);
			int delete = auxeditdistance2(i - 1, j, s1, s2, mem);

			return mem[i][j] = Math.min(insert, Math.min(replace, delete)) + 1;
		}

	}

	// TC=O(mn)
	// SC=O(mn)
	// Dynamic programming
	public int editdistance3(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] mem = new int[m + 1][n + 1];

		for (int i = 0; i <= m; ++i) {
			mem[i][0] = i;
		}
		for (int j = 1; j <= n; ++j) {
			mem[0][j] = j;
		}
		for (int i = 1; i <= m; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					mem[i][j] = mem[i - 1][j - 1];
				} else {
					int replace = mem[i - 1][j - 1];
					int insert = mem[i][j - 1];
					int delete = mem[i - 1][j];

					mem[i][j] = Math.min(insert, Math.min(replace, delete)) + 1;
				}
			}
		}

		return mem[m][n];
	}

	public int editdistance4(String s1, String s2) {
		// int m = s1.length();
		// int n = s2.length();
		int[][] mem = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i <= s1.length(); ++i) {
			mem[i][0] = i;
		}
		for (int j = 1; j <= s2.length(); ++j) {
			mem[0][j] = j;
		}
		for (int i = 1; i <= s1.length(); ++i) {
			for (int j = 1; j <= s2.length(); ++j) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					mem[i][j] = mem[i - 1][j - 1];
				} else {
					mem[i][j] = Math.min(mem[i - 1][j - 1],
							Math.min(mem[i][j - 1], mem[i - 1][j])) + 1;
				}
			}
		}

		return mem[s1.length()][s2.length()];
	}

	public static void main(String[] args) {
		EditDistance edt = new EditDistance();
		System.out.println(edt.editdistance1("abc", "abdc"));
		System.out.println(edt.editdistance2("abc", "abdc"));
		System.out.println(edt.editdistance3("abc", "abc"));
		System.out.println(edt.editdistance4("abc", "abc"));
	}

}
