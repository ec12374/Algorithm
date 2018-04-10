package com.tus.algo.DynamicProgramming;

public class ClimbingStairs {

	// Pure recursion
	public int climbStairs(int n) {

		return helperClimbStairs(n);
	}

	public int helperClimbStairs(int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		int left = helperClimbStairs(n - 1);
		int right = helperClimbStairs(n - 2);
		return left + right;
	}

	// Recursion + memory
	public int climbStairs1(int n) {

		return helperClimbStairs1(n);
	}

	public int helperClimbStairs1(int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		int left = helperClimbStairs1(n - 1);
		int right = helperClimbStairs1(n - 2);
		return left + right;
	}

	// DP approach using an array
	// TC= O(n)
	// SC= O(n)
	public int climbStairsdp(int n) {
		if (n <= 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 3;
		int[] mem = new int[n + 1];
		mem[1] = 1;
		mem[2] = 2;
		mem[3] = 3;
		for (int i = 4; i <= n; ++i) {
			mem[i] = mem[i - 1] + mem[i - 2];
		}
		return mem[n];
	}

	public static void main(String[] args) {
		ClimbingStairs count = new ClimbingStairs();
		// System.out.println(count.climbStairs(100));
		System.out.println(count.climbStairsdp(-90));

	}

}
