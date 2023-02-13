package trainingTasks;

//Task:
//Given an integer array nums and an integer k, return the kth largest element in the array. 
		
class S215 {
	private int[] nums;
	private int k;
	
	S215(int[] nums, int k) {
		this.nums = nums;
		this.k = k;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setK(int k) {
		this.k = k;
	}
	
	public int getK() {
		return k;
	}
	
}

public class LEET215 {
	public static void main(String[] args) {
		int [] nums = new int[] {3,2,1,5,6,4};
		int k = 2;
	}
}
