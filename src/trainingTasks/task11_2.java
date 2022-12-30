package trainingTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class S11_1 {
	
}

public class task11_2 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the number - ");
			System.out.println(" ");
			int x = Integer.parseInt(myNum.readLine());
			
			arr[i] = x;
		}
		
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}
}
