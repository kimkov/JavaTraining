package JavaLangTR;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class priorqueue {
	public static void main(String[] args) {
		int[] nums = new int[] {3,2,1,5,6,4};
		int k = 2;
		
		PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i: nums) {
			heap.add(i);
		}
		
		while(!heap.isEmpty()) {
			System.out.print(heap.poll() + " ");
		}
	}
}
