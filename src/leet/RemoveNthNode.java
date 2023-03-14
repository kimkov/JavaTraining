package leet;
// remove Nth Node from the end
public class RemoveNthNode {
	private RNode head;
	private RNode tail;
	private int length;
	
	class RNode {
		int val;
		RNode next;
		
		RNode(int val) {
			this.val = val;
		}
	}
	
	public RemoveNthNode(int val) {
		RNode newNode = new RNode(val);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public RemoveNthNode() {};
	
	public void append(int val) {
		RNode newNode = new RNode(val);
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
		RNode tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public RNode RemoveNthNodeFromEnd(int val) {
		RNode cur = head;
		
		for(int i = 0; i < val; i++) {
			cur = cur.next;
		}
		
		if(cur == null) {
			return head.next;
		}
		
		RNode before = head;
		
		while(cur.next != null) {
			cur = cur.next;
			before = before.next;
		}
		
		before.next = before.next.next;
		return head;
	}
}
