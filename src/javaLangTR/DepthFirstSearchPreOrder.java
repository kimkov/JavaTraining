package javaLangTR;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class DFSPO {
	public Node root;
	
	public static class Node {
		public int val;
		public Node left;
		public Node right;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	public boolean insertN(int val) {
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
	
	public boolean containsN(int val) {
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
	
	public ArrayList<Integer> BFS() {
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		queue.add(currentNode);
		
		while(queue.size() > 0) {
			currentNode = queue.remove();
			result.add(currentNode.val);
			if(currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return result;
	}
	
	public ArrayList<Integer> DFSPreOrder() {
		ArrayList<Integer> results = new ArrayList<>();
		
		class Traverse {
			Traverse(Node currentNode) {
				results.add(currentNode.val);
				if(currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if(currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		
		new Traverse(root);
		return results;
	}
}

public class DepthFirstSearchPreOrder {
	public static void main(String[] args) {
		DFSPO dp = new DFSPO();
		dp.insertN(47);
		dp.insertN(21);
		dp.insertN(76);
		dp.insertN(18);
		dp.insertN(27);
		dp.insertN(52);
		dp.insertN(82);
		
		System.out.println("\nDFS PreOrder: ");
		System.out.println(dp.DFSPreOrder());
	}
}
