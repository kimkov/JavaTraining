package llist;

public class DoubleList {
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int val;
		Node next;
		Node prev;
		
		Node(int val) {
			this.val = val;
		}
		
		Node(){};
	}
	
	public DoubleList(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 0;
	}
	
	public DoubleList() {};
	
	public void printDL() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public void append(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}
	
	
}
