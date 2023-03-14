package leet;

public class ReverseLinkedList {
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
	
	public ReverseLinkedList(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public ReverseLinkedList() {};
	
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
	
	public void printList() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public Node reversedLinkedL() {
		if(head == null) return head;
		
		Node curr = head;
		while(head.next != null) {
			Node p = head.next;
			head.next = p.next;
			p.next = curr;
			curr = p;
		}
		return curr;
	}
}
