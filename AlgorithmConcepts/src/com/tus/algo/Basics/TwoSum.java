package com.tus.algo.Basics;

import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int m = 0; m < nums.length; ++m) {
			for (int n = m + 1; n < nums.length; ++n) {
				if (target == nums[m] + nums[n]) {
					res[0] = m;
					res[1] = n;
					break;
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 1, 8, 9, 3, 6 };
		TwoSum sum = new TwoSum();
		System.out.println(Arrays.toString(sum.twoSum(nums, 9)));

	}

}
