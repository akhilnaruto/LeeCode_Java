package ThirtyDayChallenge;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int res = new SingleNumber().singleNumber(new int[] {9,8,7,8,7,9,1});
		System.out.print(res);
	}

	public int singleNumber(int[] nums) {
	   int result = 0;
       for(int i=0; i< nums.length; i++) {
    	      result ^= nums[i];
       }
       return result;		
	}
}
