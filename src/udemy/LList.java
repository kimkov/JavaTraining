package udemy;

public class LList {
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
	
	public LList(int val) {
		Node nNode = new Node(val);
		head = nNode;
		tail = nNode;
		length = 1;
	}
	
	public void LPrint() {
		Node tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public void appNum(int val) {
		Node nNode = new Node(val);
		if(length == 0) {
			head = nNode;
			tail = nNode;
		} else {
			tail.next = nNode;
			tail = nNode;
		}
		
	}
}
