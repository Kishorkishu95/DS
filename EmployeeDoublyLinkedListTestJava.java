package com.ds;

public class EmployeeDoublyLinkedListTestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(0, "Kishu", "SDE1");
		Employee e2 = new Employee(1, "Sandy", "SDE2");
		Employee e3 = new Employee(2, "John", "SDE2");
		
		EmployeeLinkedList linkedList=new EmployeeLinkedList();
		linkedList.addToFront(e1);
		linkedList.addToFront(e2);
		linkedList.addToFront(e3);
//		linkedList.printList();
		System.out.println(linkedList.getSize());
		Employee e4 = new Employee(3, "BillEnd", "SDE2");
		linkedList.addToEnd(e4);
//		linkedList.printList();
		System.out.println(linkedList.getSize());
		linkedList.removeFromFront();
//		linkedList.printList();
		linkedList.removeFromEnd();
//		linkedList.printList();
		linkedList.addBefore(e2, e1);
//		linkedList.printList();
		linkedList.addBefore(new Employee(5, "Jason", "SDE3"), e1);
		linkedList.printList();
		
		
		
		

	}

}
