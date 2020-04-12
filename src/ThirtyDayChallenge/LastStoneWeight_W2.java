package ThirtyDayChallenge;

import java.util.Arrays;
import java.util.Collections;

public class LastStoneWeight_W2 {

	public static void main(String[] args) {
		//int ans = new LastStoneWeight_W2().lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1});
		int ans = new LastStoneWeight_W2().lastStoneWeight(new int[] {1, 3});

	}
	public int lastStoneWeight(int[] stones) {
		if(stones.length > 1) {
			int result = smash(stones);
	        return result;
		}
  		return stones[0];
	}
	
	public int smash(int[] input) {
		while(true) {	
			Arrays.sort(input);
			int result = input[input.length - 1] - input[input.length - 2];
			if(input.length == 2)
				return result;
			int[] tmp = new int[input.length - 2 +1];
			
			for(int i= 0; i< input.length -2; i++) {
				tmp[i] = input[i];
			}
			tmp[input.length -2] = result;
			input = tmp;
		}
		
	}
}
