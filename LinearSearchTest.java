package com.ds;

public class LinearSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrTest = { 34, -10, 90, 40, 36, 66, 55, -8 };
		System.out.println("The index is : "+linearSearchAlgo(arrTest, -1));

	}

	private static int linearSearchAlgo(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;

	}

}
