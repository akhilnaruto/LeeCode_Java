package Strings.Easy;

public class ReverseString_18 {

    public static void main(String[] args) {
         String hello = "hello";
         char[] s = hello.toCharArray();
         new ReverseString_18().reverseString(s);
         System.out.print(s);
    }

    /*   === iterative way
    public void reverseString(char[] s) {
         helper(s, 0, s.length-1);
    }

    private void helper(char[] s, int left, int right){
        if(left >= right)
            return;

        char tmp =  s[left];
        s[left++] =  s[right];
        s[right--] =  tmp;
        helper(s, left, right);    
    }
    */
    public void reverseString(char[] s) {
        int left =  0; int right =  s.length-1;
        while(left < right){
            char c =  s[left];
            s[left++] =  s[right];
            s[right--] =  c;
        }
    }


}