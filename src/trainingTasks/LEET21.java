package trainingTasks;

import java.util.LinkedList;

class S21 {
	
	private LinkedList<Integer> list1;
	private int key;
	
	S21(LinkedList<Integer> list1, int key) {
		this.list1 = list1;
		this.key = key;
	}
	
	public void setList1(LinkedList<Integer> list1) {
		this.list1 = list1;
	}
	
	public LinkedList<Integer> list1()  {
		return list1;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
	
	private class Node {
		int val;
		Node next;
		
		public Node(int v) {
			val = v;
			next = null;
		}
	}
	
	int length;
	Node head;
	
	public S21() {
		length = 0;
		head = null;
	}
	
	void add(int newVal) {
		Node newNode = new Node(newVal);
		newNode.val = newVal;
		newNode.next = head;
		head = newNode;
	}
	
	public String toString() {
		Node tmp = head;
		String result = "[";
		while(tmp != null) {
			result += Integer.toString(tmp.val) + " ";
			tmp = tmp.next;
		}
		result += "]";
		return result;
	}
}

public class LEET21 {
	public static void main(String[] args) {
		int key = 2;
		
		S21 sl = new S21();
		
		sl.add(1);
		sl.add(2);
		sl.add(5);
		sl.add(8);
		
		System.out.print(sl);
	}
}
