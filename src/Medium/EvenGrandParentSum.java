package Medium;

/*
 * Given a binary tree, return the sum of values of nodes with even-valued grandparent.  (A grandparent of a node is the parent of its parent, if it exists.)

If there are no nodes with an even-valued grandparent, return 0.


 */
public class EvenGrandParentSum {
	static int sum ;
    public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(7);
		root.right = new TreeNode(8);
		
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(7);
		root.left.right.left = new TreeNode(1);
		root.left.right.right = new TreeNode(4);
		
		root.left.left.left = new TreeNode(9);
		
		
		
		
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(3);
		
		root.right.right.left = new TreeNode(5);
		
		sumEvenGrandparent(root);
		
	}
    
    public static int sumEvenGrandparent(TreeNode root) {
      
        sum(root, null, null);
        return sum;
    }
    
    public static void sum(TreeNode current, TreeNode parent, TreeNode grandParent) {
    	   if(current == null) return ;
    	   
    	   if(grandParent != null && grandParent.val % 2 == 0)
    		   sum += current.val;
    	
    	   sum(current.left, current, parent);
    	   sum(current.right, current, parent);
    }
}
