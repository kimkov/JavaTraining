package trainingTasks;

class S1089 {
	int[] arr;
	
	S1089(int[] arr) {
		this.arr = arr;
	}
	
	void duplicateZeros() {
		int count = 0;
		int n = arr.length;
		
		for(int i : arr) {
			if(i == 0) {
				++count;
			}
		}
		
		for(int i = n - 1, j = n - 1 + count; i >= 0; --i, --j) {
			if(arr[i] == 0) {
				if(j < n) {
					arr[j] = 0;
				}
				--j;
			}
			if(j < n) {
					arr[j] = arr[i];
			}
		}
		System.out.println(arr);
	}
}

public class Leet1089 {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
		
		S1089 sl = new S1089(arr);
		sl.duplicateZeros();
	}
}
