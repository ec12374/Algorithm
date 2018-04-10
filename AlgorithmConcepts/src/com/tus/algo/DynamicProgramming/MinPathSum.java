package com.tus.algo.DynamicProgramming;

public class MinPathSum {

	// Recursion
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int column = grid[0].length;
		return auxminPathSum(row - 1, column - 1, grid);

	}

	private int auxminPathSum(int i, int j, int[][] grid) {
		if (i == 0 && j == 0)
			return grid[0][0];
		if (i < 0 || j < 0)
			return Integer.MAX_VALUE;

		int up = auxminPathSum(i - 1, j, grid);
		int left = auxminPathSum(i, j - 1, grid);
		return Math.min(up, left) + grid[i][j];

	}
// Recursion +Memory
	public int minPathSum1(int[][] grid) {
		int row = grid.length;
		int column = grid[0].length;
		if(row<=0||column<=0)return 0;
		int[][] mem = new int[row + 1][column + 1];
		return auxminPathSum1(row, column, grid, mem);

	}

	private int auxminPathSum1(int i, int j, int[][] grid, int[][] mem) {
		if (i == 1 && j == 1)
			return grid[0][0];
		if (i < 1 || j < 1)
			return Integer.MAX_VALUE;
		if (mem[i][j] != 0)
			return mem[i][j];

		int up = auxminPathSum1(i - 1, j, grid, mem);
		int left = auxminPathSum1(i, j - 1, grid, mem);
		return mem[i][j] = Math.min(up, left) + grid[i-1][j-1];

	}
    //DP
	public int minimumPathSum(int[][] grid){
		int row=grid.length;
		int column=grid[0].length;
		if (grid.length <= 0 || grid[0].length <= 0)
			return 0;
		int[][] mem = new int[grid.length + 1][grid[0].length + 1];
		mem[1][1] = grid[0][0];
		for (int i = 0; i <= column; ++i) {
			mem[0][i] = Integer.MAX_VALUE;
		}
		for (int j = 1; j <= row; ++j) {
			mem[j][0] = Integer.MAX_VALUE;
		}
		for (int i = 1; i <= grid.length; ++i) {
			for (int j = 1; j <= grid[0].length; ++j) {
				if (i == 1 && j == 1)
					continue;
				mem[i][j] = Math.min(mem[i - 1][j], mem[i][j - 1])
						+ grid[i - 1][j - 1];
			}
		}

		return mem[grid.length][grid[0].length];
	}
	//DP====perfect dp
	public int minPathsum(int[][] grid){
		//int row=grid.length;
		//int column= grid[0].length;
		int[][] mem = new int[grid.length][grid[0].length];
		mem[0][0] = grid[0][0];
		for (int i = 1; i < grid[0].length; ++i) {
			mem[0][i] = grid[0][i]+mem[0][i-1];
		}
		for (int i = 1; i <grid.length ; ++i) {
			mem[i][0] = grid[i][0]+mem[i-1][0];
		}
		for (int i = 1; i < grid.length; ++i) {
			for (int j = 1; j < grid[0].length; ++j) {
				mem[i][j] = Math.min(mem[i - 1][j], mem[i][j - 1])
						+ grid[i][j];
			}
		}

		return mem[grid.length-1][grid[0].length-1];
	}
	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 5  },{3,2,1}}; 
				         
		MinPathSum min = new MinPathSum();
		System.out.println(min.minPathSum(grid));
		System.out.println(min.minPathSum1(grid));
		System.out.println(min.minimumPathSum(grid));
		System.out.println(min.minPathsum(grid));

	}

}
