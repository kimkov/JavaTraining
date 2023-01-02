package trainingTasks;

class S941 {
	private int[] arr;
	
	S941(int[] arr) {
		this.arr = arr;
	}
	
	boolean Sol941() {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length - 1;
        while (i + 1 < n && arr[i] < arr[i+1]) {
            i++;
        }
        
        while (j > 0 && arr[j] < arr[j-1]) {
            j--;
        }
        
        if(i > 0 && i == j && j < n) {
        	return true;
        } else {
        	return false;
        }
	}
}

public class LEET941 {
	public static void main(String[] args) {
		int[] arr = new int[] {0,3,2,1};
		
		S941 sl = new S941(arr);
		
		if(sl.Sol941() == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
