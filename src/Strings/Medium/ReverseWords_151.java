package Strings.Medium;

public class ReverseWords_151 {
    
    public static void main(String[] args) {
        String output = new ReverseWords_151().reverseWords("a good   example");
        System.out.print(output);
    }

    public String reverseWords(String s) {
        s = s.trim();
        String[] values =  s.split(" ");
        StringBuilder output = new StringBuilder();
        for(int i=values.length-1; i>= 0; i--){
            if(values[i].length() == 0)
              continue;
            output.append(values[i]);
            output.append(" ");
        }
        return output.toString().trim();
    }
}