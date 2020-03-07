package Arrays.Easy;

import java.util.Arrays;

public class MajorityElement_169 {
    public static int majorityElement(int[] num) {
        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;

    }
    
    public static int majorityElement_BayersAlgo(int[] num) {
    	int candidateElement = num[0];
    	int count = 1;
    	for(int i=1; i< num.length; i++) {
    		if(num[i] == candidateElement) {
    			 count++;
    		}else {
    			count--;
    		}
    		if(count == 0) {
    			candidateElement = num[i];
    			count++;
    		}
    	}
    	return candidateElement;
    }
    
    public static int majorityElement_IntelligentSort(int[] nums) {
    	Arrays.sort(nums);
    	int majorityElement = nums[nums.length/2];
    	return majorityElement;
    }
    
    public static void main(String[] args) {
    	//majorityElement_BayersAlgo(new int[] {2,3,1,2,3,4,3,5,3,3});
    	majorityElement_IntelligentSort(new int[] {2,3,1,2,3,4,3,5,3,3});
    }
}
