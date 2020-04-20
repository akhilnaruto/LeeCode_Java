package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

/*
 * 747. Largest Number At Least Twice of Others

 */
public class LargestNumberTwiceOfOthers {
	public static void main(String[] args) {
		int answer = new LargestNumberTwiceOfOthers().dominantIndex(new int[] { 3, 6, 1, 0 });
	    System.out.println(answer);
	}

	public int dominantIndex(int[] nums) {
		if(nums.length < 2)
			return 0;
		HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>();
		for(int i=0; i< nums.length; i++) {
			indices.put(nums[i], i);
		}
        Arrays.sort(nums);
        int lastButOneNumber = nums[nums.length - 2];
        int lastNumber = nums[nums.length - 1];
        boolean isAtleastTwice = (lastButOneNumber * 2) <= lastNumber;
        if(isAtleastTwice)
        	return indices.get(lastNumber);
        
        return -1;
	}
}
