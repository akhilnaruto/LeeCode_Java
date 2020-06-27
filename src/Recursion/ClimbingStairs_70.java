package Recursion;

import java.util.HashMap;

public class ClimbingStairs_70 {


    public static void main(String[] args) {
        int ans = new ClimbingStairs_70().climbStairs(3);
    }
    public int climbStairs(int n) {
        return climbStairs(0, n);
    }

    private HashMap<Integer,Integer> cache = new HashMap<Integer, Integer>();
    private int climbStairs(int currentStep, int finalStep){
          if(cache.containsKey(currentStep))
             return cache.get(currentStep);

          if( currentStep == finalStep)
              return 1;
          
          if(currentStep > finalStep)
             return 0;   

         int oneStep =  climbStairs(currentStep +1, finalStep) ;
         int twoSteps = climbStairs(currentStep +2, finalStep);
         cache.put(currentStep, oneStep+ twoSteps);
         return oneStep + twoSteps;
    }
    
}