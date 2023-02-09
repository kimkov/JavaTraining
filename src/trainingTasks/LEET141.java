package trainingTasks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class S141 {
	class ListNode {
		int val;
		ListNode next;
	
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	public boolean hasCycle(ListNode head) {
		Set<ListNode> visited = new HashSet<>();
		
		while(head != null) {
			if(visited.contains(head)) {
				return true;
			} else {
				visited.add(head);
				head = head.next;
			}
		}
		return false;
	}
}

public class LEET141 {
	public static void main(String[] args) {
		LinkedList<Integer> head = new LinkedList<>();
		
	}
}
