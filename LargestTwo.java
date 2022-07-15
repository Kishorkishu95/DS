package com.ds;

public class LargestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int n = arr.length;
		printTwolargest(arr, n);

	}

	private static void printTwolargest(int[] arr, int n) {
		// TODO Auto-generated method stub
		int i, first, second;
		if (n < 2) {
			System.out.println("Invalid input.");
			return;
		}
		first = second = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			System.out.println("There is no second largest value.");
		} else {
			System.out.println("The second largest value " + second);
		}

	}

}
