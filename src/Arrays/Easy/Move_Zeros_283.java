package Arrays.Easy;

public class Move_Zeros_283 {

    public static void moveZeroes_V1(int[] nums) {
     
    int current =0;
     for(int i=0; i< nums.length; i++) {
    	 if(nums[i] != 0) {
    		nums[current++] = nums[i]; 
    	 }
    	 
     }
     
     for(int i= current; i< nums.length; i++) {
    	 nums[current++] = 0;
     }
 
    }
    
    public static void moveZeroes_V2(int[] nums) {
        
       	int j=0;
        	
        	for(int i=0; i< nums.length; i++) {
        		if(nums[i] != 0) {
        			int nonZeroElement = nums[i];
        			nums[j] = nonZeroElement;
        			nums[i] = 0;
        			j++;
        		}
        	}
     
        }




    public static void main(String[] args) {
    	moveZeroes_V2(new int[]{1,2,3,0,0,4});
    }
}
