package com.ds;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { -2, 5, 8, 22, 90, 45, 34 };

		for (int val : intArray) {
			System.out.print(val + " ");
		}
		System.out.println();
		int[] clonedArray = intArray.clone();

		for (int val : clonedArray) {
			System.out.print(val + " ");
		}

	}

}
