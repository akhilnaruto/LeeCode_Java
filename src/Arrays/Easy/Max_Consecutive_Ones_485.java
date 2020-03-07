package Arrays.Easy;

public class Max_Consecutive_Ones_485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int maxTillNow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                result++;
             else{
                 result = 0;
            }
            if(result >= maxTillNow){
                maxTillNow = result;
            }
        }
        return maxTillNow;

}
    public static void main(String[] args) {
          int answer = findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1});
          System.out.println(answer);
    }
}
