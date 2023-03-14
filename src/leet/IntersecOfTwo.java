package leet;

import leet.LList.ListNode;

public class IntersecOfTwo {
	private ListNode headA;
	private ListNode headB;
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
			next = null;
		}
	}
	
	public ListNode getIntersecOfTwo(ListNode headA, ListNode headB) {
		ListNode p1 = headA;
		ListNode p2 = headB;
		
		while(p1 != p2) {
			p1 = p1 == null ? headB : p1.next;
			p2 = p2 == null ? headA : p2.next;
		}
		
		return p1;
	}
}
