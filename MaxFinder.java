package com.ds;

public class MaxFinder {

	public static void main(String[] args) {
		int[] intArray = { -2, 5, 8, 22, 90, 45, 34 };
		System.out.println("Max of an array is :" + maxFinder(intArray));

	}

	private static int maxFinder(int[] intArray) {
		int maxValue = intArray[0];
		for (int val : intArray) {
			if (val > maxValue) {
				maxValue = val;
			}
		}
		return maxValue;
	}

}
