package trainingTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class S136 {
	private int[] nums;
	
	S136(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public int SolSingleN(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i: nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			}
		for(int i: nums) {
			if(map.get(i) == 1) {
				return i;
			}
		}
		return 0;
	}
}

public class LEET136 {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 2, 2, 3, 3, 9};
		
		S136 sl = new S136(nums);
		System.out.print(sl.SolSingleN(nums));
	}
}
