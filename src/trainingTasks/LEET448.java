package trainingTasks;

import java.util.ArrayList;
import java.util.List;

class Sleet448 {
	private int[] nums;
	
	Sleet448(int[] nums) {
		this.nums = nums;
	}
	
	List<Integer> SolLeet448() {
		List<Integer> result = new ArrayList<>();

		for(int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if(nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				result.add(i + 1);
			}
		}
		return result;
	}
}

public class LEET448 {
	public static void main(String[] args) {
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		
		Sleet448 sl = new Sleet448(nums);
		
		System.out.print(sl.SolLeet448());
	}
}

