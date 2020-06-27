package Recursion;

public class ReverseStringInPlace_344 {
    public static void main(String[] args) {
        
    }

    public void reverseString(char[] s) {
        reverseHelper(0, s.length-1, s);
    }
    
    private void reverseHelper(int from, int to, char[] s){
        if(from >= to)
           return;
        char tmp = s[from];
        s[from] = s[to];
        s[to] = tmp;
        reverseHelper(from++, to--, s);
    }
}