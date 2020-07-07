package Stacks.Medium;

import java.util.Stack;

public class DailyTemperatures_739 {

    public static void main(String[] args) {
        int[] ans = new DailyTemperatures_739().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }

    Stack<Integer> temperatures = new Stack<>();
    int [] localMaxima =  new int[2];
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }

    
}