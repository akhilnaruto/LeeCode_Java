package Arrays.Easy;

public class Monotonic_Array_896 {

    public static boolean isMonotonic(int[] A) {
        int processedTill  = 0;


        for (int i = 0; i < A.length-1 ; i++) {
            if(A[i] > A[i+1]){
                return itsDecreasing(A, i);
            }
            if(A[i] < A[i+1]){
                return itsIncreasing(A, i);

            }
            if(A[i] == A[i+1]){
                continue;
            }

        }

        return false;
    }

    private static boolean itsDecreasing(int[] A, int shouldProcessFrom){
        for (int i = shouldProcessFrom; i < A.length-1 ; i++) {
              if(A[i] < A[i+1])
                  return false;

        }
        return true;

    }

    private static  boolean itsIncreasing(int[] A, int shouldProcessFrom){
        for (int i = shouldProcessFrom; i < A.length-1 ; i++) {
            if(A[i] > A[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result =  isMonotonic(new int[]{1,3,2});
        System.out.println(result);
    }
}