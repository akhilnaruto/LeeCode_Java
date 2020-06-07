package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

/*
 * 54. Spiral Matrix
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

 */
public class SpiralMatrix {

	public static void main(String[] args) {
		List<Integer> ans = new SpiralMatrix().spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList();
		int topLeft = 0;
		int topRight = 0;
		int bottomRight = matrix[0].length - 1;
		int bottomLeft = matrix[0].length - 1;
		int total = matrix[0].length * matrix.length;
		while (result.size() < total) {
			// processing left to right-> first row
			for (int i = topLeft; i < topRight; i++) {
				result.add(matrix[topLeft][i]);
			}
			topLeft++;

			// processing top to bottom -> last column
			for (int i = topRight; i < bottomRight; i++) {
				result.add(matrix[i][topRight]);
			}
			topRight++;

			// processing bottom right to bottom left -> last row
			for (int i = bottomRight; i > bottomLeft; i--) {
				result.add(matrix[bottomRight][i]);
			}
			bottomRight--;

			// processing bottom left to top left --> first column
			for (int i = bottomLeft; i > topLeft; i--) {
				result.add(matrix[i][bottomLeft]);
			}
			bottomLeft--;

		}

		return result;
	}
}
