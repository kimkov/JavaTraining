package dList.SwapFirstLast;

public class SwapLastFirst {
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
		
		Node() {}
	}
	
	public SwapLastFirst(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public SwapLastFirst() {};
	
	public void append(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public void printAll() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public void getHead() {
		if(head == null) {
			System.out.println("Head is null");
		} else {
			System.out.println("Head is: " + head.val);
		}
	}
	
	public void getTail() {
		if(tail == null) {
			System.out.println("Tail is null");
		} else {
			System.out.println("Tail: " + tail.val);
		}
	}
	
	public void swapFirstLast() {
		if(length < 2) return;
		int tmp = head.val;
		head.val = tail.val;
		tail.val = tmp;
	}
}
