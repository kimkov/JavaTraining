package udemy.LinkList;

public class LinkList {
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
		int val;
		Node next;
		
		Node() {}
		
		Node(int val) {
			this.val = val;
		}
		
		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public LinkList(int val) {
		Node newNode = new Node(val);
		head = newNode;
		tail = newNode;
		length = 0;
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
	
	public Node mergeTwo(Node list1, Node list2) {
		Node prevH = new Node(-1);
		Node tmp = prevH;
		
		while(list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				tmp.next = list1;
				list1 = list1.next;
			} else {
				tmp.next = list2;
				list2 = list2.next;
			}
			tmp = tmp.next;
		}
		tmp.next = list1 == null ? list2 : list1;
		return prevH.next;
	}
	
	public void printL1() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
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
		System.out.println("Length: " + length);
	}
}
