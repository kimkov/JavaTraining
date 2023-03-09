package leet;

import java.util.LinkedList;

public class LList {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	class ListNode {
		private ListNode head1;
		private ListNode head2;
		int val;
		ListNode next;
		
		ListNode(int val) {
			this.val = val;
		}
		
		ListNode() {};
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public void appN(int val) {
		ListNode newNode = new ListNode(val);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void printL() {
		ListNode tmp = head;
		while(tmp != null) {
			System.out.print(tmp.val + " ");
			tmp = tmp.next;
		}
	}
	
	public ListNode mergeList(ListNode list1, ListNode list2) {
		ListNode prev = new ListNode(-1);
		ListNode tmp = prev;
		
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
		return prev.next;
	}
}