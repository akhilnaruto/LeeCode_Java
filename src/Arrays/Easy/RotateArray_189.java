package Arrays.Easy;

public class RotateArray_189 {

    public static void main(String[] args) {
        int [] nums = new int[]{-2};
        new RotateArray_189().rotate(nums, 2);
        System.out.print(nums);
    }

    /*  brute force approach
    public void rotate(int[] nums, int k) {
          for(int i=0; i< k; i++){
              int previous = nums[nums.length -1];
              for(int j = 0; j< nums.length; j++){
                  int tmp =  nums[j];
                  nums[j] =  previous;
                  previous =  tmp;
              }
          }
    }
    */
   /*   == using new array
    public void rotate(int[] nums, int k) {
        int[] newNums =  new int[nums.length];
        for(int i =0; i< nums.length; i++){
            int newIndex = (i+k) % nums.length;
            newNums[newIndex] =  nums[i];
        }

        for(int i=0; i< newNums.length; i++){
            nums[i] =  newNums[i];
        }
    }
    */

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k =  nums.length % k;
        reverseArray(0, length-1, nums);
        reverseArray(0, k-1, nums);
        reverseArray(k, length-1, nums);
    }

    private void reverseArray(int from, int to, int[] nums){
        if(from > nums.length || to > nums.length)
           return;
         while(from < to){
             int tmp =  nums[from];
             nums[from] =  nums[to];
             nums[to] =  tmp;
             from++;
             to--;
         }
    }
    
}