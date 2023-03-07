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
	
	public Node get(int index) {
		if(index < 0 || index >= length) {
			return null;
		}
		Node tmp = head;
		for(int i = 0; i < index; i++) {
			tmp = tmp.next;
		}
		return tmp;
	}
	
	public boolean set(int index, int value) {
		Node tmp = get(index);
		if(tmp != null) {
			tmp.val = value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int val) {
		if(index < 0 || index > length) {
			return false;
		}
		if(index == 0) {
			prepNode(val);
			return true;
		}
		if(index == length) {
			append(val);
			return true;
		}
		Node nNode = new Node(val);
		Node tmp = get(index - 1);
		nNode.next = tmp.next;
		tmp.next = nNode;
		length++;
		return true;
	}
	
	public Node remove(int index) {
		if(index < 0 || index >= length) {
			return null; 
		}
		if(index == 0) {
			return removeFirst();
		}
		if(index == length - 1) {
			return removeLast();
		}
		Node prev = get(index - 1);
		Node tmp = prev.next;
		
		prev.next = tmp.next;
		tmp.next = null;
		length--;
		return tmp;
	}
	
	public void reverse() {
		Node tmp = head;
		head = tail;
		tail = tmp;
		Node after = tmp.next;
		Node before = null;
		
		for(int i = 0; i < length; i++) {
			after = tmp.next;
			tmp.next = before;
			before = tmp;
			tmp = after;
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
