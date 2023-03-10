package dList;

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
	}
	
	public DoubleList(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printDL() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public void getHead() {
		if(head == null) {
			System.out.println("Head: null");
		} else {
			System.out.println("Head: " + head.val);
		}
	}
	
	public void getTail() {
		if(tail == null) {
			System.out.println("Tail is null");
		} else {
			System.out.println("Tail: " + tail.val);
		}
	}
	
	public void getLength() {
		System.out.println("Length: " + length);
	}
}
