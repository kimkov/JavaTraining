package trainingTasks;

import java.lang.Math;

class S1299 {
	private int[] arr;
	
	S1299(int[] arr) {
		this.arr = arr;
	}
	
	void Sol1299() {
		int max = -1;
		int nmax = 0;
		for(int i = arr.length - 1; i >= 0; i--) {
				nmax = Math.max(max, arr[i]);
			arr[i] = max;
			max = nmax;
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
	}
}

public class LEET1299 {
	public static void main(String[] args) {
		int[] arr = new int[] {17,18,5,4,6,1};
		
		S1299 sl = new S1299(arr);
		sl.Sol1299();
	}
}

