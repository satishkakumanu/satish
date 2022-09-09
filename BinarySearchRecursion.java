package sep5;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 7, 9, 15, 20, 34 };

		int x = 11;
		int result = binarysearch(arr, x);
		if (result == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element found  " + result);
		}

	}

	private static int binarysearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				return mid;

			}
			if (arr[mid] < x) {
				low = mid + 1;

			} else {
				high = mid - 1;

			}
			

		}
		return -1;

	}
	
	main
}
