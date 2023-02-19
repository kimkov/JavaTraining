package trainingTasks;

import java.util.Comparator;
import java.util.PriorityQueue;

class S1046 {
	private int[] stones;
	
	S1046(int[] stones) {
		this.stones = stones;
	}
	
	public void setStones(int[] stones) {
		this.stones = stones;
	}
	
	public int[] getStones() {
		return stones;
	}
	
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int x : stones) {
			heap.add(x);
		}
		while(heap.size() > 1) {
			int stone1 = heap.remove();
			int stone2 = heap.remove();
			if(stone1 != stone2) {
				heap.add(stone1 - stone2);
			}
		}
		return heap.isEmpty() ? 0 : heap.remove();
	}
}

public class LEET1046 {
	public static void main(String[] args) {
		int[] stones = new int[] {2,7,4,1,8,1};
		
		S1046 sl = new S1046(stones);
		
		System.out.println(sl.lastStoneWeight(stones));
	}
}
