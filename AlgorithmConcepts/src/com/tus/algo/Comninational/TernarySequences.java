package com.tus.algo.Comninational;

import java.util.Arrays;

// Ternary numbers-0,1,2

public class TernarySequences {

	// using iterative methods- for loops but here problem is no of for loop
	// in java we can't generate for loop by any function....
	// depending on the length of sequence. we have to use for loops manually
	public void ternaryAll1(int n) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; i++) {
				for (int k = 0; k < 3; i++) {
					for (int l = 0; l < 3; i++) {
						System.out.println(i + "" + j + "" + k + "" + l);
					}
				}
			}
		}
	}
  //TC= (3^k) --- k- given length
	// SC=O(k)
	public void ternaryAllRecursive(int n) {
		if(n<0){
			System.out.println("Please enter a valid no to generate sequence");
		}
		else{
		int[] out = new int[n];
		auxternarySequences(0, n, out);
		}
	}

	private void auxternarySequences(int d, int n, int[] out) {
		if (d == n) {
			System.out.println(Arrays.toString(out));
			return;
		}

		for (int i = 0; i <3; i++) {
			out[d] = i;
			auxternarySequences(d + 1, n, out);
		}
	}

	public static void main(String[] args) {
		
		TernarySequences tsq = new TernarySequences();
		int n = Integer.parseInt(args[0]);
		tsq.ternaryAllRecursive(n);
		

	}

}
