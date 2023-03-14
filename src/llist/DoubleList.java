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
	
	public Node removeLast() {
		if(length == 0) return null;
		Node tmp = tail;
		if(length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			tmp.prev = null;
		}
		length--;
		return tmp;
	}
	
	public void prepend(int val) {
		Node newNode = new Node(val);
		if(length == 0) {
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
	
	public Node Get(int index) {
		if(index < 0 || index >= length) return null;
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
	
	public boolean set(int index, int val) {
		Node tmp = Get(index);
		if(tmp != null) {
			tmp.val = val;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int val) {
		if(index < 0 || index > length) return false;
		if(index == 0) {
			prepend(val);
			return true;
		}
		if(index == length) {
			append(val);
			return true;
		}
		
		Node newNode = new Node(val);
		Node before = Get(index - 1);
		Node after = before.next;
		
		newNode.prev = before;
		newNode.next = after;
		before.next = newNode;
		after.prev = newNode;
		length++;
		return true;
	}
	
	public Node remove(int index) {
		if(index < 0 || index >= length) return null;
		if(index == 0) return removeFirst();
		if(index == length - 1) return removeLast();
		
		Node tmp = Get(index);
		tmp.next.prev = tmp.prev;
		tmp.prev.next = tmp.next;
		tmp.prev = null;
		tmp.next = null;
		length--;
		return tmp;
	}
}
