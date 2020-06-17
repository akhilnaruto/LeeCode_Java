package Arrays.Easy;

public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int [] input =  new int[]{0,0,1,1,1,2,2,3,3,4};
        new RemoveDuplicates_26().removeDuplicates(input);
        System.out.print(input);
    }

    public int removeDuplicates(int[] nums) {
        int uniq = 1;
        for(int i=1; i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            nums[uniq] =  nums[i];
            uniq++;
        }

        return uniq;
    }


}