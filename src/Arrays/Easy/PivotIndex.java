package Arrays.Easy;

public class PivotIndex {

	public static void main(String[] args) {
		int ans = new PivotIndex().pivotIndex(new int[] {1, 7, 3, 6, 5, 6});
		
		System.out.println(ans);
	}
	public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i : nums)
        	total += i;
        
        int leftSum = 0;
        for(int i =0; i< nums.length ; i++) {
        	int rightSum = (total - nums[i]) - leftSum;
        	boolean isPivot =  rightSum == leftSum;
        	if(isPivot)
        		return i;
        	leftSum += nums[i];
        }
        return -1;
	}
}
