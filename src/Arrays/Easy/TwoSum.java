package Arrays.Easy;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] input= new int[] {2, 7, 11, 15};
        int[] answer =  new TwoSum().twoSum(input, 9);
        System.out.print(answer[0]);
        System.out.print(answer[1]);
	}

	public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
       for(int i=0; i< nums.length; i++) {
    	   int currentNum = nums[i];
    	   int compliment = target - currentNum;
    	   if(hash.containsKey(compliment)) {
    		   int complimentIndex = hash.get(compliment);
    		   return new int[] {complimentIndex, i};
    	   }
    	   hash.put(nums[i], i);
       }
       return null;
	}
	
}
