package leet;

public class RemoveElemFromLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
		}
		Node(){}
	}
	
	public RemoveElemFromLinkedList(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public RemoveElemFromLinkedList() {};
	
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
	
	public void printL() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public Node RemElem(int val) {
	    Node sentinel = new Node(0);
	    sentinel.next = head;

	    Node prev = sentinel, curr = head;
	    while (curr != null) {
	      if (curr.val == val) prev.next = curr.next;
	      else prev = curr;
	      curr = curr.next;
	    }
	    return sentinel.next;
		
	}
}
