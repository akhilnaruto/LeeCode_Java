package Medium;

public class ClimbingStairs {

	public static void main(String[] args) {
	     int result = climb_Stairs(0, 3);
	     System.out.println(result);
	}
	
	 public static int climb_Stairs(int i, int n) {
	        if (i > n) {
	            return 0;
	        }
	        if (i == n) {
	            return 1;
	        }
	        int FirstStairSum = climb_Stairs(i + 1, n);
	        int secondStarirSum = climb_Stairs(i + 2, n);
	        return  FirstStairSum + secondStarirSum;
	   }
}
