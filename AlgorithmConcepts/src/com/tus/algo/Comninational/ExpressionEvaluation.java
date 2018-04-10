package com.tus.algo.Comninational;

/*You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

 Find out how many ways to assign symbols to make sum of integers equal to target S.

 Example 1:
 Input: nums is [1, 1, 1, 1, 1], S is 3. 
 Output: 5
 Explanation: 

 -1+1+1+1+1 = 3
 +1-1+1+1+1 = 3
 +1+1-1+1+1 = 3
 +1+1+1-1+1 = 3
 +1+1+1+1-1 = 3

 There are 5 ways to assign symbols to make the sum of nums be target 3.

 Note:
 The length of the given array is positive and will not exceed 20.
 The sum of elements in the given array will not exceed 1000.
 Your output answer is guaranteed to be fitted in a 32-bit integer.

 */

// TO-DO---- with dynamic programming
class MyInteger1 {
	int value;

	public MyInteger1(int value) {
		this.value = value;
	}

	public int get() {
		return value;
	}

	public void set(int value) {
		this.value = value;
	}
}

public class ExpressionEvaluation {

	public int findTargetSumWays(int[] nums, int S) {
		MyInteger1 count = new MyInteger1(0);
		auxExpressionEvaluation(0, 0, nums, S, count);
		return count.get();
	}

	private void auxExpressionEvaluation(int d, int sum, int[] nums, int S,
			MyInteger1 count) {

		if (d == nums.length) {
			if (sum == S)
				count.set(count.get() + 1);
			return;
		}

		auxExpressionEvaluation(d + 1, sum + nums[d], nums, S, count);
		auxExpressionEvaluation(d + 1, sum - nums[d], nums, S, count);

	}

	/*
	 * public static int exprEvaluation1(int[] in, int s) { MyInteger count =
	 * new MyInteger(0); auxEvaluation1(0, in, s, count); return count.get(); }
	 * private static void auxEvaluation1(int d, int[] in, int s, MyInteger
	 * count) { if(d == in.length) { if(s == 0) count.incr(1); return; }
	 * auxEvaluation1(d+1, in, s-in[d], count); auxEvaluation1(d+1, in, s+in[d],
	 * count); }
	 */
	public static void main(String[] args) {
		ExpressionEvaluation exsp = new ExpressionEvaluation();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(exsp.findTargetSumWays(nums, 10));
	}
}
