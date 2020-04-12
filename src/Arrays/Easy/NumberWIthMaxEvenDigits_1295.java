package Arrays.Easy;

public class NumberWIthMaxEvenDigits_1295 {

	public int findNumbers(int[] nums) {
     
		int result = 0;
		for(int num: nums) {
			String tmp = new Integer(num).toString();
			if(tmp.length() % 2 == 0)
				result ++;
		}
		return result;
		
	}

	public static void main(String[] args) {
       int result = new NumberWIthMaxEvenDigits_1295().findNumbers(new int[] {12,345,2,6,7896});
	}
}
