package trainingTasks;

class S2460 {
	private int[] numsc;
	
	S2460(int[] numsc) {
		this.numsc = numsc;
	}
	
	public void setNumsc(int[] numsc) {
		this.numsc = numsc;
	}
	
	public int[] getNumsc() {
		return numsc;
	}
	
	public void Sol2460() {
		int ind = 0;
		for(int i = 0; i < numsc.length - 1; i++) {
			if(numsc[i] == numsc[i + 1]) {
				numsc[i] *= 2;
				numsc[i + 1] = 0;
			}
		}
		
		for(int j = 0; j < numsc.length; j++) {
			if(numsc[j] != 0) {
				numsc[ind++] = numsc[j];
			}
		}
		
		for(int j = ind; j < numsc.length; j++) {
			numsc[j] = 0;
		}
		for(int v = 0; v < numsc.length; v++) {
			System.out.print(numsc[v] + " ");
		}
	}
}

public class LEET2460 {
	public static void main(String[] args) {
		int[] numsc = new int[] {0,0,1,1,1,2,2,3,3,4};
		
		S2460 sl = new S2460(numsc);
		
		sl.Sol2460();
	}
}
