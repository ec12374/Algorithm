package com.tus.begining_phase.coding;

import java.util.Arrays;

public class SearchOperations {
	public static boolean binarySearch(int[] in1, int target) {

		Arrays.sort(in1);
		System.out.println(Arrays.toString(in1));
		int l = 0;
		int r = in1.length - 1;
		
		while (l <= r) {
			int mid = (l + r) / 2;
			if (target == in1[mid])
				return true;
			if (target > in1[mid]) 
				l = mid+1;
			 else 
				r = mid-1;
			
		}
		return false;
	}

	public static void main(String[] args) {
		


	}

}
