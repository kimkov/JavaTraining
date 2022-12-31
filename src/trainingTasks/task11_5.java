package trainingTasks;

import java.lang.Math;

class S11_5 {
	private int[] weights;
	
	S11_5(int[] weights) {
		this.weights = weights;
	}
	
	void Sol11_5() {
		for(int i = 0; i < weights.length; i++) {
			int x = (int) (50 + Math.random() * 50);
			
			weights[i] = x;
		}
		
		for(int j = 0; j < weights.length; j++) {
			System.out.print(weights[j] + " ");
		}
	}
}

public class task11_5 {
	public static void main(String[] args) {
		int[] weights = new int[12];
		
		S11_5 sl = new S11_5(weights);
		sl.Sol11_5();
	}
}
