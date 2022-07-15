package com.ds;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arrTest = { 34, -10, 90, 40, 36, 66, 55, -8 };

		for (int lastUnsortedIndex = arrTest.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest=0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (arrTest[i] > arrTest[largest]) {
					
					largest=i;
				}
			}
			swap(arrTest, lastUnsortedIndex, largest);
		}

		for (int i = 0; i < arrTest.length - 1; i++) {
			System.out.print(arrTest[i] + " ");
		}

	}

	private static void swap(int[] arr, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
