package com.ds;

public class ArrayReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = arrayReturnMethod();
		for (int val : intArray) {
			System.out.print(val + " ");
		}

	}

	private static int[] arrayReturnMethod() {

		return new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	}

}
