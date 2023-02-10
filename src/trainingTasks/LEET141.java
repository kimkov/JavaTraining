package trainingTasks;

class S141 {
	class ListNode {
		int val;
		ListNode next;
	
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	int length;
	ListNode head;
	
	public S141() {
		length = 0;
		head = null;
	}
	
	public void add(int newVal) {
		ListNode newNode = new ListNode(newVal);
		newNode.val = newVal;
		newNode.next = head;
	}
	
	public boolean hasCycle(ListNode head) {
		if(head == null) {
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			} else {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return true;
	}
	
	public String toPrint() {
		ListNode tmp = head;
		String result = "[";
		while(tmp != null) {
			result += Integer.toString(tmp.val) + " ";
			tmp = tmp.next;
		}
		result += "]";
		return result;
	}
}

public class LEET141 {
	public static void main(String[] args) {
		
		S141 sk = new S141();
		
		sk.add(3);
		sk.add(3);
		sk.add(0);
		sk.add(-4);
		
		
	}
}
