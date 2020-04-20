package Stacks.Easy;

/*
 * 7. Reverse Integer
Easy
Share
Given a 32-bit signed integer, reverse digits of an integer.
Input: 123
Output: 321
 */
public class ReverseInteger {

	public static void main(String[] args) {
		int answer = new ReverseInteger().reverse(-131);
	}
	public int reverse(int x) {
//		int a = x/10;
//		int b = x%10;
//        return 0;
		int divisor = x/1;
		int result = 0;
		while(divisor != 0) {
			int remainder = divisor% 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && divisor > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && divisor < -8)) return 0;


			result = (result * 10)+ remainder;
			divisor = divisor/10;
		}
		return result;
	}
}
