package com.ds;

public class LinkedListTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(0, "Kishu", "SDE1");
		Employee e2 = new Employee(1, "Sandy", "SDE2");
		Employee e3 = new Employee(2, "John", "SDE2");
		EmployeeLinkedList linkedList = new EmployeeLinkedList();
		System.out.println("Test is linked list empty : Before add method -> " + linkedList.isEmptyTest());
		linkedList.addToFront(e1);
		linkedList.addToFront(e2);
		linkedList.addToFront(e3);
		linkedList.printList();
		System.out.println(linkedList.getSize());
		System.out.println();
		System.out.println(linkedList.isEmptyTest());
		linkedList.removeFromFront();
		System.out.println(linkedList.getSize());
		linkedList.printList();

	}

}
