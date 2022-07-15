package com.ds;

public class ArrayElemsSum {

	public static void main(String[] args) {
		int[] intArray = { -2, 5, 8, 22, 90, 45, 34 };
		System.out.println("sum of array elements is : " + sumArrayElems(intArray));

	}

	private static int sumArrayElems(int[] intArray) {
		int sum = 0;
		for (int v : intArray) {
			sum += v;
		}
		return sum;
	}

}
