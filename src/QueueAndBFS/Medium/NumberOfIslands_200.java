package QueueAndBFS.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import sun.launcher.resources.launcher;

/**
 * NumberOfIslands_200
 */
public class NumberOfIslands_200 {

    public static void main(String[] args) {
        char[][] input = new char[][]{
            new char[]{'1','1','0','0','0'},
            new char[]{'1','1','0','0','0'},
            new char[]{'0','0','1','0','0'},
            new char[]{'0','0','0','1','1'}
        };
       int ans =  new NumberOfIslands_200().numIslands(input);
       System.out.print(ans);
    }


    private int rowLength = 0;
    private int colLength = 0;
    List<int[]> DIRECTIONS =  Arrays.asList(
        new int[]{1, 0},
        new int[]{-1, 0},
        new int[]{0, 1},
        new int[]{0, -1}
    );
    
    // DFS Approach
     //=============
    // public int numIslands(char[][] grid) {
    //     if(grid == null || grid.length == 0)
    //        return 0;
       

    //     rowLength = grid.length;
    //     colLength = grid[0].length;

    //     int islands = 0;
    //     for(int i=0; i< rowLength; i++){
    //         for(int j=0; j< colLength; j++){
    //             if(grid[i][j] == '1'){
    //                 islands +=1;
    //                 dfs(grid, i, j);
    //             }
    //         }
    //     }
    //     return islands;
    
    // }

    // private void dfs(char[][] grid, int currRow, int currCol){
    //     if(currRow < 0 || currCol <0 || currRow >= rowLength || currCol >= colLength
    //          || grid[currCol][currRow] == '0')
    //          return;
        
    //     grid[currRow][currCol] = '0';     
    //     dfs(grid, currRow + 1, currCol);   
    //     dfs(grid, currRow - 1, currCol);   
    //     dfs(grid, currRow , currCol+1);   
    //     dfs(grid, currRow , currCol-1);   
    // } 



    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0)
           return 0;

        int rowLength = grid.length;
        int colLength = grid[0].length;
        
        int islands = 0;
        Queue<int[]> q = new LinkedList();
        for(int row=0; row < rowLength ; row++){
            for(int col=0; col<colLength ; col++){
                if(grid[row][col] == '1'){
                    ++islands;
                    q.add(new int[]{row, col});
                    while(!q.isEmpty()){
                       int[] tmp =  q.poll();
                       grid[tmp[0]][tmp[1]] = '0';
                       for(int[] dir: DIRECTIONS){
                           int processingRow =  tmp[0] + dir[0];
                           int processingCol =  tmp[1] + dir[1];
                           if(processingRow < 0 || processingCol < 0 || processingRow >= rowLength
                                || processingCol >= colLength)
                                continue;
                            
                           if(grid[processingRow][processingCol] == '1'){
                                   q.add(new int[]{processingRow, processingCol});
                           } 
                       }
                    }
                }
            }
        }
        return islands;

    }
}