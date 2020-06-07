package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTrainage_118 {
    public static void main(String[] args) {

        List<List<Integer>> ans = new PascalTrainage_118().generate(4);

    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> answer = new ArrayList<>();
        if(numRows == 0)
           return answer;
        
           // first row will always be 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);   

        for(int currRow =1; currRow< numRows; currRow++){
            List<Integer> row = new ArrayList<>();
            
            // first number will always be 1
            row.add(1);

            // iterate through previous row and add them to current row
            List<Integer> prevRow =  answer.get(currRow-1);
            for(int i=0; i< prevRow.size()-1; i++){
                row.add(prevRow.get(i) + prevRow.get(i+1));
            }
            // last number will always be 1
            row.add(1);
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            row1.add(0, 1);

        }   

        return answer;



    }
}