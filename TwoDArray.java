package com.ds;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] intArray = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				System.out.print(intArray[i][j]);
			}
			System.out.println();
		}

	}

}
