package com.ds;

public class InsertionSortTest {

	public static void main(String[] args) {
		int[] arrTest = { 34, -10, 90, 40, 36, 66, 55, -8 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrTest.length; firstUnsortedIndex++) {
			int newElement = arrTest[firstUnsortedIndex];
			int i;
			for (i = firstUnsortedIndex; i > 0 && arrTest[i - 1] > newElement; i--) {
				arrTest[i] = arrTest[i - 1];
			}
			arrTest[i] = newElement;
		}

		for (int i = 0; i < arrTest.length - 1; i++) {
			System.out.print(arrTest[i] + " ");
		}

	}

}
