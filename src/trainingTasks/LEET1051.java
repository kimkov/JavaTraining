package trainingTasks;

class S1051 {
	private int[] heights;
	
	S1051(int[] heights) {
		int[] h = new int[heights.length];
		this.heights = h;
	}
	
	int heightChecker(int[] heights) {
		int ind = 0;
		int[] expected = new int[] {1,1,1,2,3,4};
		
		for(int i = 0; i < heights.length; i++) {
			for(int j = 0; j < expected.length; j++) {
				if(heights[i] == expected[j]) {
					ind += 1;
				}
			}
		}
		return ind;
	}
}

public class LEET1051 {
	public static void main(String[] args) {
		int[] heights = new int[] {1,1,4,2,1,3};
		
		S1051 sl = new S1051(heights);
		
		System.out.println(sl.heightChecker(heights));
	}
}
