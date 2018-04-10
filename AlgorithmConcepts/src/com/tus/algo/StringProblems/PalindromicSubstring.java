package com.tus.algo.StringProblems;

import java.util.Arrays;

public class PalindromicSubstring {

	// Adhoc method:
	// TC: O(n^3)=======n^2 for generating substring and n for verifying
	// palindrome (n*n*n)
	// SC: O(1)
	public int longestPalSubString1(String str) {
		int max = 0;

		for (int i = 0; i < str.length(); ++i) {
			for (int j = i; j < str.length(); ++j) {
				String tmp = str.substring(i, j + 1);
				// System.out.println(tmp);
				if (isPalindrome(tmp)) {
					System.out.println(tmp);
					max = Math.max(max, j - i + 1);
				}
			}
		}

		return max;
	}

	private boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length();
		while (i < j) {
			if (str.charAt(i) != str.charAt(j - 1))
				return false;
			++i;
			--j;
		}

		return true;
	}

	// Dynamic programming
    //TC: O(n^2)
	//SC: O(n^2)-->O(n)
	public int longestPalSubString2(String str) {
		int max = 1;
		int n = str.length();
		boolean[][] mem = new boolean[n + 1][n + 1];

		for (int i = 1; i <= n; ++i) {
			mem[i][i] = true;
		}
		for (int i = n - 1; i >= 1; --i) {
			for (int j = i + 1; j <= n; ++j) {

				if (str.charAt(i - 1) == str.charAt(j - 1)) {
					mem[i][j] = mem[i + 1][j - 1];
					if (mem[i][j] == true)
						max = Math.max(max, j - i + 1);
				} else
					mem[i][j] = false;
			}

		}

		printMemory(mem);
		return max;
	}

	private void printMemory(boolean[][] mem) {
		for (boolean[] tmp : mem)
			System.out.println(Arrays.toString(tmp));
	}

	public static void main(String[] args) {
		PalindromicSubstring pst = new PalindromicSubstring();
		String str = "abcbb";
		System.out.println(pst.longestPalSubString2(str));
	}

}
