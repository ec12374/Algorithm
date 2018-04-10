package com.tus.algo.StringProblems;

public class PalindromicPartition {

	public void palPartition(String str) {

		auxpalpartition(str, "");
	}

	private void auxpalpartition(String str, String res) {

		if (str.length() == 0) {
			System.out.println(res);
			return;
		}

		for (int i = 0; i < str.length(); ++i) {
			String tmp = str.substring(0, i + 1);
			if (isPalindrome(tmp))
				auxpalpartition(str.substring(i + 1), res + " " + tmp);
		}
	}

	private boolean isPalindrome(String tmp) {
		int i = 0;
		int j = tmp.length() - 1;
		while (i < j) {
			if (tmp.charAt(i) != tmp.charAt(j))
				return false;
			++i;
			--j;
		}

		return true;
	}

	public static void main(String[] args) {

		PalindromicPartition ppt = new PalindromicPartition();
		String str = "aabac";
		ppt.palPartition(str);

	}

}
