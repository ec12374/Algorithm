package com.tus.MergeSort;

public class MergeSorTing {

	// TC: O(NlogN)
	// SC: O(N)
	
	public int[] mergeSorting(int[] input) {

		mergeSort(input, 0, input.length - 1);
		return input;
	}

	private void mergeSort(int[] arr, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			//System.out.println("lower index: " + low + " mid index: " + mid + " higher index: " + high);
			merging(arr, low, mid, high);

		}
		return;
	}

	private void merging(int[] arr, int low, int mid, int high) {

		int[] arr1 = new int[mid - low + 1];
		int[] arr2 = new int[high - mid];

		for (int i = 0; i < (mid - low + 1); ++i) {

			arr1[i] = arr[low + i];
		}

		for (int j = 0; j < (high - mid); ++j) {

			arr2[j] = arr[j + mid + 1];
		}

		int i = 0, j = 0;
		int k = low;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {

				arr[k] = arr1[i];
				++i;
			}

			else {
				arr[k] = arr2[j];
				++j;
			}

			++k;
		}

		while (i < arr1.length) {
			arr[k] = arr1[i];
			++i;
			++k;
		}

		while (j < arr2.length) {

			arr[k] = arr2[j];
			++j;
			++k;

		}

	}

	public static void main(String[] args) {

		MergeSorting sorting = new MergeSorting();

		int[] arr = { 31, 8, 2, 9, 0, 10 };
		int[] arr1 = { 0 };
		int[] arr2 = {};
		int[] arr3 ={2,010};

		System.out.println(Arrays.toString(arr3));

		System.out.println("After merge sort ");

		System.out.println(Arrays.toString(sorting.mergeSorting(arr3)));

	}

}
