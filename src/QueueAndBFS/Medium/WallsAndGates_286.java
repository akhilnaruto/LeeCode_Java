
package QueueAndBFS.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import sun.awt.EmbeddedFrame;
import sun.launcher.resources.launcher;

/**
 * WallsAndGates_286
 */
public class WallsAndGates_286 {

    public static void main(String[] args) {
        int[][] test = new int[][]{
            {2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}
        };

         new WallsAndGates_286().wallsAndGates(test);

    }

    private  final int EMPTY = Integer.MAX_VALUE;
    private  final int GATE = 0;
    private  final int WALL = -1;
    private HashMap<int[], Integer> visited =  new HashMap<>();
    private  final List<int[]> DIRECTIONS = Arrays.asList(
        new int[]{1, 0},
        new int[]{-1, 0},
        new int[]{0, 1},
        new int[]{0, -1}
    );

    // solution 1... queue based
    public void wallsAndGates(int[][] rooms) {
        if(rooms.length == 0) return;

        int rowLength =  rooms.length;
        int colLength = rooms[0].length;

        Queue<int[]> gates = new LinkedList<>();


        for(int row = 0; row < rooms.length; row++){
            for(int col = 0; col< rooms[0].length ; col++){
                if(rooms[row][col] == GATE){
                    gates.add(new int[]{row, col});
                }
            }
        }

        while(!gates.isEmpty()){
            int[] tmp =  gates.poll();
            int currRow = tmp[0];
            int currCol =  tmp[1];
            for(int[] dir : DIRECTIONS){
                int processingRow =  currRow + dir[0];
                int processingCol = currCol + dir[1];
                if(processingRow < 0 || processingCol < 0 || processingRow >= rowLength || processingCol >= colLength ||
                       rooms[processingRow][processingCol] != EMPTY)
                       continue;

                rooms[processingRow][processingCol] =  rooms[currRow][currCol] + 1;
                gates.add(new int[]{processingRow, processingCol});       
            }
        }
    }
}