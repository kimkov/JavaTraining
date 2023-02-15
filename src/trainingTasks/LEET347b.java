package trainingTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class S347b {
	int[] uniqueElem;
	Map<Integer, Integer> count;
	
	public void swap(int a, int b) {
		int tmp = uniqueElem[a];
		uniqueElem[a] = uniqueElem[b];
		uniqueElem[b] = tmp;
	}
	
	public int partition(int left, int right, int pivot_index) {
		int pivot_freq = count.get(uniqueElem[pivot_index]);
		
		// 1. move pivot to the end
		swap(pivot_index, right);
		int store_index = left;
		
		// 2. move all less frequent elements to the left
		for(int i = left; i <= right; i++) {
			if(count.get(uniqueElem[i]) < pivot_freq) {
				swap(store_index, i);
				store_index++;
			}
		}
		
		swap(store_index, right);
		return store_index;
	}
	
	public void quickselectF(int left, int right, int k_smallest) {
		if(left == right) {
			return;
		}
		Random random_num = new Random();
		int pivot_index = left + random_num.nextInt(right - left);
		pivot_index = partition(left, right, pivot_index);
		
		if(k_smallest == pivot_index) {
			return;
		} else if(k_smallest < pivot_index) {
			quickselectF(left, pivot_index - 1, k_smallest);
		} else {
			quickselectF(pivot_index + 1, right, k_smallest);
		}
	}
	
	public int[] topKFrequent(int[] nums, int k) {
		count = new HashMap();
		for(int num: nums) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}
		 int n = count.size();
		 uniqueElem = new int[n];
		 int i = 0;
		 for(int num : count.keySet()) {
			 uniqueElem[i] = num;
			 i++;
		 }
		 quickselectF(0, n - 1, n - k);
		 return Arrays.copyOfRange(uniqueElem, n- k, n);
	}
}

public class LEET347b {
	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,2,2,3};
		int k = 2;
		
		S347b sl = new S347b();
		
		sl.topKFrequent(nums, k);
		System.out.println(sl.topKFrequent(nums, k));
	}
}
