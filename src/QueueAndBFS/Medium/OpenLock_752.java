package QueueAndBFS.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenLock_752 {
    
    public static void main(final String[] args) {
        final String[] deadEnds = new String[] { "8887","8889","8878","8898","8788","8988","7888","9888"};
        final String target = "8888";
        final int ans = new OpenLock_752().openLock(deadEnds, target);
        System.out.print(ans);
    }

    Set<String> deadEnds = new HashSet<>();
    Set<String> visited = new HashSet<>();

    public int openLock(final String[] deadends, final String target) {
        for (final String deadEnd : deadends)
            deadEnds.add(deadEnd);

        if (target.equals("0000"))
            return -1;
        final Queue<String> q = new LinkedList<>();
        q.add("0000");
        q.add(null);
        int depth = 0;
        while (!q.isEmpty()) {
            final String currentLock = q.poll();
            if (deadEnds.contains(currentLock))
                continue;

            if(currentLock == null){
                ++depth;
                if(q.peek() != null){
                    q.add(null);
                    continue;
                }
                else 
                  return -1;
                   
            }
               
             
            
                    
            if (currentLock.equals(target))
                return depth;

            for (int i = 0; i < 4; i++) {
                final char currChar = currentLock.charAt(i);
                final Integer newVal = currChar == '9' ? 0 : Integer.parseInt(String.valueOf(currChar)) + 1;

                final String newStr = currentLock.substring(0, i) + newVal.toString()
                        + 
                                currentLock.substring(i+1, currentLock.length());
                
                if(!visited.contains(newStr)){
                    q.add(newStr);
                    visited.add(newStr);
                }
                
                final Integer newVal2 = currChar == '0' ? 9 : Integer.parseInt(String.valueOf(currChar)) - 1;
                final String newStr2 = currentLock.substring(0, i) + newVal2.toString()
                + 
                        currentLock.substring(i+1, currentLock.length());
        
                if(!visited.contains(newStr2)){
                    q.add(newStr2);
                    visited.add(newStr2);
                }
            }

        }
        return depth;
 

        

    }

}