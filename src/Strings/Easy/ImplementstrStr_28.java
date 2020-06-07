package Strings.Easy;

/**
 * implementstrStr_28
 */

 /*
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

 */
public class ImplementstrStr_28 {

    public static void main(String[] args) {
        Integer ans = new ImplementstrStr_28().strStr("q", "q");
        System.out.print(ans);
    }

    /*  Approach 1 comparing every time

    public int strStr(String haystack, String needle) {
         Integer hayStackLength  =  haystack.length();
         Integer needleLength =  needle.length();

         if(needleLength > hayStackLength)
            return -1;

         for(int i=0; i< hayStackLength - needleLength +1; i++){
             String subStr = haystack.substring(i, i+needleLength);
             if(subStr.equals(needle))
                return i;
         }  
         return -1; 
    }
    */

    /* two pointer way */
    public int strStr(String haystack, String needle) {
        int hayStackLength = haystack.length();
        int needleLength = needle.length();
    
         // corner case        
        if(needleLength == 0)
           return -1;   
    
        // corner case    
        if(needleLength > hayStackLength)
            return -1;

        int currIndex = 0;
        while(currIndex <= hayStackLength - needleLength){

            // increase curr index till we found first match in needle i.e needle first letter == haystack first letter
            while(currIndex < hayStackLength && haystack.charAt(currIndex) != needle.charAt(0))
                currIndex++;

            // after we found match.. increase walkthrough both haystack and needle till both are same
            int tmpIndex = 0;
            while(tmpIndex <  needleLength &&  currIndex <  hayStackLength && haystack.charAt(currIndex) == needle.charAt(tmpIndex))  {
                tmpIndex++; currIndex++;
            }   
            if(tmpIndex == needleLength) // indicates match is found
               return currIndex-tmpIndex;

            currIndex = currIndex - tmpIndex +1; // if match is not found pre-walk
        }

        return -1;
    }
}