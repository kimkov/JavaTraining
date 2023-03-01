package javaLangTR;

import java.util.LinkedList;

class SLList {
	


public class LinkedListTr {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	public ListNode Ssort(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			} else {
				dummy.next = l2;
				l2 = l2.next;
			}
			dummy = dummy.next;
		}
		
		if(l1 != null) {
			dummy.next = l1;
		} else {
			dummy.next = l2;
		}
		
		System.out.println(head.next);
		return head.next;
	}

	public static void main(String[] agrs) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		list2.add(1);
		list2.add(2);
		list2.add(5);
		System.out.println(list1);
		System.out.println(list2);
		
	}
}
}
