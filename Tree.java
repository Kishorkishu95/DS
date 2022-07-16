package com.ds.tree;

public class Tree {

	private TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}

	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}

	public TreeNode get(int val) {
		if (root != null) {
			return root.get(val);
		}
		return null;
	}
	
	public int min() {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		else {
		return root.min();
		}
	}
	
	public int max() {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		else {
		return root.max();
		}
	}
	
	public void delete(int val) {
		root=delete(root,val);
	}

	private TreeNode delete(TreeNode subtreeRoot, int val) {
		// TODO Auto-generated method stub
		if(subtreeRoot==null) {
			return subtreeRoot;
		}
		if(val<subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), val));
		}
		else if(val>subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), val));
		}
		else {
			// Case 1 and 2 :  Node to delete has zero or one children
			if(subtreeRoot.getLeftChild()==null) {
				return subtreeRoot.getRightChild();
			}
			else if(subtreeRoot.getRightChild()==null) {
				return subtreeRoot.getLeftChild();
			}
			// Case 3 : Node to delete has 2 children
			// Replace the value in the subtreeRoot node with the smallest value from the right subtree
			subtreeRoot.setData(subtreeRoot.getRightChild().min());
			// Delete the node that has the smallest value in the right subtree
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
			
		}
		return subtreeRoot;
	}
}
