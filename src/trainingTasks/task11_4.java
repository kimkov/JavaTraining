package trainingTasks;

import java.lang.Math;

class S11_4 {
	private int[] heights;
	
	S11_4(int[] heights) {
		this.heights = heights;
	}
	
	void Sol11_4() {
		for(int i = 0; i < heights.length; i++) {
			int x = (int) (163 + Math.random() * 28);
			
			heights[i] = x;
		}
		
		for(int j = 0; j < heights.length; j++) {
			System.out.print(heights[j] + " ");
		}
	}
}

public class task11_4 {
	public static void main(String[] args) {
		int[] heights = new int[12];
		
		S11_4 sl = new S11_4(heights);
		sl.Sol11_4();
	}
}
