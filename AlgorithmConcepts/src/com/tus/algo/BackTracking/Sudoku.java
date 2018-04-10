package com.tus.algo.BackTracking;

import java.util.Arrays;

public class Sudoku {

	public void SudokuAll(int n) {

		int[] out = new int[n];
		auxsudokuAll(0, n, out);
	}

	private void auxsudokuAll(int d, int n, int[] out) {
		if (d == n) {
			System.out.println(Arrays.toString(out));
			return;
		}

		for (int col = 0; col < 9; ++col) {
			out[d] = col;
			auxsudokuAll(d + 1, n, out);
		}
	}

	public boolean isValid(int[][] in) {

		for (int r = 0; r < 9; ++r) {
			for (int c = 0; c < 9; ++c) {
				for (int each = c + 1; each < 9; ++each) {
					if (in[r][c] == in[r][each])
						return false;

				}

			}
		}
		for(int c=0;c<9;++c){
			for(int r=0;r<9;++r){
				for (int each = r + 1; each < 9; ++each) {
					if (in[c][r] == in[c][each])
						return false;

				}
			}
		}
		
		int[] box = new int[9];
		int index= 0;
		
		for(int r=0;r<9;++r){
			for(int c=0;c<9;++c){
				index= (r/3)+((c/3)*3);
				box[index]+=in[r][c];
				
			}
		}
		for(int x=0;x<9;++x){
			if(box[x]!=45)return false;
		}
      
		return true;
	}

	public static void main(String[] args) {
		Sudoku sk = new Sudoku();
int[][] sudoku = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
				   { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
				   { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				   { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				   { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
				   { 7, 1, 3, 9, 2, 4, 8, 5, 6 }, 
				   { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
				   { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
				   { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

    System.out.println(sk.isValid(sudoku));
	}

}
