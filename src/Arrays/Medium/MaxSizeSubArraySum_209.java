package Arrays.Medium;

public class MaxSizeSubArraySum_209 {

    public static void main(String[] args) {
        int ans = new MaxSizeSubArraySum_209().minSubArrayLen(7, new int[]{2,3,1,2,4,3});
    }

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0 ;
        int min =  Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i< nums.length; i++){
             sum += nums[i];
             while(sum >= s){
                 int countTillNow = (i+1) - left;
                 min =  Math.min(min, countTillNow);
                 sum -= nums[left];
                 left++;
             }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }


}