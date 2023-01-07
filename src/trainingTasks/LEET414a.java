package trainingTasks;

import java.util.TreeSet;

class S414a {
	private int[] nums;
	
	
	S414a(int[] nums) {
		this.nums = nums;
	}
	
	int hirdMaxOrderedSet() {
        // Sorted set to keep elements in sorted order.
        TreeSet<Integer> sortedNums = new TreeSet<Integer>();
        
        // Iterate on all elements of 'nums' array.
        for (int num : nums) {
            // Do not insert same element again.
            if (sortedNums.contains(num)) {
                continue;
            }
            
            // If sorted set has 3 elements.
            if (sortedNums.size() == 3) {
                // And the smallest element is smaller than current element.
                if (sortedNums.first() < num) {
                    // Then remove the smallest element and push the current element.
                    sortedNums.pollFirst();
                    sortedNums.add(num);
                }
                
            } 
            // Otherwise push the current element of nums array.
            else {
                sortedNums.add(num);
            }
        }
        
        // If sorted set has three elements return the smallest among those 3.
        if (sortedNums.size() == 3) {
            return sortedNums.first();
        }
        
        // Otherwise return the biggest element of nums array.
        return sortedNums.last();
    }
}

public class LEET414a {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 1};
		
		S414a sl = new S414a(nums);
		
		System.out.println(sl.hirdMaxOrderedSet());
	}
}
