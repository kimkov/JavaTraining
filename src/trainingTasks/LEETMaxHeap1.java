package trainingTasks;

import java.util.PriorityQueue;
import java.util.Collections;

public class LEETMaxHeap1 {
	public static void main(String[] args) {
        // Construct an instance of Max Heap
		PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        // Add 1，3，2 respectively to the Max Heap
		pr.add(1);
		pr.add(3);
		pr.add(2);
		
        // Check all elements in the Max Heap, the result is [3, 1, 2]
		System.out.println("Max Heap: " + pr.toString());
		
        // Get the top element of the Max Heap
		int peekNum = pr.peek();
		
        // The result is 3
		System.out.println("Peek is: " + peekNum);
		
        // Delete the top element in the Max Heap
		int pollNum = pr.poll();
		
        // The reult is 3
		System.out.println("Poll num is: " + pollNum);
		
        // Check the top element after deleting 3, the result is 2
		System.out.println("New peek is: " + pr.peek());
		
        // Check all elements in the Max Heap, the result is [2,1]
		System.out.println("New heap is: " + pr.toString());
		
        // Check the number of elements in the Max Heap
        // Which is also the length of the Max Heap
		int heapSize = pr.size();
		
		// result is 2
		System.out.println("Heap Size is: " + heapSize);
		
        // Check if the Max Heap is empty
		boolean isEmpty = pr.isEmpty();
		
        // The result is false
		System.out.println("Is Empty heap: " + isEmpty);	
	}
}
