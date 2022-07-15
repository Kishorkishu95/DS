package com.ds;

public class EmployeeLinkedList {
	private EmployeeNode head;
	private int size;
	private EmployeeNode tail;

	public void addToFront(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeNode node = new EmployeeNode(employee);
	
		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head = node;
		size++;

	}

	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmptyTest() {
		return head == null;
	}

	public EmployeeNode removeFromFront() {
		if (isEmptyTest()) {
			return null;
		}
		EmployeeNode removeNode = head;
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}

	public EmployeeNode removeFromEnd() {
		if (isEmptyTest()) {
			return null;
		}
		EmployeeNode removedNode = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while (current != null) {
			System.out.print(current);
			System.out.println(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public boolean addBefore(Employee newEmployee, Employee existingEmployee) {
		if(head==null) {
			return false;
		}
		EmployeeNode current=head;
		while(current!=null && !current.getEmployee().equals(existingEmployee)) {
			current=current.getNext();
		}
		if(current==null) {
			return false;
		}
		EmployeeNode newNode=new EmployeeNode(newEmployee);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);
		if(head==current) {
			head=newNode;
		}
		else {
			newNode.getPrevious().setNext(newNode);
		}
		size++;
		
		return true;
		
	}

}
