package trainingTasks;

class S905 {
	private int[] nums;
	
	S905(int[] nums) {
		this.nums = nums;
	}
	
	void sortArrayByParity() {

        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }

            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 == 1) j--;
        }

		for(int n = 0; n < nums.length; n++) {
			System.out.print(nums[n] + " ");
		}
	}
}

public class LEET905 {
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2};
		
		S905 sl = new S905(nums);
		
		sl.sortArrayByParity();
	}
}
