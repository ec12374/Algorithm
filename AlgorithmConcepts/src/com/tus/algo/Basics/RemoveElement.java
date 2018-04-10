package com.tus.algo.Basics;

import java.util.Arrays;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int size = nums.length;
		for (int i = 0; i < nums.length; ++i) {
			if ((val - nums[i]) == 0) {
				size = size - 1;
			}
		}
		return size;
	}

	public int[] removeElement1(int[] nums, int val) {
		int size = nums.length;
		int j = nums.length - 1;
		int i = 0;
		while (i <= j) {
			if (nums[i] == val && nums[j] == val) {
				j = j - 1;
				size = size - 1;
			} else if ((nums[i] == val) && (nums[j] != val)) {
				System.out.println(nums[j]);
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				System.out.println(nums[i] + " " + nums[j]);
				size = size - 1;
				i = i + 1;
				j = j - 1;
			} else if (nums[i] != val && nums[j] == val) {
				i = i + 1;
			} else {
				i = i + 1;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		RemoveElement rmv = new RemoveElement();
		int[] nums = { 1, 2, 3, 4 };
		// System.out.println(rmv.removeElement1(nums, 2));
		System.out.println(Arrays.toString(rmv.removeElement1(nums, 2)));
	}

}
