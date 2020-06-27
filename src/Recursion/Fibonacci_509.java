
package Recursion;

import java.util.HashMap;

/**
 * Fibonacci_509
 */
public class Fibonacci_509 {

    public static void main(String[] args) {
        
    }

    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    public int fib(int N) {
        if(cache.containsKey(N))
           return cache.get(N);
        
        if(N < 2)
           return N;
         
        int result =  fib(N-1) + fib(N-2);
        cache.put(N, result);  
        return result; 
    }
}