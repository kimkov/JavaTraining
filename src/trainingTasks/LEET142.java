package trainingTasks;

public class LEET142 {
	    private ListNode getIntersect(ListNode head) {
	        ListNode lo = head;
	        ListNode hi = head;

	        // A fast pointer will either loop around a cycle and meet the slow
	        // pointer or reach the `null` at the end of a non-cyclic list.
	        while (hi != null && hi.next != null) {
	            lo = lo.next;
	            hi = hi.next.next;
	            if (lo == hi) {
	                return lo;
	            }
	        }

	        return null;
	    
}
	    public ListNode detectCycle(ListNode head) {
	        if (head == null) {
	            return null;
	        }

	        // If there is a cycle, the fast/slow pointers will intersect at some
	        // node. Otherwise, there is no cycle, so we cannot find an entrance to
	        // a cycle.
	        ListNode intersect = getIntersect(head);
	        if (intersect == null) {
	            return null;
	        }

	        // To find the entrance to the cycle, we have two pointers traverse at
	        // the same speed -- one from the front of the list, and the other from
	        // the point of intersection.
	        ListNode ptr1 = head;
	        ListNode ptr2 = intersect;
	        while (ptr1 != ptr2) {
	            ptr1 = ptr1.next;
	            ptr2 = ptr2.next;
	        }

	        return ptr1;
	    }
}

