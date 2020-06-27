package Recursion;

import Trees.TreeNode;

public class MaxDepthBinary_104 {

    public static void main(String[] args) {
        
    }

    public int maxDepth(TreeNode root) {
        if(root == null)
           return 0;

        int leftSum =  maxDepth(root.left);
        int rightSum = maxDepth(root.right);
        int maxHeight =  Math.max(leftSum, rightSum);
        return 1+maxHeight;
        
    }
}