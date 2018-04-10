package com.tus.begining_phase.coding;

import java.util.Arrays;
import java.util.Random;

public class MinimumDifferences {

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

	public static int minDiffAllpossibleCompares(int[] in1, int[] in2) {

		int mini = Integer.MAX_VALUE;
		for (int i = 0; i <= in1.length - 1; i++) {
			for (int j = 0; j <= in2.length - 1; j++) {

				int diff = Math.abs(in1[i] - in2[j]);
				mini = Math.min(mini, diff);
			}
		}

		return mini;
	}

	public static int minDiffWithSorting(int[] in1, int[] in2) {

		int min = Integer.MAX_VALUE;
		int i = 0, j = 0;
		Arrays.sort(in1);
		System.out.println(Arrays.toString(in1));
		Arrays.sort(in2);
		System.out.println(Arrays.toString(in2));
		int diff = 0;

		while (i < in1.length && j < in2.length) {

			if (in1[i] < in2[j]) {
				diff = Math.abs(in1[i] - in2[j]);
				min = Math.min(min, diff);
				++i;

			} else if (in1[i] > in2[j]) {
				diff = Math.abs(in1[i] - in2[j]);
				min = Math.min(min, diff);
				++j;
			} else {
				// ++i;
				// ++j;
				return 0;
			}

		}

		return min;
	}

	public static void main(String[] args) {
		 int n1 = Integer.parseInt(args[0]); // variable for setting the
		// length

		//int n2 = Integer.parseInt(args[1]); // variable for setting the
		// length
		// System.out.println("argr length = "+ args.length);
		
		  int[] in1 = new int[n1]; 
		  //int[] in2 = new int[n2];
		  
		 Random r = new Random();
		 
		  for (int i = 0; i < in1.length; i++) { 
			  in1[i] = r.nextInt(n1); }
		  //for (int j = 0; j < in2.length; j++) { 
			  //in2[j] = r.nextInt(n2); }
		 
		//int[] in1 = { 15, 45, 74, 22, 12, 4 };
		// int[] in2 = {111,145,42,73,5,18};
		System.out.println(Arrays.toString(in1));
		// System.out.println(Arrays.toString(in2));
		// System.out.println("Minimum differences bw two numbers is: "+minDiffAllpossibleCompares(in1,
		// in2));
		// System.out.println("Minimum differences bw two numbers is: "
		// + minDiffWithSorting(in1, in2));
		System.out.println("Is number avilable in array: "
				+ binarySearch(in1,6));

	}

}
