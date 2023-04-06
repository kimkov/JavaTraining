package leet;

import java.util.Arrays;

class DiagonalTraverse {
	public int[] findDiagonal(int[][] matrix) {
		//check for empty matrices
		if(matrix == null || matrix.length == 0) {
			return new int[0];
		}
		// Variables to track the size of the matrix
		int n = matrix.length;
		int m = matrix[0].length;
		
		// Incides that will help us progress through the matrix, one element at a time
		int row = 0, column = 0;
		
		/* Based on the current direction and the tail, we will determine the head of the 
		 * next diagonal. Initially the direction would be 1 which would indicate up*/
		int direction = 1;
		
		// The final result array
		int[] result = new int[n*m];
		int r = 0;
		
		// The uber while loop which will help us iterate over all the elements in the array
		while(row < n && column < m) {
			// First and foremost, add current element to the result matrix
			result[r++] = matrix[row][column];
			
            // Move along in the current diagonal depending upon
            // the current direction.[i, j] -> [i - 1, j + 1] if 
            // going up and [i, j] -> [i + 1][j - 1] if going down.
			int new_row = row + (direction == 1 ? -1 : 1);
			int new_column = column + (direction == 1 ? 1 : -1);
			
            // Checking if the next element in the diagonal is within the
            // bounds of the matrix or not. If it's not within the bounds,
            // we have to find the next head.
			if(new_row < 0 || new_row == n || new_column < 0 || new_column == m) {
				// if the current diagonal was going in the upwards direction
				if(direction == 1) {
                    // For an upwards going diagonal having [i, j] as its tail
                    // If [i, j + 1] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i + 1, j] becomes the next head
					row += (column == m - 1 ? 1 : 0);
					column += (column < m - 1 ? 1 : 0);
				} else {
                    // For a downwards going diagonal having [i, j] as its tail
                    // if [i + 1, j] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i, j + 1] becomes the next head
					column += (row == n - 1 ? 1 : 0);
					row += (row < n - 1 ? 1 : 0);
				}
				// Flip the direction
				direction = 1 - direction;
			} else {
				row = new_row;
				column = new_column;
			}
		}
		return result;
	}
}

public class DiagonalTraverse498 {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		
		DiagonalTraverse fd = new DiagonalTraverse();
		fd.findDiagonal(mat);
		System.out.println(Arrays.toString(fd.findDiagonal(mat)));
	}
}
