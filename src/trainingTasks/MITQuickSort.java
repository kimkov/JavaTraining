package trainingTasks;

import java.util.Random;

class quickSort {
	private int[] nums;
	
	quickSort(int[] nums) {
		this.nums = nums;
	}
	
	public int[] getNums() {
		return nums;
	}
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public static void SolQuickSort(int[] nums, int lowIndex, int highIndex) {
		
		if(lowIndex >= highIndex) {
			return;
		}
		
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = nums[pivotIndex];
		swap(nums, pivotIndex, highIndex);
		
		int leftPointer = partition(nums, lowIndex, highIndex, pivot);
		
		SolQuickSort(nums, lowIndex, leftPointer - 1);
		SolQuickSort(nums, leftPointer + 1, highIndex);
	}

	private static int partition(int[] nums, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			while(nums[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while(nums[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(nums, leftPointer, rightPointer);
		}
		swap(nums, leftPointer, highIndex);
		return leftPointer;
	}
	
	private static void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}

public class MITQuickSort {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 41, 52, 17, 26, 10, 38, 57, 9, 49};
		
		quickSort sl = new quickSort(nums);
		
		quickSort.SolQuickSort(nums, 0, nums.length - 1);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
