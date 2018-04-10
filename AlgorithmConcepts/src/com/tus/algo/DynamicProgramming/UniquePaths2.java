package com.tus.algo.DynamicProgramming;

public class UniquePaths2 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int column = obstacleGrid[0].length;
		return auxuniquePaths2(0, 0, row, column, obstacleGrid);
	}

	private int auxuniquePaths2(int i, int j, int m, int n, int[][] obstacle) {
		if (i >= m || j >= n)
			return 0;
		if (obstacle[i][j] == 1)
			return 0;
		if (i == m - 1 && j == n - 1)
			return 1;

		int right = auxuniquePaths2(i, j + 1, m, n, obstacle);
		int down = auxuniquePaths2(i + 1, j, m, n, obstacle);
		return right + down;
	}

	// Recursion from back travel
	public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int column = obstacleGrid[0].length;
		return auxuniquePaths3(row - 1, column - 1, obstacleGrid);
	}

	private int auxuniquePaths3(int i, int j, int[][] obstacle) {
		if (i < 0 || j < 0)
			return 0;
		if (obstacle[i][j] == 1)
			return 0;
		if (i == 0 && j == 0)
			return 1;

		int up = auxuniquePaths3(i - 1, j, obstacle);
		int left = auxuniquePaths3(i, j - 1, obstacle);
		return up + left;
	}

	// Recursion + memory
	public int uniquePathsWithObstacles3(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int column = obstacleGrid[0].length;
		int[][] mem = new int[row + 1][column + 1];
		return auxuniquePaths4(row, column, obstacleGrid, mem);
	}

	private int auxuniquePaths4(int i, int j, int[][] obstacle, int[][] mem) {
		if (i < 1 || j < 1)
			return 0;
		if (obstacle[i - 1][j - 1] == 1)
			return 0;
		if (i == 1 && j == 1)
			return 1;
		if (mem[i][j] != 0)
			return mem[i][j];

		int up = auxuniquePaths4(i - 1, j, obstacle, mem);
		int left = auxuniquePaths4(i, j - 1, obstacle, mem);
		return mem[i][j] = up + left;
	}
public int uniquePathsWithObstacles4(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int column = obstacleGrid[0].length;
		int[][] mem = new int[row + 1][column + 1];
		mem[1][1] = 1;
		for (int i = 1; i <= row; ++i) {
			for (int j = 1; j <= column; ++j) {

				if (obstacleGrid[i - 1][j - 1] == 1) {
					mem[i][j] = 0;
					continue;
				}
				if (i == 1 && j == 1)
					continue;
				int up = mem[i - 1][j];
				int left = mem[i][j - 1];
				mem[i][j] = up + left;
			}
		}
		return mem[row][column];
        
    }
	public static void main(String[] args) {

		int[][] obstacleGrid = { { 0, 0, 0,0,0}, 
				                 { 0, 0, 0,0,0 }, 
				                 { 0, 0, 0,0,0 } };
		UniquePaths2 unq = new UniquePaths2();
		System.out.println(unq.uniquePathsWithObstacles(obstacleGrid));
		System.out.println(unq.uniquePathsWithObstacles2(obstacleGrid));
		System.out.println(unq.uniquePathsWithObstacles3(obstacleGrid));
		System.out.println(unq.uniquePathsWithObstacles4(obstacleGrid));

	}

}
