package javaLangTR;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class BST {
	public Node root;
	
	public static class Node {
		public int val;
		public Node left;
		public Node right;
		
		private Node(int val) {
			this.val = val;
		}
	}
	
	public boolean insert(int val) {
		Node newNode = new Node(val);
		if(root == null) {
			root = newNode;
			return true;
		}
		Node tmp = root;
		while(true) {
			if(newNode.val == tmp.val) return false;
			if(newNode.val < tmp.val) {
				if(tmp.left == null) {
					tmp.left = newNode;
					return true;
				}
				tmp = tmp.left;
			} else {
				if(tmp.right == null) {
					tmp.right = newNode;
					return true;
				}
				tmp = tmp.right;
			}
		}
	}
	
	public boolean contains(int val) {
		if(root == null) return false;
		Node tmp = root;
		while(tmp != null) {
			if(val < tmp.val) {
				tmp = tmp.left;
			} else if(val > tmp.val) {
				tmp = tmp.right;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Integer> BFSM() {
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<>();
		queue.add(currentNode);
		
		while(queue.size() > 0) {
			currentNode = queue.remove();
			results.add(currentNode.val);
			if(currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return results;
	}
}

public class BreadthFirstSearch {
	public static void main(String[] args) {
		BST bs = new BST();
		bs.insert(47);
		bs.insert(21);
		bs.insert(76);
		bs.insert(18);
		bs.insert(27);
		bs.insert(52);
		bs.insert(82);
		
		System.out.println("\nBreadth First Search: ");
		System.out.println(bs.BFSM());
	}
}
