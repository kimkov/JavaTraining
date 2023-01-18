package trainingTasks;

import java.util.Arrays;

class S1051 {
	private int[] heights;
	
	S1051(int[] heights) {
		this.setHeights(heights);
	}
	
	int heightChecker(int[] heights) {
		int ind = 0;
		int[] newArr = new int[heights.length];
		
		for(int i = 0; i < heights.length; i++) {
			newArr[i] = heights[i];
		}
		
		Arrays.sort(newArr);
		
		for(int i = 0; i != heights.length; i++) {
			if(heights[i] != newArr[i]) {
				ind += 1;
			}
		}
		return ind;
	}

	public int[] getHeights() {
		return heights;
	}

	public void setHeights(int[] heights) {
		this.heights = heights;
	}
}

public class LEET1051 {
	public static void main(String[] args) {
		int[] heights = new int[] {5,1,2,3,4};
		
		S1051 sl = new S1051(heights);
		
		System.out.println(sl.heightChecker(heights));
	}
}
