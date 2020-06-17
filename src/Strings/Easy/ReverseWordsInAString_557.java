package Strings.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString_557 {
    public static void main(String[] args) {
        String ans = new ReverseWordsInAString_557().reverseWords("Let's take LeetCode contest");
        System.out.println(ans);
    }

    public String reverseWords(String s) {
       String[] values =  s.trim().split("\\s+");
       StringBuilder output = new StringBuilder();
       for(int i=0; i< values.length; i++){
           String val =  values[i];
          
           output.append(new StringBuilder(val).reverse().toString());
           output.append(" ");
       }
       return output.toString();
    }
}