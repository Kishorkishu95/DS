package com.ds;

public class ArraysTest {

	public static void main(String[] args) {
		int[] arrayTest=new int[7];
		arrayTest[0]=05;
		arrayTest[1]=15;
		arrayTest[2]=25;
		arrayTest[3]=35;
		arrayTest[4]=45;
		arrayTest[5]=55;
		arrayTest[6]=65;
		int index=-1;
		for(int i=0; i<arrayTest.length; i++) {
//		System.out.print(arrayTest[i]+" ");
			if(arrayTest[i]==35) {
				index=i;
				break;
				
			}
			
		}
		System.out.println("Index is :"+index);

	}

}
