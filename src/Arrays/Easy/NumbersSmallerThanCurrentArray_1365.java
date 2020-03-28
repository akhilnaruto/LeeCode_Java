package Arrays.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersSmallerThanCurrentArray_1365 {

	public static void main(String[] args) {
		int[] input = new int[] { 8, 1, 2, 2, 3 };
		int[] result = new NumbersSmallerThanCurrentArray_1365().smallerNumbersThanCurrent(input);
		System.out.println(result);
	}

	// my solution
	public int[] smallerNumbersThanCurrent_mine(int[] nums) {
		Integer[] numsI = new Integer[nums.length];
	    for(int i=0; i<nums.length; i++)
	       	numsI[i] = nums[i];
		
        int[] result = new int[nums.length];
        Arrays.sort(numsI);
        List<Integer> list  =   Arrays.asList(numsI);
        int i =0;
        for(int num : nums) {
        	  
        	   int indexOfNum = list.indexOf(num);
        	   result[i] = indexOfNum;
        	   i++;
        }
        return result;
	}
	
	// popular solution
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[10];
        int[] res = new int[nums.length];
        
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        
        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];    
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else 
                res[i] = count[nums[i] - 1];
        }
        
        return res;        
    }


	
	

}
