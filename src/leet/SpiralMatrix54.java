package leet;

import java.util.List;
import java.util.ArrayList;

class SolSpiralMatrix54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		int VISITED = 101;
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		// 4 directions that we will move: right, down, left, up
		int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		// initial direction: moving right
		int currentDirection = 0;
		// The number of times we change the direction
		int changeDirection = 0;
		// Current place that we are at is (row, col)
		// row is the row index; col is the column index
		int row = 0;
		int col = 0;
		// Store first element and mark it as visited
		List<Integer> result = new ArrayList<>();
		result.add(matrix[0][0]);
		matrix[0][0] = VISITED;
		while(changeDirection < 2) {
			while(row + directions[currentDirection][0] >= 0 &&
					row + directions[currentDirection][0] < rows &&
					col + directions[currentDirection][1] >= 0 &&
					col + directions[currentDirection][1] < columns &&
					matrix[row + directions[currentDirection][0]]
					[col + directions[currentDirection][1]] != VISITED) {
				// Reset this to 0 since we did not break and change the direction
				changeDirection = 0;
				
				//Calculate the next place that we will move to
				row = row + directions[currentDirection][0];
				col = col + directions[currentDirection][1];
				result.add(matrix[row][col]);
				matrix[row][col] = VISITED;
			}
			// Change our direction
			currentDirection = (currentDirection + 1) % 4;
			// Increment change_direction because we changed our direction
			changeDirection++;
		}
		return result;
	}
}

public class SpiralMatrix54 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		SolSpiralMatrix54 sm = new SolSpiralMatrix54();
		System.out.println(List.of(sm.spiralOrder(matrix)));
	}
}
