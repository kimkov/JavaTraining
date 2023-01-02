package trainingTasks;

class Sol1346 {
	private int[] nums;
	
	Sol1346(int[] nums) {
		this.nums = nums;
	}
	
	boolean S1346() {
		int i, j;
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums.length; j++) {
				if(i != j) {
					if(nums[i] == 2 * nums[j]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}

public class LEET1346 {
	public static void main(String[] args) {
		int[] nums = new int[] {10,2,7,3};
		
		Sol1346 sl = new Sol1346(nums);
		
//		sl.S1346();
		if(sl.S1346() == true) {
			System.out.println("TRUE");
		} else {
			System.out.println("False");
		}
	}
}


/*
 *         for i in range(len(arr)):
            for j in (arr[:i] + arr[i+1:]):
                if 2 * arr[i] == j:
                    return True
        return False*/