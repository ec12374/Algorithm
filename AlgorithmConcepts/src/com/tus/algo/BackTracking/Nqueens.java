package com.tus.algo.BackTracking;

import java.util.Arrays;

public class Nqueens {

	public void nqueens(int n){
		int[] out = new int[n];
		auxNqueens(0,n,out);
	}
	
	private void auxNqueens(int d,int n,int[] out){
		
		if(d==n){
			
			System.out.println(Arrays.toString(out));
			return;
			
		}
		for(int column=0;column<n;column++){
			out[d]=column;
			auxNqueens(d+1, n, out);
		}
	}
	public void isValid(int[] out){
		for(int i = 0; i < out.length; ++i) {
			System.out.println(i + "," + out[i]);
		}
		return ;
	}
	public static void main(String[] args) {
		Nqueens nq= new Nqueens();
		int[] out={0,0,0,0}; 
		nq.nqueens(2);

	}

}
