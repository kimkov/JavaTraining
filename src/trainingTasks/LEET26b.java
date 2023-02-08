package trainingTasks;

class S26b {
	private int[] numsb;
	
	S26b(int[] numsb) {
		this.numsb = numsb;
	}
	
	public void setNumsb(int[] numsb) {
		this.numsb = numsb;
	}
	
	public int[] getNumsb() {
		return numsb;
	}
	
	public int Sol26b() {
		if(numsb.length == 0) {
			return 0;
		}
		
		int result = 1;
		
		for(int i = 0; i < numsb.length - 1; i++) {
			if(numsb[i] < numsb[i + 1]) {
				numsb[result] = numsb[i + 1];
				result++;
			}
		}
		return result;
	}
}

public class LEET26b {
	public static void main(String[] args) {
		int[] numsb = new int[] {0,0,1};
		
		S26b sl = new S26b(numsb);
		
		System.out.print(sl.Sol26b());
	}
}
