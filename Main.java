package com.ds.tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree intTree=new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
//		intTree.traverseInOrder();
//		System.out.println();
//		System.out.println("Find the value : "+intTree.get(29));
//		System.out.println("Find the value : "+intTree.get(0));
//		System.out.println("Min is :"+intTree.min());
//		System.out.println("Max is :"+intTree.max());
//		intTree.delete(15);
//		intTree.traverseInOrder();
//		System.out.println();
		intTree.delete(29);
		intTree.traverseInOrder();

	}

}
