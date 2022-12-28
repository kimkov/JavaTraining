package trainingTasks;

class S88 {
	
	private int[] nums1;
	private int[] nums2;
	private int m;
	private int n;
	
	S88(int[] nums1, int m, int[] nums2, int n) {
		this.nums1 = nums1;
		this.nums2 = nums2;
		this.m = m;
		this.n = n;
	}
	
	void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		
		while(k >= 0) {
			if(i >= 0 && j >= 0) {
				if(nums1[i] >= nums2[j]) {
					nums1[k--] = nums1[i--];
				} else {
					nums1[k--] = nums2[j--];
				}
			} else if (j >= 0) {
				nums1[k--] = nums2[j--];
			} else {
				break;
			}
		}
	}
}

public class Leet88 {
	public static void main(String[] args) {
		int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[] {2, 5, 6};
		int m = 3;
		int n = 3;
		
		System.out.print(nums1);
		S88 mg = new S88(nums1, m, nums2, n);
	}
}
