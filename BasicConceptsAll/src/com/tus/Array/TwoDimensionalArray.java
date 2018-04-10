package com.tus.Array;

import java.util.Arrays;

public class TwoDimensionalArray {

	public void TwoDarray(int n){
		int[][] marks= new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				marks[i][j]= i+1;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(marks[i][j]+" ");
			}
			//System.out.print("]");
			System.out.println();
		}
		System.out.println(Arrays.deepToString(marks));
	}
	
	public static void main(String[] args) {
		TwoDimensionalArray arr = new TwoDimensionalArray();
	     arr.TwoDarray(3);
	     

	}

}
