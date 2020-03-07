package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class DisapperedInArray_448 {
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> dist = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i< nums.length; i++) {
        	dist.add(nums[i]);
        }
        
        for(int i=1; i<= nums.length; i++) {
        	if(!dist.contains(i))
        		result.add(i);
        		
        }
        
        
        return result;
    }
    
    public static List<Integer> findDisappearedNumbers_MostVoted(int[] nums){
       List<Integer> result = new ArrayList<Integer>();
      
       for(int i=0; i< nums.length; i++) {
    	   int value = Math.abs(nums[i]) -1;
    	   if(nums[value] > 0)
    	      nums[value] = -nums[value];
    	   
       }
       
       for(int i=0; i< nums.length; i++) {
    	   if(nums[i] > 0) {
    		   result.add(i+1);
    	   }
       }
   
      return result;
    }
	
	public static void main(String[] args) {
		//List<Integer> ans = findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		List<Integer> ans = findDisappearedNumbers_MostVoted(new int[] {4,3,2,7,8,2,3,1});
		System.out.println(ans);

	}

}
