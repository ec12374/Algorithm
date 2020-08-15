import java.util.Arrays;

public class ElementOccurenceInSortedArray {

	/*
	 * 1- Find the number of occurrences of an element in a sorted array Ex- 1 -
	 * Input: arr = [4, 4, 8, 8, 8, 15, 16, 23, 23, 42], target = 8 Output: 3 Ex
	 * -2 - Input: arr = [3, 5, 5, 5, 5, 7, 8, 8], target = 6 Output: 0
	 * 
	 * Expected O(logn) time solution.
	 * 
	 * 
	 * 
	 * 
	 */

	// TC ~ O(n)
	public int elementOccurrence1(int[] arr, int input) {

		if (arr == null || arr.length == 0)
			return 0;
		int count = 0;

		for (int i = 0; i < arr.length; ++i) {

			if (arr[i] > input)
				break;

			if (arr[i] == input)
				++count;

		}

		return count;
	}

	public int elementOccurrence(int[] arr, int input) {

		int[] result = new int[2];
		int index = -1;
		int count = 0;
		int arrayLength = arr.length;
		index = isElementPresent(arr, 0, arrayLength - 1, input);

		if (index == -1)
			return 0;
		System.out.println("Index value is: " + index);
		int i = index - 1;
		int j = index + 1;
		++count;

		while (i >= 0) {

			if (arr[i] < input)
				break;
			++count;
			--i;

		}
       result[0]=i;
		while (j < arrayLength) {

			if (arr[j] > input)
				break;
			++count;
			++j;
		}
      result[1]=j;
      System.out.println(Arrays.toString(result));
		return count;
	}

	private int isElementPresent(int[] arr, int low, int high, int input) {
		if (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == input)
				return mid;

			if (input < arr[mid])
				return isElementPresent(arr, low, mid - 1, input);

			return isElementPresent(arr, mid + 1, high, input);

		}

		return -1;

	}

	public static void main(String[] args) {

		ElementOccurenceInSortedArray occurence = new ElementOccurenceInSortedArray();

		int[] arr = { -2, 4, 8, 8, 8, 15, 16, 23, 23, 42 };

		System.out.println(occurence.elementOccurrence(arr, 8));

	}

}
