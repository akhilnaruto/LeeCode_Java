package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

	int count = 0;
	public static void main(String[] args) {
		 int[] ans = new DiagonalTraverse().findDiagonalOrder(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
		 int[] ans1 = new DiagonalTraverse().findDiagonalOrder(new int[][] {{7}, {9}, {6}});

	}

	public int[] findDiagonalOrder(int[][] matrix) {
		
		if(matrix == null || matrix.length == 0)
			return new int[0];
		
		int rowLength =  matrix.length;
		int colLength = matrix[0].length;
		int[] res = new int[rowLength * colLength];
		int k = 0;
		ArrayList<Integer> result1 =  processFirstRow(matrix);
		for(int a : result1)
			res[k++] = a;
		ArrayList<Integer> result2 =  processLastColumn(matrix);
		for(int a : result2)
			res[k++] = a;
		
		return res;
	}
	
	private ArrayList<Integer> processFirstRow(int[][] matrix) {
		int colLength = matrix[0].length;
		int row=0, col=0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> tmpArray = new ArrayList<Integer>();
		for(int i=0; i< colLength; i++) {
			col = i;
			while(true) {
				if(row > matrix.length -1 || col < 0) {
					row = 0;
					break;
				}
				tmpArray.add(matrix[row][col]);	
				row ++;
				col --;
			}
			if(count % 2 == 0) {
				Collections.reverse(tmpArray);
			}
			count++;
			result.addAll(tmpArray);
			tmpArray.clear();
		}
		return result;
		 
	}
	
	private ArrayList<Integer> processLastColumn(int[][] matrix) {
		int rowLength = matrix.length;
		int row=1, col= matrix[0].length - 1;
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> tmpArray = new ArrayList<Integer>();
		for(int i= 1; i< rowLength; i++) {
			row = i;
			while(true) {
				if(row > matrix.length -1 || col < 0 || col > matrix[0].length -1 ) {
					row = 0;
					col = matrix[0].length - 1;
					break;
				}
				tmpArray.add(matrix[row][col]);	
				row ++;
				col --;
			}
			if(count % 2 == 0) {
				Collections.reverse(tmpArray);
			}
			count++;
			result.addAll(tmpArray);
			tmpArray.clear();
		}
		return result;
	}
}
