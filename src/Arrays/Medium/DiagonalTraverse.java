package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 498. Diagonal Traverse
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

 */
public class DiagonalTraverse {

	public static void main(String[] args) {
		 int[] ans = new DiagonalTraverse().findDiagonalOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

	}

	public static int[] findDiagonalOrder(int[][] matrix) {
		  // Variables to track the size of the matrix
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        
        // The two arrays as explained in the algorithm
        int[] result = new int[rowLength*colLength];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();
        
        // We have to go over all the elements in the first
        // row and the last column to cover all possible diagonals
        for (int d = 0; d < rowLength + colLength - 1; d++) {
            
            // Clear the intermediate array every time we start
            // to process another diagonal
            intermediate.clear();
            
            // We need to figure out the "head" of this diagonal
            // The elements in the first row and the last column
            // are the respective heads.
            int r = d < colLength ? 0 : d - colLength + 1;
            int c = d < colLength ? d : colLength - 1;
            
            // Iterate until one of the indices goes out of scope
            // Take note of the index math to go down the diagonal
            while (r < rowLength && c > -1) {
                
                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }
                
            // Reverse even numbered diagonals. The
            // article says we have to reverse odd 
            // numbered articles but here, the numbering
            // is starting from 0 :P
            if (d % 2 == 0) {
                Collections.reverse(intermediate);
            }
            
            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
	}
}
