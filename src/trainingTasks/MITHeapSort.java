package trainingTasks;

public class MITHeapSort {
  
    public void sort(int arr[]) {
    	
    	//Building a heap
    	int n = arr.length;
    	for (int i = n / 2 - 1; i >= 0; i--) {
    		heapify(arr, n, i);
    		}
  
      //Extract elements from heap one by one
      for (int i = n - 1; i >= 0; i--) {
        /*Move current root element to the end
    	 swap nums[0] with nums[i]*/
        int tmp = arr[0];
        arr[0] = arr[i];
        arr[i] = tmp;
  
        heapify(arr, i, 0);//calling max heapify on the heap reduced
      }
    }
  
    void heapify(int arr[], int n, int i) {
      int max = i; //Initialize max as root
      int leftChild = 2 * i + 1; // left child
      int rightChild = 2 * i + 2; // right child
  
      //If left child is greater than root
      if (leftChild < n && arr[leftChild] > arr[max])
        max = leftChild;
  
      //If right child is greater than max
      if (rightChild < n && arr[rightChild] > arr[max])
        max = rightChild;
  
      //If max is not root
      if (max != i) {
    	  // swap nums[i] with max
        int swap = arr[i];
        arr[i] = arr[max];
        arr[max] = swap;

        //heapify the affected sub-tree recursively
        heapify(arr, n, max);
      }
    }
  
    //print size of array n using utility function
    static void display(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  
    //Driver code
    public static void main(String args[]) {
      int arr[] = {11, 34, 9, 5, 16, 10};
  
      MITHeapSort hs = new MITHeapSort();
      System.out.println("Original array:");
      display(arr);
	  hs.sort(arr);
  
      System.out.println("Sorted array:");
      display(arr);
    }
  }
