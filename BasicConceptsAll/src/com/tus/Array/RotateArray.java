package com.tus.Array;

import java.util.Arrays;

public class RotateArray {

	public void rotate(int[] nums, int k) {
		if (k >= 0) {
			int m = 1;
			while (m <= k) {
				int temp = nums[nums.length - 1];
				for (int i = nums.length - 1; i > 0; i--) {
					nums[i] = nums[i - 1];
				}
				nums[0] = temp;
				m++;
			}
			System.out.println(Arrays.toString(nums));
		} else
			System.out.println("0");
		return;

	}

	public void rotate1(int[] nums, int k) {
		if (k >= 0) {
			int[] dup = new int[nums.length];

			for (int i = 0; i < nums.length; i++) {
				dup[(i + k) % nums.length] = nums[i];
			}
			for(int j=0;j<dup.length;j++){
				nums[j]=dup[j];
			}
			System.out.println(Arrays.toString(nums));
		} else
			System.out.println("0");
		return;

	}

	public static void main(String[] args) {

		RotateArray rta = new RotateArray();
		int[] nums = { 1,2,3,4,5,6,7,8};
		rta.rotate(nums, 5);
	}

}
