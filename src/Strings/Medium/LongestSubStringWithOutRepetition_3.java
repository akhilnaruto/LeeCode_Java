package Strings.Medium;

import java.util.HashSet;

public class LongestSubStringWithOutRepetition_3 {

	public int lengthOfLongestSubstring(String s) {
          int result = 0;
          // sliding window technique
          HashSet<Character> container = new HashSet<>();
          int slidingWindowStart = 0;
          int slidingWindowEnd = 0;
          
          while(slidingWindowEnd < s.length()) {
        	     if(!container.contains(s.charAt(slidingWindowEnd))) {
        	    	     container.add(s.charAt(slidingWindowEnd));
        	    	     slidingWindowEnd++;
        	    	     result = Math.max(container.size(), result);

        	     }else {
        	       	 container.remove(s.charAt(slidingWindowStart));
        	      	 slidingWindowStart++;
        	      	 
        	     }
          }
          
          return result;
	}

	public static void main(String[] args) {
          int result = new LongestSubStringWithOutRepetition_3().lengthOfLongestSubstring("abedec");
          System.out.print(result);
	}
}
