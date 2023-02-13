package trainingTasks;

import java.util.PriorityQueue;

public class LEETMinHeap1 {
	public static void main(String[] args) {
        // Construct an instance of Min Heap
		PriorityQueue<Integer> pr = new PriorityQueue<>();
		
        // Add 3，1，2 respectively to the Min Heap
		pr.add(3);
		pr.add(1);
		pr.add(2);
		
        // Check all elements in the Min Heap, the result is [1, 3, 2]
		System.out.println("Min Heap: " + pr.toString());
		
        // Get the top element of the Min Heap
		int peekNum = pr.peek();
        // The result is 1
		System.out.println("Peek is: " + pr.peek());
		
        // Delete the top element in the Min Heap
		int pollNum = pr.poll();
        // The reult is 1
		System.out.println("Poll nums is: " + pollNum);
		
        // Check the top element after deleting 1, the result is 2
		System.out.println("New peek is: " + pr.peek());
		
        // Check all elements in the Min Heap, the result is [2,3]
		System.out.println("MinHeap is: " + pr.toString());
		
        // Check the number of elements in the Min Heap
        // Which is also the length of the Min Heap
		int heapSize = pr.size();
		
        // The result is 2
		System.out.println("Heap Size is: " + heapSize);
		
        // Check if the Min Heap is empty
		boolean isEmpty = pr.isEmpty();
		
        // The result is false
		System.out.println("Is Empty: " + isEmpty);
	}
}
