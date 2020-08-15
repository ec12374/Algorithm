public class BinarySearch {

	public static boolean search(int[] arr, int input) {

		boolean isFound = false;

		if (arr == null || arr.length < 1)
			return false;
		else if (input == arr[0] || input == arr[arr.length - 1])
			return true;
		else if (input < arr[0] || input > arr[arr.length - 1])
			return false;

		isFound = searchHelper(arr, 0, arr.length - 1, input);

		return isFound;
	}

	private static boolean searchHelper(int[] arr, int low, int high, int input) {

		if (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == input)
				return true;

			if (input < arr[mid])
				return searchHelper(arr, low, mid - 1, input);

			return searchHelper(arr, mid + 1, high, input);

		}

		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 6, 8, 15, 16, 23, 42 };

		System.out.println(BinarySearch.search(arr, 41));
	}

}
