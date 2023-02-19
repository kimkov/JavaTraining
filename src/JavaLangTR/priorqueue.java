package JavaLangTR;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class priorqueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.naturalOrder());
		
		heap.add(7);
		heap.add(8);
		heap.add(4);
		heap.add(0);
		heap.add(1);
		
		int x = heap.poll();
		
		System.out.println(x);
		
		System.out.println(" ");
		
		while(!heap.isEmpty()) {
			System.out.println(heap.poll());
		}
		
		System.out.println("queue");
		
		Queue<Integer> nums = new LinkedList<>();
		
		nums.add(2);
		nums.add(7);
		nums.add(4);
		nums.add(9);
		nums.add(11);
		
		System.out.println(nums);
	}
}
