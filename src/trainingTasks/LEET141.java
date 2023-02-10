package trainingTasks;

import java.util.LinkedList;

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LEET141 {
	
	public static boolean hasCycle(ListNode head) {
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
	
	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<>();
		
		ls.add(3);
		ls.add(2);
		ls.add(0);
		ls.add(-4);
		
		ListNode head = null;
		
		System.out.print(ls);
		
		}
	}