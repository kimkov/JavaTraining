package trainingTasks;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class S414 {
	int[] nums;
	
	S414(int[] nums) {
		this.nums = nums;
	}
	
	int thirdMaxMinHeap() {
		
		// Implementation with minHeap approach
		
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        Set<Integer> taken = new HashSet<Integer>();
        
        for (int index = 0; index < nums.length; ++index) {
            // If current number was already taken, skip it.
            if (taken.contains(nums[index])) {
                continue;
            }
            
            // If min heap already has three numbers in it.
            // Pop the smallest if current number is bigger than it.
            if (minHeap.size() == 3) {
                if (minHeap.peek() < nums[index]) {
                    taken.remove(minHeap.poll());
                    
                    minHeap.add(nums[index]);
                    taken.add(nums[index]);
                }
            } 
            // If min heap does not have three number we can push it.
            else {
                minHeap.add(nums[index]);
                taken.add(nums[index]);
            }
        }
        
        // 'nums' has only one distinct element it will be the maximum.
        if (minHeap.size() == 1) {
            return minHeap.peek();
        }
        // 'nums' has two distinct elements.
        else if (minHeap.size() == 2) {
            int firstNum = minHeap.poll();
            return Math.max(firstNum, minHeap.peek());
        }
        
        return minHeap.peek();
	}
}

public class LEET414 {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 1};
		
		S414 sl = new S414(nums);
		System.out.println(sl.thirdMaxMinHeap());
	}
}
