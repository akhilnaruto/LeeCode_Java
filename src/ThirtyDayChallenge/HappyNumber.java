package ThirtyDayChallenge;

import java.util.ArrayList;
import java.util.Stack;

public class HappyNumber {
	public static void main(String[] args) {
		ArrayList<Integer> seenValues = new ArrayList<>();
		boolean result = new HappyNumber().isHappy(3);
		System.out.print(result);
	}

	public boolean isHappy(int n) {
		if (n == 1)
			return true;
		
		if(n == 4)
			return false;
        
		String number = String.valueOf(n);

		char[] digits1 = number.toCharArray();
		// or:
		String[] digits2 = number.split("(?<=.)");

	      
		
		int newNum = 0;
		for(int i=0; i< digits2.length; i++) {
			int num =  Integer.parseInt(digits2[i]);
			newNum += (num * num);
		}

		return isHappy(newNum);	
	}

}
