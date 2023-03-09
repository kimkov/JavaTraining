package udemy;

class LinksList {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	class ListNode {
		int val;
		ListNode next;
		
		ListNode(int val) {
			this.val = val;
		}
	}
	
	public LinksList(int val) {
		ListNode newNode = new ListNode(val);
		ListNode head = newNode;
		ListNode tail = newNode;
		length = 0;
	}
	public LinksList() {}
	
	public void appNum(int val) {
		ListNode newNode = new ListNode(val);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public void printL() {
		ListNode tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
//	public ListNode mergeLists(LinksList l1, LinksList l2) {
//		
//	}
}
