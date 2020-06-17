package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2_119 {

    public static void main(String[] args) {
        List<Integer> ans = new PascalTriangle2_119().getRow(3);
    }

    /*  == extension of pascal triange 1;
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> firstRow =  new ArrayList<>();
        firstRow.add(1);
        pascal.add(firstRow);
        for(int i=1; i<= rowIndex;  i++){
            List<Integer> currentRow =  new ArrayList<>();
            currentRow.add(1);

            List<Integer> prevRow = pascal.get(i-1);
            for(int j=0; j< prevRow.size()-1; j++){
                currentRow.add(prevRow.get(j) + prevRow.get(j+1));
            }
            currentRow.add(1);
            pascal.add(currentRow);
            if(rowIndex == i)
               return currentRow;
        }
        return firstRow;
    }
    */
    public List<Integer> getRow(int rowIndex) {
         List<Integer> result =  new ArrayList<>();
         for(int i=0; i<= rowIndex; i++){
            result.add(getNum(rowIndex, i));
         }
         return result;
    }

    private int getNum(int row, int col){
        if(col ==0 || row == 0 || col == row)
           return 1;
         
        return getNum(row-1, col) + getNum(row-1, col-1);   
    }

}