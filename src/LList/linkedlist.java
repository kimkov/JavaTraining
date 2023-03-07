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
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public void append(int val) {
		Node newNode = new Node(val);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		if(length == 0) {
			return null;
		} else {
			Node tmp = head;
			Node pre = head;
			while(tmp.next != null) {
				pre = tmp;
				tmp = tmp.next;
			}
			tail = pre;
			tail.next = null;
			length--;
			if(length == 0) {
				head = null;
				tail = null;
			}
			return tmp;
		}
	}
	
	public void prepNode(int val) {
		Node nNode = new Node(val);
		if(length == 0) {
			head = nNode;
			tail = nNode;
		} else {
			nNode.next = head;
			head = nNode;
		}
		length++;
	}
	
	public Node removeFirst() {
		if(length == 0) {
			return null;
		} else {
			Node tmp = head;
			head = head.next;
			tmp.next = null;
			length--;
			if(length == 0) {
				head = null;
				tail = null;
			}
			return tmp;
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
