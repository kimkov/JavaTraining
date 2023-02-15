package trainingTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/* Given an integer array nums and an integer k, 
 * return the k most frequent elements. You may return the answer in any order.
*/
class S347 {
	private int[] nums;
	private int k;
	
	S347(int[] nums, int k) {
		this.nums = nums;
		this.k = k;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setK(int k) {
		this.k = k;
	}
	
	public int getK() {
		return k;
	}
	
	public int[] topKFrequent(int[] nums, int k) {
		
		if(k == nums.length) {
			return nums;
		}
		
		Map<Integer, Integer> count = new HashMap<>();
		for(int num : nums) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}
		
		Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
		
		for(int num : count.keySet()) {
			heap.add(num);
			if(heap.size() > k) heap.poll();
		}
		
		int[] top = new int[k];
		for(int i = k - 1; i >= 0; --i) {
			top[i] = heap.poll();
		}
		return top;
	}
}

public class LEET347 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,2,2,3};
		int k = 2;
		
		S347 sl = new S347(nums, k);
		
		System.out.println(sl);
	}
}
