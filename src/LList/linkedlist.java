package LList;

public class linkedlist {
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
		}
	}
	
	public linkedlist(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printlist() {
		Node tmp = head;
		while(tmp != null) {
			System.out.println("initial List: " + tmp.val);
			tmp = tmp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head: " + head.val);
	}
	
	public void getTail() {
		System.out.println("Tail: " + tail.val);
	}
	
	public void getLength() {
		System.out.println("Length " + length);
	}
}
