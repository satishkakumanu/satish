package sep5;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of array");
		int size = sc.nextInt();
		System.out.println("enter a array elements ");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter a search value ");
		int value = sc.nextInt();

		// int arr[] = { 1, 2, 5, 7, 9, 15, 20, 34 };
	
		// int value = 7;
		boolean h = false;
		int low = 0;
		int high = arr.length;
		int mid = 0;
		// System.out.println("high:"+arr.length);

		while (low <= high && !h && mid < arr.length) {
			System.out.println("low:" + low + "high :" + high + "mid:" + mid);
			mid = (low + high) / 2;
			if (mid < arr.length) {
				if (arr[mid] == value) {
					h = true;
					System.out.println("Element in the location:" + mid);

				} else {
					if (arr[mid] > value) {
						high = mid - 1;
						// search value is greaterthan mid value
					} else {
						low = mid + 1;
						// search value is lessthan mid value
					}
				}
			}
		}
		if (!h) {
			System.out.println("Element not found in the array");
		}
	}
}
