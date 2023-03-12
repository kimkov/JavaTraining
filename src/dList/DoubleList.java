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
	
	public Node removeLast() {
		if(length == 0) {
			return null;
		} else {
			Node tmp = tail;
			tail = tail.prev;
			tail.next = null;
			tmp.prev = null;
			length--;
			if(length == 0) {
				head = null;
				tail = null;
			}
			return tmp;
		}
	}
	
	public void prepend(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}
	
	public Node removeFirst() {
		if(head == null) return null;
		Node tmp = head;
		if(length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			tmp.next = null;
		}
		length--;
		return tmp;
	}
	public Node Dget(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		Node tmp = head;
		if(index < length / 2) {
			for(int i = 0; i < index; i++) {
				tmp = tmp.next;
			}
		} else {
			tmp = tail;
			for(int i = length - 1; i > index; i--) {
				tmp = tmp.prev;
			}
		}
		return tmp;
	}
}
