package com.ds.tree;

public class TreeNode {
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int data) {
		super();
		this.data = data;
	}
	
	public int min() {
		if(leftChild==null) {
			return data;
		}
		return leftChild.min();
	}
	
	public int max() {
		if(rightChild==null) {
			return data;
		}
		return rightChild.max();
	}

	public TreeNode get(int val) {
		if (val == data) {
			return this;
		}
		if (val < data) {
			if (leftChild != null) {
				return leftChild.get(val);
			}
		} else {
			if (rightChild != null) {
				return rightChild.get(val);
			}
		}
		return null;

	}

	public void insert(int value) {
		if (value == data) {
			return;
		} else if (value < data) {
			if (leftChild == null) {
				leftChild = new TreeNode(value);
			} else {
				leftChild.insert(value);
			}

		} else {
			if (rightChild == null) {
				rightChild = new TreeNode(value);
			} else {
				rightChild.insert(value);
			}
		}
	}

	public void traverseInOrder() {
		if (leftChild != null) {
			leftChild.traverseInOrder();
		}
		System.out.print(data + ", ");
		if (rightChild != null) {
			rightChild.traverseInOrder();
		}

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	
	

}
