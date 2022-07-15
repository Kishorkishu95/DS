package com.ds;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrTest = { -34, -10, 20, 40, 56, 66, 95, 99 };
		System.out.println("The index is : " + binarySearchAlgo(arrTest, 20));

	}

	private static int binarySearchAlgo(int[] arr, int val) {
		int start = 0;
		int end = arr.length - 1;
		for (int i = 0; i < arr.length - 1; i++) {
			int mid = (start + end) / 2;
			if (arr[mid] == val) {
				return mid;
			} else if (arr[mid] > val) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

}
